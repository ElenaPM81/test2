

import java.io.File;
import java.util.ArrayList;



public class App {

    public static void main(String[] args) throws Exception {


        ToyShop shop = new ToyShop();
        // List<Toy> toys = new ArrayList<>();
        Toy t1 = new Toy(112, "кукла", 0.6, 4);
        Toy t2 = new Toy(113, "конструктор", 0.8, 2);
        Toy t3 = new Toy(114, "медвежонок", 0.5, 1);
        Toy t4 = new Toy(115, "солдатик", 0.2, 3);
        Toy t5 = new Toy(116, "самолет", 0.9, 2);
        Toy t6 = new Toy(117, "кубики", 0.6, 3);

       shop.add(t1);
        shop.add(t2);
        shop.add(t3);
        shop.add(t4);
        shop.add(t5);
        shop.add(t6);

        
        File toyFile = new File("Toy.csv");
        toyFile.createNewFile();
        

        ArrayList<String> toyList = shop.getToyList();
        for (String toy : toyList) {
            System.out.println(toy);
        }
        // разыгрываем игрушки
        ArrayList<Toy> winners = shop.playLottery(3);
        System.out.println("Выиграли игрушки:");
        for (Toy t : winners) {
            System.out.println(t.getName());
            shop.saveToFile("Toy.csv");
        }
        
    }

}
