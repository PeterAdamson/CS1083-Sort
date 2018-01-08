//Author Peter Adamson

import java.util.ArrayList;

public class Assn3Q1Stack{

	private ArrayList<Integer> myStack = new ArrayList<>();
	
	public void push(int item){
		myStack.add(0, item);
	}

	public int pop(){
		return myStack.remove(0);
	}

	public int peek(){
		return myStack.get(0);
	}

	public int elementAt(int index){
		return myStack.get(index);
	}

	public int size(){
		return myStack.size();
	}

	public boolean empty(){
		return myStack.isEmpty();
	}

}
