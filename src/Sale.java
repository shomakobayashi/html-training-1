import java.util.Scanner;

public class Sale {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt(); 
        }

        int maxCoupon = 0;
        int total = 0;

        for (int price : prices) {
            total += price;
            if(price >= l && price > maxCoupon) {
                maxCoupon = price;
            }
        }

        if (maxCoupon > 0) {
            total -= (maxCoupon / 2);
        }

        System.out.println(total);


    }

}
