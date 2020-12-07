package guneet.collection.stacks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackArrayTest {
	StackArray arr = new StackArray();
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void test1(){
		assertEquals(true, arr.isEmpty());
		arr.push(1);
		arr.push(3);
		arr.push(5);
		arr.push(7);
		assertEquals(false, arr.isEmpty());
		assertEquals(7, arr.pop());
		assertEquals(5, arr.pop());
		assertEquals(3, arr.pop());
		assertEquals(1, arr.pop());
		assertEquals(true, arr.isEmpty());
	}
}
