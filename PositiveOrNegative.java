import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num= input.nextInt();

        //Brute Method
        // if(num==0){
        //     System.out.println("Zero");
        // }
        // else if (num > 0)
        //     System.out.println("Positive");
        // else
        //     System.out.println("Negative");

        //Ternary Method
        String result = num>=0?(num==0?"Zero":"Positive"):"Negative";
        System.out.println(result);
        input.close();


    }
}