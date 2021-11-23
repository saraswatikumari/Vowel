import java.sql.Array;
import java.util.Scanner;

import static java.sql.Array.*;

    public class A {
        public static void main(String[] args) {
            int a[]=new  int[5];
            Scanner r=new Scanner(System.in);
            System.out.println("Enter data  in Array");
            for(int i=1;i<a.length;i++){
                a[i]=r.nextInt();
                //Array.sort(); o/p= print in assending order
            }
            for(int i=0;i<5;i++){
                System.out.println(a[i]+" ");
            }
        }
    }


