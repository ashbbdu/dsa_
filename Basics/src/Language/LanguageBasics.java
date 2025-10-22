package Language;

import java.util.Scanner;

public class LanguageBasics {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name !");
//        String name = sc.nextLine();
//        System.out.println("Your name is "+ name);
//        sc.close();

//        Type conversion
//        Implicit

//        int x = 10;
//        double y =  x;
//        System.out.println(y);

//        Explicit

        double x = 10.7;
//        int y =  x;  //lossy conversion

        int y =  (int)x;
        System.out.println(y);


//        final keyword => const can not be changed anywhere

        final int weekdays = 7;


//        Array

        int [] arr = new int[100];
        arr[99] = 10;
        System.out.println(arr[99]);
        System.out.println("Break");
        int i = 0;
        while (i < 5) {
            System.out.println(i+1);
            i++;
        }

//        exception

        try {
            int num1  = 10;
            int num2 = 0;
            int ans = num1 / num2;
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Always execute !");
        }


    }
}
