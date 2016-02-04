package linkedlist;

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
	/*Function to insert an element at the end*/
	public void insertAtEnd( int val){
		Node nptr = new Node( val, null);
		size++;
		if(start == null){
			start = nptr;
			end = start;
		}else{
			end.setLink(nptr);
			end = nptr;
		}
	}
	/*Function display elements of linked list*/
	public void display(){
		System.out.print("\nSingly linked list = ");
		if(size==0){
			System.out.print("\nEmpty linked list \n");
		}
		if(start.getLink()==null){
			System.out.print(start.getData());
			return;
		}
		Node ptr = start;
		System.out.println(start.getData() + "->");
		ptr = start.getLink();
		while(ptr.getLink()!=null){
			System.out.print(ptr.getData());
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "->");
	}
	/*Function to delete an element at a given point*/
	public void delete( int val ){
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
	

}
