/**
 * Count frequencies of all elements in array in O(1) extra space and O(n) time
 */

package arrayCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample2 {
	public static void main(String sss[]){
		List<Integer> list  = new ArrayList<Integer>();
		list.add(1);list.add(1);
		list.add(2);list.add(2);list.add(2);
		list.add(3);list.add(3);list.add(3);list.add(3);

		Sample2 sam = new Sample2();
		sam.checkFreq(list);
	}
	void checkFreq(List<Integer> list){
		List<Integer> newList = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size();j++){

			}

		}
	}
}
