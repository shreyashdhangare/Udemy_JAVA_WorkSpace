import java.util.Scanner;

public class Main {

    public static int FactorialFunction(int Number){

        if(Number == 0){
            return 1;
        }
        else{
                return ( FactorialFunction(Number - 1));
        }


    }


    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        number = scanner.nextInt();
        number = FactorialFunction(number);

        System.out.println("The factorial is :: " + number);


    }
}
