package linkedlist;
import java.util.Scanner;

class Node{
	
	protected int data;
	protected Node link;
	
	/* Constructor */
	public Node() {
		link = null;
		data=0;
	}
	/*Overloaded Constructor*/
	public Node(int d, Node n) {
		data = d;
		link = n;
	}
	/*Function to set link to next node*/
	public void setLink ( Node n ){
		link = n;
	}
	/*Function to set the data to current node*/
	public void setData ( int d ){
		data = d;
	}
	/*Function to get link to next node*/
	public Node getLink( ){
		return link;
	}
	/*Function to get the data from the current node*/
	public int getData( ){
		return data;
	}	
	
}
class linkedlist {
	
	protected Node start;
	protected Node end;
	public int size;
	
	/*Default Constructor*/
	public linkedlist(){
		start = null;
		end = null;
		size = 0;		
	}
	public boolean isEmpty(){
		return start==null;
	}
	/*Function to insert an element at the beginning of the list*/
	public void insertAtStart( int val ){
		Node nptr = new Node(val, null);
		size++;
		if(start == null){
			start = nptr;
			end = start;
		}else{
			nptr.setLink(start);
			start = nptr;
		}
		
	}
	public static void main(String[] args) {
		// This is my main method, it will be the starting point
		

	}

}
