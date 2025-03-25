import java.util.*;
public class basic_ops{
       public static void main(String[] args){

		if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Addition of two nums is: " + (a + b));
        System.out.println("Subtraction of two nums is: " + (a - b));
        System.out.println("Multiplication of two nums is: " + (a * b));
        System.out.println("Division of two nums is: " + (a / b));


       	}
}
