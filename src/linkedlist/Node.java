package linkedlist;

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
