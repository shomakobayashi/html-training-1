package kiso;

public class While_1 {

    public static void main(String[] args) {
        
        int temp = 20;
        while(temp < 25) {
            System.out.println("現在の温度は" + temp + "度です。");
            temp++;
            System.out.println("温度を一度あげました。");
            System.out.println("現在の温度は" + temp + "度です。");
            System.out.println();
        }
    }

}
