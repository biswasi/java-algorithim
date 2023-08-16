public class ImplementStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ImplementStack stack = new ImplementStack(5);
       stack.push(3);stack.push(5);stack.push(8);
       System.out.print("Stack: ");
       stack.printStack();stack.pop();
       System.out.println("\nAfter popping out");
       stack.printStack();
	}
	
		private int top;
		private int [] stackArray;
		private int capacity;
		
		public ImplementStack(int size)
		{
			stackArray=new int[size];
			capacity=size;
			top=-1;
		}
		public void push(int x)
		{
			if(isFull())
			{
				System.out.println("Stack is full");				
			}
			else
			{
				System.out.println("Inserting " + x);
				stackArray[top++]=x;
			}
		}
		public int pop()
		{
			if(isEmpty())
			{
				System.out.println("Stack is empty");
			}
			return stackArray[top--];
		}
		public int getSize()
		{
			return top+1;
		}
		public boolean isEmpty()
		{
			return top==-1;
		}
		public boolean isFull()
		{
			return top==capacity -1;
		}
		
		public void printStack()
		{
			for(int i=0; i<= top; i++) {
				System.out.print(stackArray[i] + ", ");
			}
		}
	}


