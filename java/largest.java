import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int num1 = inp.nextInt();
        System.out.println("Enter 2nd Number:");
        int num2 = inp.nextInt();
        System.out.println("Enter 3rd Number:");
        int num3 = inp.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        else if (num3>max) {
            max = num3;
        }
        System.out.println("The Largest No. is: "+max);


        

    }
}
