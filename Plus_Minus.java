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
    int posetivecount=0;
    int negativecount=0;
    int zerocount=0;
    for(int i=0; i< arr.size(); i++){
        if(arr.get(i)>0){
            posetivecount++;
        }
        else if(arr.get(i)<0){
            negativecount++;
        }
        else if (arr.get(i)==0){
            zerocount++;
        }
    }
float posval= (float) posetivecount/arr.size();
float negval= (float) negativecount/arr.size();
float zeroval= (float) zerocount/arr.size();
    
    System.out.println(posval + "\n" + negval + "\n" + zeroval);
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
