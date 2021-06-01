y package online;

import java.util.Map;

/*
 * data structure of N capacity with LRU(Least recently used) mechanism

ex: datastructure of size 2

.put(1, A); // {1=A}
.put(2, B); // {1=A, 2=B}
.get(1);    // return A
.put(3, C); // LRU key was 2, key 2 is removed,{1=A, 3=C}
.get(2);    // if not found,returns null 
.put(4, D)  // LRU key was 1, key 1 is removed , {4=D, 3=C}
.get(3);    // return C

 */
public class Test4 {
// size limit
	// count is mandatory
	// remove oldest - if size is full
	//read 
	//
	Map<Map<Integer,String>, Integer> map
	
	Map<Integer,String> map1
	
	Map<Integer,Integer> map2
	
	consumed_size = 0
	volatile priority  = 0
	lowest(key)
	push() {
		if(consumed_size==N) {
			//remove the least priorty
			map1.remove(1)
			map2.remove(1)
		}
		else{
			map1.put(1,A)
			map2.put(1,priority++)
		}
		consumed_size++;
		
	}
	
	sync get() {
		map1.get(1);
		map1.remove(1)
		map2.remove(1)
		map1.put(1,A)
		map2.put(1,priority++)
	} 

}


Find most frequently occurred word(s) in the following statement,
"XYZ is employee of ABC company, Xyz is from blore, XYZ! is good in java."

map<String,Integer>

for(each word) {
	
	if(map.containsKey(toLower(word))) {
		
		put(map.get(word)+1)
		 3 = get(max)
		 max_occurance
	}
	else {
		map.put(word,1)
	}
}


for(map) {
	if(value = ==max_occurance)
}
















