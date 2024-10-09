package kiso;

import java.util.Random;

public class Switch {

    public static void main(String[] args) {
     
        System.out.println("あなたの運勢を占います。");
        Random random = new Random();
        int fortune = random.nextInt(4) + 1;
        switch(fortune) {
            case 1:
              System.out.println("大吉");
              break;
            case 2:
              System.out.println("中吉");
              break;
            case 3:
              System.out.println("小吉");
              break;
            default:
              System.out.println("凶");
        }
    }

}
