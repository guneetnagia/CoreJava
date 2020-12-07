package guneet.collection.stacks;

public class StackArray {
	public final int MAX = 5;
	public final int MIN = 0;
	int stack[] = new int[MAX];
	int top = 0;
	
	public void push(int number){
		if(!isFull()){
			stack[top] = number;
			top++;
		}
		else{
			System.out.println("Queue is Full");
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			top--;
			int temp = stack[top];
			stack[top] = 0;
			return temp;
		}
		else{
			System.out.println("Queue is Empty");
			return 0;
		}
	}
	
	public Boolean isEmpty(){
		if(top == 0)
			return true;
		return false;
	}
	
	public Boolean isFull(){
		if(top == MAX)
			return true;
		return false;
	}
	
	public void show(){
		for(int x:stack){
			System.out.println(x);
		}
	}
}
