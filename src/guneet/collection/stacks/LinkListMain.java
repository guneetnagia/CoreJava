package guneet.collection.stacks;

public class LinkListMain {
	public static void main(String aaa[]){
		StackLinkListImpl impl = new StackLinkListImpl();
		impl.display();
		impl.push(10);
		impl.push(30);
		impl.push(20);
		impl.display();
		System.out.println(impl.pop());
	}
}
