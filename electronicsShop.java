import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int budget = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        
      
        Integer[] keyboards = new Integer[n];
        
          
        for(int key=0;key<n;key++){
            keyboards[key] = in.nextInt();
        }
       
        int[] drives = new int[m];

        for(int drive=0;drive<m;drive++){
            drives[drive] = in.nextInt();
        }
        
        // Following 2 lines are dealing with time
        Arrays.sort(keyboards, Collections.reverseOrder());//Descending order
        Arrays.sort(drives);//Ascending order
        
        int max=-1;
        
        
        for(int i = 0 , j=0; i < n; i++){
            for(; j < m; j++){
                if(keyboards[i]+drives[j] > budget) {
                    break;
                }; 
                
                if(keyboards[i]+drives[j] > max)
                {
                    max = keyboards[i]+drives[j];
                }
            }
        }
        
        System.out.println(max);
        
        
        
        
    }
}
