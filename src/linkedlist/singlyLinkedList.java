package linkedlist;

import java.util.*;

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
		System.out.println("\nSingly Linked List Operations\n");
		System.out.println("1. insert at the begining");
		System.out.println("2. Insert at the end");
		System.out.println("3. Insert at some position");
		System.out.println("4. Delete at position");
		System.out.println("5. Check empty");
		System.out.println("6. Get size");
		System.out.println("7. Display Linked list");
		
		int choice = scan.nextInt();
		switch( choice ){
		//switch statement to interact with the linked list
		case 1 :
			System.out.println("Enter int element to insert ");
			list.insertAtStart(scan.nextInt());
			break;
		case 2 :
			System.out.println("Enter int element to insert ");
			list.insertAtEnd(scan.nextInt());
			break;
		case 3 :
			System.out.println("Enter the element ");
			break;
		case 4 :
			System.out.println("Enter the position to delete ");
			list.delete(scan.nextInt());
			break;
		case 5 :
			if(list.isEmpty()==true)
			{
				System.out.println("The list is empty ");
			}else{
				System.out.println("The list has some elements ");
			}
			
			list.insertAtEnd(scan.nextInt());
			break;
		case 6 :
			System.out.println("The size of the array is " + linkedlist.size);
			break;
		case 7 :
			list.display();
			break;
		}
		System.out.println("\nDo you want to continue Y/N \n");
		ch = scan.next().charAt(0);		
	}while(true);
	}
}