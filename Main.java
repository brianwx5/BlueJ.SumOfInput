/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
  
    
    public static void main(){
    Scanner scanner = new Scanner(System.in);
    int i;
    int input = 0;
    int total = 0;
    System.out.println("Enter a number from 1 to n in order to get the sum of the numbers");
    input = scanner.nextInt();
        for(i = 1; i <= input; i++) {
        total = total + i;
        if(i == input) {
        System.out.println("Your sum is " + total); }
        
    }
   
    }
}
