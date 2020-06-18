import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class arrays4 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int newArr[]=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            newArr[arr[i]-1]=i;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                int t=newArr[i];
                arr[t]=arr[i];
                arr[i]=i+1;
                newArr[arr[t]-1]=newArr[i];
                newArr[i]=i;
                count+=1;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
