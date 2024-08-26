//import stuff here
import java.util.Scanner;
//Your code here
public class Program7{
    public static void main(String[] args){
        //input
        Scanner scan1 = new Scanner(System.in);
        double schruteBuck;
        double klevin;
        double staneleyNickels;
        System.out.println("Enter schrute-bucks:");
        schruteBuck = scan1.nextInt();
        System.out.println("Enter klevins:");
        klevin = scan1.nextInt();
        System.out.println("Enter staneley-nickels:");
        staneleyNickels = scan1.nextInt();
        
        //calculate
        
        klevin += staneleyNickels/12.0;
        schruteBuck +=  klevin/20.0;
        schruteBuck = Math.round(100.0*schruteBuck)/100.0;
        
        //Print
        
        System.out.println("Decimal schrute-bucks = $"+schruteBuck);
        
    }
}
//Paste console output below:
/*
Enter schrute-bucks:
7
Enter klevins:
17
Enter staneley-nickels:
9
Decimal schrute-bucks = $7.89
*/
