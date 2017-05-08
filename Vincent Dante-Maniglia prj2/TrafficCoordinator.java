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
//Vincent Dante-Maniglia
public class TrafficCoordinator extends Application{
	int sceneWidth = 300;
	int sceneHeight = 250;
	Pane pane = new Pane();
	ArrayList<Car> cars = new ArrayList<Car>();//ArrayLists of cars are created here
	ArrayList<Car> othercars = new ArrayList<Car>();
	TrafficLight trafficlight1;//TrafficLights are initialized here
	TrafficLight trafficlight2;
	
	@Override
	public void start(Stage stage){//opens up the program
		Text title = new Text(sceneWidth/2 - 70, 20, "Traffic Coordinator");//Title is created here
		title.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		title.setFill(Color.BLUE);
		pane.getChildren().add(title);
		
		Button startButton = new Button("Start");//activates the start button and enables it to be clicked in order to start the game
		startButton.setLayoutX(sceneWidth/2 - 15);
		startButton.setLayoutY(sceneHeight/2);
		startButton.setOnAction(e -> startGame());
		pane.getChildren().add(startButton);//the start button is added to the pane
		
		Scene scene = new Scene(pane, sceneWidth, sceneHeight);// Scene is created here
		stage.setTitle("Traffic Coordinator");
		stage.setScene(scene);
		stage.show();
	}
	
	void startGame(){
		pane.getChildren().clear();//removes title and start button and commences game
		
		Rectangle Road1 = new Rectangle(125,0,50,sceneHeight);//First Road is created here
		Road1.setFill(Color.GREY);
		pane.getChildren().add(Road1);
		
		Rectangle Road2 = new Rectangle(0,100,sceneWidth,50);//Second Road is created here
		Road2.setFill(Color.GREY);
		pane.getChildren().add(Road2);
		
		Car car1 = new Car(130,50,false);//the first car is created
		car1.setFill(Color.YELLOW);// this adds color
		pane.getChildren().add(car1);//vertical car1
		cars.add(car1);
		
	
		Car car = new Car(155,50,true);// the next cars are created
		car.setFill(Color.GREEN);// this adds color
		pane.getChildren().add(car);
		cars.add(car);
		
		Car car2 = new Car(0,105,true,true);//horizontal cars are created here
		car2.setFill(Color.GREEN);
		pane.getChildren().add(car2);
		othercars.add(car2);
		
		Car car3 = new Car(0,130,false,true);
		car3.setFill(Color.YELLOW);
		pane.getChildren().add(car3);
		othercars.add(car3);
		
		trafficlight1 = new TrafficLight(25, 25);// the traffic light is created here
		trafficlight1.displayTrafficLight(pane);
		
		trafficlight1.setOnMouseClicked(e -> changeLight(trafficlight1));// this allows the light to be clicked and it changes from green to red
		
		trafficlight2 = new TrafficLight(200, 175);
		trafficlight2.displayTrafficLight(pane);
		
		trafficlight2.setOnMouseClicked(e -> changeLight(trafficlight2));
		
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
			if(trafficlight1.getColor().equals(Color.RED) && !((cars.get(i).getY() >=100 && cars.get(i).getY() <=150) || (cars.get(i).getHeight() + cars.get(i).getY() <=150 && cars.get(i).getHeight() + cars.get(i).getY() >=100))){ // this if statement makes it so the cars only stop after crossing the intersection on the vertical road
				cars.get(i).setSpeed(0);//This makes the cars in the vertical road stop
			}
			else if(trafficlight1.getColor().equals(Color.GREEN) && Math.abs(cars.get(i).getSpeed()) < cars.get(i).getMaxSpeed()){
				if(cars.get(i).getMovingNorth() == false)
					cars.get(i).setSpeed(cars.get(i).getSpeed()+1);
				if(cars.get(i).getMovingNorth() == true)
					cars.get(i).setSpeed(cars.get(i).getSpeed()-1);//Speed value is set here
			}
			if(cars.get(i).getY() >= sceneHeight && cars.get(i).getMovingNorth() == false){//this teleports cars in the vertical road back to their original position
				cars.get(i).setY(-25);
				cars.get(i).colorSwitch();
			}
			if(cars.get(i).getY() + cars.get(i).getHeight() <=0 && cars.get(i).getMovingNorth() == true){
				cars.get(i).setY(sceneHeight +10);
				cars.get(i).colorSwitch();
			}
			cars.get(i).setY(cars.get(i).getY()+cars.get(i).getSpeed());//Cars are set into motion here
		}
		
