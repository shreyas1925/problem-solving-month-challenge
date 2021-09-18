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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int pos=0,neg=0,neu=0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                pos++;
            }else if(arr.get(i)<0){
                neg++;
            }else{
                neu++;
            }
        }
        
        float posavg = pos/arr.size();
        float negavg = neg/arr.size();
        float neuavg = neu/arr.size();
        
        System.out.println(posavg);
        System.out.println(negavg);
        System.out.println(neuavg);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
