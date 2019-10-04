import java.util.Scanner;
public class intValidate {
    public static void main(String args[]) {
        boolean isGreater = false;
        int num = 0;
        String Kadin;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer greater than 10: ");
        num = scan.nextInt();
        while(num > 10 && !isGreater)
        {
            System.out.println("It is indeed greater.");
            isGreater = true;
        }
    }
}
