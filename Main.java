import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         int number1;
         int number2;
         int result =0;
         String Key;
        System.out.println("please inter two numbers");
        Scanner input = new Scanner(System.in);
        number1 =input.nextInt();
        number2 =input.nextInt();
        Key = input.next();
        switch (Key) {
            case "+":
             result= number1+number2;
                break;
            case "*":
                result= number1*number2;
                break;
            case "/":
                result=number1/number2;
                break;
            case "-":
                 result = number1 /number2;
             break;
             default:
               System.out.print("please enter a valid operation side");
                 break;


        }
        System.out.print("result is \n "+ result);

    }}


