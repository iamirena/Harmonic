package lab1.task3;
import java.util.Scanner;
public class ArraySumFor {
    public static void main(String[] args){
        int[] Array;
        int k;
        int sum = 0;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Array = new int[n];
        for(int i = 0; i <n; i++){
            k = in.nextInt();
            Array[i]=k;
        }
        for (int i = 0; i<n;i++){
            sum += Array[i];
        }
        System.out.println(sum);
    }

}
