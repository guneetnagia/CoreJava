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
	
	public void pop(){
		if(!isEmpty()){
			top--;
			stack[top] = 0;
		}
		else{
			System.out.println("Queue is Empty");
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
