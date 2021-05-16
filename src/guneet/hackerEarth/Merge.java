package guneet.hackerEarth;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* 
3
4

5 Datta 10 Ravi 18 Sangram
2 Mayur 5 Archana 7 Amber 9 Shweta
1 Jishant 12 Divesh 15 Darshhan



5 Datta 10 Ravi 18 Sangram
5 Archana 7 Amber 9 Shweta
12 Divesh 15 Darshhan

5 2
2 12

final : 1   2
mergeSort()
   
    1 Jishant
    2 Mayur
    4 Tejal
    5 Datta
    5 Archana
    7 Amber
    9 Shweta
    10 Ravi
    12 Divesh
    15 Darshan

*/



public class Merge {

    static class Student {
        int rollNumber;
        String name;
        
        public Student(int rollNumber, String name){
            this.rollNumber = rollNumber;
            this.name = name;
        }
    }
    
    class ByRollNumber implements Comparator<Student> {
        
        //return smaller rollnumber
        @Override
        public int compare(Student s1, Student s2){
            return s1.rollNumber > s2.rollNumber ? s2.rollNumber : s1.rollNumber;
         }
        
    }
    

    static List<Student> merge(List<List<Student>> sortedStudentLists) {
        List<Student> lst = new ArrayList<>(); 
        
        // while adding in list, add at correct place
        for (List<Student> l: sortedStudentLists){
            //System.out.println(l);
          
            for(Student s : l){
                System.out.println(s.rollNumber);
              
            }    
         //   printStudents(l);
         
        }
        return lst;
   }

 public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n;
        n = Integer.parseInt(in.nextLine());
        List<List<Student>> studentLists = new ArrayList<>(); 
        for (int i=0;i< n;i++){
            List<Student> lst = new ArrayList<>();
            int j = Integer.parseInt(in.nextLine());
            String s = in.nextLine();
            String data[] = s.split(" ");
            for (int k=0; k<j*2;){
                lst.add(new Student(Integer.parseInt(data[k++]), data[k++]));
            }
            studentLists.add(lst);
        }
        List<Student> mergedLst  = merge(studentLists);
        printStudents(mergedLst);
   }
   
   public static void printStudents(List<Student> lst){
       for(int i=0;i<lst.size();i++){
           System.out.println(lst.get(i).rollNumber +" "+ lst.get(i).name);
       }
   }
   
   
   
   
}
