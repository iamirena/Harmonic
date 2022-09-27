package lab1.task6;
import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args){
        int i;
        double sum = 0;
        double p = 0;
        for (i = 1; i <= 10; i++){
            p = 1.0/i;
            sum += p;
            System.out.printf("\n%.2f",p);
        }
        System.out.printf("\n%.2f",sum);
        System.out.println("Привет Гитхаб");
    }
}
