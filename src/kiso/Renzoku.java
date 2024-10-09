package kiso;

public class Renzoku {

    public static void main(String[] args) {
        
        System.out.print("aaa");
        System.out.print("aaa");
        System.out.print("aaa");
        System.out.println("aaa");

        Renzoku ren = new Renzoku();
        ren.okihou();
        int r = new java.util.Random().nextInt(10);
        System.out.println(r);
    }

    public void okihou () {
        int a = 5;
        int b = 10;
        int total = Math.max(a,b);
        System.out.println(total);

    }



}
