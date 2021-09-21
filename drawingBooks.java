import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        
    
        int totalpages_fromfront = n/2;
        int targetpages_frontcount = p/2;   
        
        int targetpages_backcount = n/2-p/2;
         
        return Math.min(targetpages_frontcount,targetpages_backcount); 
        
        
    
        
    // Write your code here
    // int fcount=0,lcount=0;
    // int mini=999;
    // int i;
    
    // This logic dont work because of 2 pages which can't be considered as an array
    //     for(i=1;i<=n;i++){
    //         if(i==p){
    //             fcount++; 
    //             break;
    //         }
    //     }
        
    //     for(i=n;i>0;i--){
    //         if(i==p){
    //             lcount++; 
    //             break;
    //         }
    //     }
      
    //   if(fcount>lcount){
    //       return lcount;
    //   }  
    //   else{
    //       return fcount;
    //   }
      
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