		for(int i = 0; i < othercars.size(); i++) {
			if(trafficlight2.getColor().equals(Color.RED)&& !((othercars.get(i).getX() >=125 && othercars.get(i).getX() <=175) || (othercars.get(i).getWidth() + othercars.get(i).getX() <=175 && othercars.get(i).getWidth() + othercars.get(i).getX() >=125))){ // this if statement makes it so the cars only stop after crossing the intersection on the horizontal road
				othercars.get(i).setSpeed(0);
			}
			else if(trafficlight2.getColor().equals(Color.GREEN) && Math.abs(othercars.get(i).getSpeed()) < othercars.get(i).getMaxSpeed()){
				if(othercars.get(i).getMovingWest() == false)
					othercars.get(i).setSpeed(othercars.get(i).getSpeed()+1);
				if(othercars.get(i).getMovingWest() == true)
					othercars.get(i).setSpeed(othercars.get(i).getSpeed()-1);
			}
			if(othercars.get(i).getX() >= sceneWidth && othercars.get(i).getMovingWest() == false){
				othercars.get(i).setX(-25);
				othercars.get(i).colorSwitch();
			}
			if(othercars.get(i).getX() + othercars.get(i).getWidth() <=0 && othercars.get(i).getMovingWest() == true){
				othercars.get(i).setX(sceneWidth +10);
				othercars.get(i).colorSwitch();
			}
			othercars.get(i).setX(othercars.get(i).getX()+othercars.get(i).getSpeed());
		}
	}
}


class Car extends Rectangle{
	static int width = 15;
	static int height = 20;
	int speed = 0;
	int maxSpeed = 10;
	boolean movingNorth;
	boolean movingWest;
	
	//vertical car constructor: int, int, boolean
	public Car(int x, int y, boolean north){
		super(x, y, width, height);
		movingNorth = north;
	}

	//horizontal car constructor: int, int, boolean, boolean
	public Car(int x, int y, boolean west, boolean otherdirection){ //otherdirection is there as a placeholder to differentiate the horizontal and vertical constructors of the cars
		super(x, y, height, width);
		movingWest = west;
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
	
	public boolean getMovingWest() {
		return movingWest;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void colorSwitch() {
		int color = (int)(Math.random()*13);
		switch (color){
			case 0 : setFill(Color.BLUE); break;
			case 1 : setFill(Color.RED); break;
			case 2 : setFill(Color.PURPLE); break;
			case 3 : setFill(Color.BEIGE); break;
			case 4 : setFill(Color.CYAN); break;
			case 5 : setFill(Color.AQUAMARINE); break;
			case 6 : setFill(Color.BROWN); break;
			case 7 : setFill(Color.DARKCYAN); break;
			case 8 : setFill(Color.GOLD); break;
			case 9 : setFill(Color.ORANGE); break;
			case 10 : setFill(Color.PALEGREEN); break;
			case 11 : setFill(Color.GREEN); break;
			case 12 : setFill(Color.YELLOW); break;
		}
	}
}
class TrafficLight extends Circle{
	static int radius = 10;
	Color color = Color.GREEN;
	Rectangle post;
	Rectangle box;
	
	public TrafficLight(int x, int y){
		super(x, y, radius);
		setFill(color);
		post = new Rectangle(x-10,y-7,5,25);
		box = new Rectangle(x-15,y-10,10,30);
		box.setFill(color.GREY);
	}
	
	public Color getColor() {
		return color;  
	}  
	
	public void setColor(Color c){
		color = c;
		setFill(color);
	}
	
	public Rectangle getPost(){
		return post;
	}
	
	public void displayTrafficLight(Pane pane){
		pane.getChildren().add(box);
		pane.getChildren().add(post);
		pane.getChildren().add(this);
	}
}
