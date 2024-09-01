public class countNumbers {
    public static void main(String[] args) {
        int number = 16788;
        int count=0;

        while(number > 0){
            int rem = number % 10;
            if (rem == 8) {
                count++;
            }
            number = number / 10;   
        }
        System.out.println(count);
        
    }
}
