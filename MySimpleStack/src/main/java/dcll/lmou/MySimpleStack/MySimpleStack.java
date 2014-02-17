package dcll.lmou.MySimpleStack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack {
	private ArrayList<String> array;
	
	public MySimpleStack()
	{
		array = new ArrayList<String>();
	}
	
	/**
	* Tests if this stack is empty
	*/
	public boolean isEmpty() {
		return array.isEmpty();
	}
	/**
	* Returns the number of items in this stack.
	*/
	public int getSize() {
		return array.size();
	}
	/**
	* Pushes an item onto the top of this stack.
	* null item is allowed.
	*/
	public void push(String item) {
		array.add(item);
	}
	
	/**
	* Looks at the object at the top of this stack without removing it from the stack.
	*/
	public String peek() throws EmptyStackException {
		return array.get(array.size()-1);
	}
	/**
	* Removes the object at the top of this stack and returns that object as the value of this function.
	* @throws EmptyStackException if this stack is empty.
	*/
	public String pop() throws EmptyStackException {
		if(!array.isEmpty())
			return array.remove(array.size()-1);
		else
			return "";
	}
}