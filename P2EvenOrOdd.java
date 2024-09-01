import java.util.Scanner;

public class P2EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //Brute Method
        // if(num%2 == 0) System.out.println("Even");
        // else System.out.println("Odd");

        //Ternary Operator
        // String result = num % 2 == 0 ? "Even" : "Odd";
        // System.out.println(result);

        
        //Bitwise Operator
        
        String result2 =  (num&1)== 1 ? "Odd" : "Even";
        System.out.println(result2);

        input.close();
    }
}
