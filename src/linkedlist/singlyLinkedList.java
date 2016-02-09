package linkedlist;

import java.util.*;
import javax.swing.*;

/*Class singlyLinkedList*/
public class singlyLinkedList{
	
	
	
	public static void main(String[] args) {
	//This scanner gets the input from the user in order to 
	//to determine what action to take
	Scanner scan = new Scanner(System.in);
	linkedlist list = new linkedlist();
	
	System.out.print("\nSingly Linked List Tes\n");
	
	char ch;
	do{
		//Various options for interacting with the linked list
		String str = JOptionPane.showInputDialog("\nSingly Linked List\n"
				+ "1. Insert at begining\n"
				+ "2.Insert at end\n"
				+ "3. Insert at some position\n"
				+ "4. Delete at some position\n"
				+ "5. Check empty\n"
				+ "6. Get size\n"
				+ "7. Display Linked List");
		/*
		System.out.println("\nSingly Linked List Operations\n");
		System.out.println("1. insert at the begining");
		System.out.println("2. Insert at the end");
		System.out.println("3. Insert at some position");
		System.out.println("4. Delete at position");
		System.out.println("5. Check empty");
		System.out.println("6. Get size");
		System.out.println("7. Display Linked list");
		int choice = scan.nextInt();
		*/
		
		int choice = Integer.parseInt(str);
		switch( choice ){
		//switch statement to interact with the linked list
		case 1 :
			JOptionPane.showInputDialog("Enter int element to insert ");
			list.insertAtStart(scan.nextInt());
			break;
		case 2 :
			JOptionPane.showInputDialog("Enter int element to insert ");
			list.insertAtEnd(scan.nextInt());
			break;
		case 3 :
			JOptionPane.showInputDialog("Enter the element ");
			break;
		case 4 :
			JOptionPane.showInputDialog("Enter the position to delete ");
			list.delete(scan.nextInt());
			break;
		case 5 :
			if(list.isEmpty()==true)
			{
				JOptionPane.showMessageDialog(null,"The list is empty ");
			}else{
				JOptionPane.showMessageDialog(null,"The list has some elements ");
			}
			
			list.insertAtEnd(scan.nextInt());
			break;
		case 6 :
			JOptionPane.showInputDialog("The size of the array is " + linkedlist.size);
			break;
		case 7 :
			list.display();
			break;
		}
		JOptionPane.showInputDialog("\nDo you want to continue Y/N \n");
		ch = scan.next().charAt(0);		
	}while(true);
	}
}