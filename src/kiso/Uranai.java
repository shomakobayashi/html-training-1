package kiso;

import java.util.Random;

public class Uranai {
    
    public static void main(String[] args) {

        Random random = new Random();
        
        System.out.println("あなたの運勢を占います。");

        int fortune = random.nextInt(4) + 1;
        if(fortune == 1){
            System.out.println("大吉");
        } else if (fortune == 2) {
            System.out.println("中吉");
        } else if (fortune == 3) {
            System.out.println("小吉");
        } else {
            System.out.println("凶");
        }
    }

}
