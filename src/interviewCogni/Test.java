package interviewCogni;

public class Test{
public static void main(String[] args){
  String s1 = "100";  // string pool
  String s2 = "100";   //string pool
  String s3 = new String("100");  // heap  + string pool
  if(s1==s2){
   System.out.println("s1 == s2");  //true
  }
  
  if(s1.equals(s3)){
   System.out.println("s1 equals s3");
  }
 }
}



//"s1 == s2"