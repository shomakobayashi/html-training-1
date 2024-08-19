import java.util.ArrayList;

public class Suzuki {

    public static void main(String[] args) {
        
        Hero h1 = new Hero("鈴木");

        ArrayList<String> array = new AllayList<String>();

        array.add(h1);

        for(Hero hero : array){
            System.out.println(hero.getName());
        }
    }

}
