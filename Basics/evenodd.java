package Basics;
import java.util.*;
public class evenodd{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int x =Sc.nextInt();
        if (x % 2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
        Sc.close();

    }
}