package online.nt;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String R = br.readLine();
         int N = Integer.parseInt(br.readLine().trim());
         String[] P = new String[N];
         for(int i_P = 0; i_P < N; i_P++)
         {
         	P[i_P] = br.readLine();
         }

         String[] out_ = solve(R, N, P);
         for (int i_out_ = 0; i_out_ < out_.length; i_out_++)
         {
         	System.out.println(out_[i_out_]);
         }

         wr.close();
         br.close();
    }
    static String[] solve(String R, int N, String[] P){
       // Type your code here
    	int n = P.length;
        String[] res = new String[n];
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
        
        String date = "2020/01/01";
        Date curr = dateFormat.parse(date+" "+R);
        for(int i=0;i<n;i++){
            Date dt = dateFormat.parse(date+" "+P[i]);
            long diff = curr.getTime() - dt.getTime();
            long sec = diff/1000;
            long min = sec/60;
            long hour = min/60;
            //System.out.println(diff+". "+sec+". "+min+".  "+hour);
            if(hour == 1){
                res[i] = "1 hour ago";
            }
            else if(hour > 0){
                res[i] = hour+" hours ago";
            }
            else if(min == 1){
                res[i] = "1 minute ago";
            }
            else if(min > 1){
                res[i] = min+" minutes ago";
            }
            else if(sec == 1){
                res[i] = "1 second ago";
            }
            else if(sec > 1){
                res[i] = sec+" seconds ago";
            }
            else{
                res[i] = "now";
            }
        }
        }
        catch(Exception e){
 
        }
        
        return res;
    
    }
}