package lab1.task4;
import java.util.Scanner;
public class ArraySumWhile {
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
        int i = 0;
        do {
            sum += Array[i];
            i += 1;
        } while (i < n);
        System.out.println(sum);
        i = 0;
        sum = 0;
        do {
            sum += Array[i];
            i += 1;
        } while (i < n);
        System.out.println(sum);
    }
}
