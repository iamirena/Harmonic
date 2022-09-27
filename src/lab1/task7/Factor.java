package lab1.task7;
import java.util.Scanner;
public class Factor {
    public static int Factorial(int a){
        int b = 1;
        while (a!=0){
            b = b*a;
            a = a - 1;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println(Factorial(x.nextInt()));
    }
}
