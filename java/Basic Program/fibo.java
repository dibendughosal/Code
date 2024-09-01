import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Length : ");
        int a = 0, b = 1, count = 2;
        int n = input.nextInt();

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;   
        }
        System.out.println(b);
        
    }
}
