public class DynamicStack {
    private Node top;
	
//	Constructure
	public DynamicStack() {
		this.top = null;
	}

//	Is the stack empty?
	public boolean isEmpty() {
		if(this.top == null)
			return true;
		else 
			return false;
	}
	
//	Insert data
	public void push(int elem) {
		Node newNode = new Node(elem);
		
		Node aux = top;
		
		newNode.next = aux;
		
		this.top = newNode;

        this.QuantityElem = QuantityElem+1;
	}

	
//	Remove the element
	public int pop() {
		if(this.isEmpty()) {
			System.out.println("Empty Stack!");
			return -1;
		}
		
		Node aux = top; //Current top position
		top = top.next; //Get next item from the stack and put it on the top of the stack
		return aux.data;
	}
    
}
