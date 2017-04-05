import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.util.ArrayList;

public class TrafficCoordinatorDemo extends Application{
	int sceneWidth = 300;
	int sceneHeight = 250;
	Pane pane = new Pane();
	ArrayList<Car> cars = new ArrayList<Car>();
	TrafficLight trafficlight1;
	
	@Override
	public void start(Stage stage){//opens up the program
		Text title = new Text(sceneWidth/2 - 70, 20, "Traffic Coordinator");
		title.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		title.setFill(Color.BLUE);
		pane.getChildren().add(title);
		
		Button startButton = new Button("Start");//activates the start button and enables it to be clicked in order to start the game
		startButton.setLayoutX(sceneWidth/2 - 15);
		startButton.setLayoutY(sceneHeight/2);
		startButton.setOnAction(e -> startGame());
		pane.getChildren().add(startButton);//the start button is added to the pane
		
		Scene scene = new Scene(pane, sceneWidth, sceneHeight);
		stage.setTitle("Traffic Coordinator");
		stage.setScene(scene);
		stage.show();
	}
	
	void startGame(){
		pane.getChildren().clear();
		
		
		Car car1 = new Car(50,50);//the first car is created
		car1.setFill(Color.YELLOW);// this adds color
		pane.getChildren().add(car1);
		cars.add(car1);
		
		for(int i = 100; i < sceneWidth; i+= 25){
			Car car = new Car(i,50);// the next cars are created
			car.setFill(Color.GREEN);// this adds color
			pane.getChildren().add(car);
			cars.add(car);
		}
		
		trafficlight1 = new TrafficLight(10, 10);// the traffic light is created here
		pane.getChildren().add(trafficlight1);
		
		trafficlight1.setOnMouseClicked(e -> changeLight(trafficlight1));// this allows the light to be clicked and it changes from green to red
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(25), e -> moveCar()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
	}
 
	void changeLight(TrafficLight light) {
		if(light.getColor().equals(Color.GREEN)){
			light.setColor(Color.RED);
		}
		else if(light.getColor().equals(Color.RED)){
			light.setColor(Color.GREEN);
		}
	}
	
	void moveCar(){
		for(int i = 0; i < cars.size(); i++) {
			if(trafficlight1.getColor().equals(Color.RED)){
				cars.get(i).setSpeed(0);
			}
			else if(trafficlight1.getColor().equals(Color.GREEN) && Math.abs(cars.get(i).getSpeed()) < cars.get(i).getMaxSpeed()){
				if(cars.get(i).getMovingNorth() == false)
					cars.get(i).setSpeed(cars.get(i).getSpeed()+1);
				if(cars.get(i).getMovingNorth() == true)
					cars.get(i).setSpeed(cars.get(i).getSpeed()-1);
			}
			if(cars.get(i).getY()<=0 || cars.get(i).getY() >= sceneHeight - cars.get(i).getHeight()){//car is at y=0 then change direction.
				cars.get(i).setSpeed(cars.get(i).getSpeed()*-1);
				cars.get(i).setMovingNorth(!cars.get(i).getMovingNorth());
			}
			cars.get(i).setY(cars.get(i).getY()+cars.get(i).getSpeed());
		}
	}
}


class Car extends Rectangle{
	static int width = 15;
	static int height = 20;
	int speed = 0;
	int maxSpeed = 10;
	boolean movingNorth;
	
	public Car(int x, int y){
		super(x, y, width, height);
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean getMovingNorth() {
		return movingNorth;
	}
	
	public void setMovingNorth(boolean north) {
		movingNorth = north;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
}
class TrafficLight extends Circle{
	static int radius = 10;
	Color color = Color.GREEN;
	
	public TrafficLight(int x, int y){
		super(x, y, radius);
		setFill(color);
	}
	
	public Color getColor() {
		return color;  
	}  
	
	public void setColor(Color c){
		color = c;
		setFill(color);
	}
	
}