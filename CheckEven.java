import java.util.Scanner;

public class CheckEven {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int valuedInputed = scanner.nextInt();
        if(valuedInputed % 2 == 0){
            System.out.println("Even");
        }  
        else{
            System.out.println("Odd");
        }  
    }
}
