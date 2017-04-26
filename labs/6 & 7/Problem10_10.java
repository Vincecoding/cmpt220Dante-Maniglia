import java.util.Scanner;
public class Problem10_10{
		
	public static void main(String[] args){
		StackOfIntegers stack = new StackOfIntegers();
		for (int i = 0; i < 21; i++)
			stack.push(i);
		
		while (!stack.empty())
			System.out.println(stack.pop() + " ");
	}
	
}

	class StackOfIntegers{
	int[] elements;
	int size;
	public StackOfIntegers(){
		elements = new int[0];
		size = 0;
	}
	public StackOfIntegers(int capacity){
		elements = new int[capacity];
		size = capacity;
	}
	public boolean empty(){
		return size == 0;
	}
	public int peek(){
		return elements[0];
	}
	public void push(int value){
		int[] temporary = new int[size + 1];
		for(int i = 0; i < size; i ++){
			temporary [i] = elements [i];
		}
		temporary[temporary.length - 1] = value;
		elements = temporary;
		size+= 1;
	}
	public int pop(){
		int n = elements [0];
		int[] temporary = new int[size - 1];
		for(int i = 0; i < size - 1; i ++){
			temporary [i] = elements [i+1];
		}
		elements = temporary;
		size -= 1;
		return n;
	}
	public int getSize(){
		return size;
	}
  }