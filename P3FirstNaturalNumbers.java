import java.util.Scanner;

public class P3FirstNaturalNumbers {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //Loop
        int result =0 ;
        // for(int i = 0;i<=num; i++){
        //     result +=i;
        // }

        //Formulae
        // result  = (num * (num + 1 ) )/2;
        // System.out.println(result);
        System.out.println(sumOfN(5));
        

        
    }
    
    // Recursion
     static int result =0;
     public static int sumOfN(int num) {
        if(num!=0) 
        {
            result += num--;
            sumOfN(num);
        }
        return result;
        
        
    }
}
