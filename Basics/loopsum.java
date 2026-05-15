package Basics;
import java.util.Scanner;

public class loopsum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int x =Sc.nextInt();
        int sum = 0;
        for (int i=0;i<=x;i++){
            sum += i;
        }
        System.out.println(sum);
        Sc.close();    
    }
    
}
