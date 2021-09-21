import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] arr = new int[3];
        
        while(n>0){
            
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        
        for(int j=0;j<arr.length;j++){
            
           if(Math.abs(arr[0] - arr[2]) > Math.abs(arr[1] - arr[2]) ){
                
                System.out.println("Cat B");
                break;
                
            }else if(Math.abs(arr[0] - arr[2]) < Math.abs(arr[1] - arr[2] )){
                System.out.println("Cat A");
                break;
            }else{
                System.out.println("Mouse C");
                break;
            }
            
        }
        
        n--;
        
        } 
    }
}
