import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class warmUp1 {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        int count=0;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]==ar[i+1]){
                i+=1;
                count+=1;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr={1,1,3,1,2,1,3,3,3,3};
        int n=sockMerchant(10,arr);
        System.out.println(n);
    }
}