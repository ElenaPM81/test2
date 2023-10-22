

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Random;

public class ToyShop {
    private ArrayList<Toy> toys;


    public ToyShop(){
        toys = new ArrayList<>();
    
 
    }
// создаем метод добавления игрушек в магазин
public void add(Toy toy){
    boolean foundToy = false;
    for(Toy t: toys){
        if(t.getVendorCode() == toy.getVendorCode()){
            t.setQuantity(t.getQuantity() + toy.getQuantity());
            foundToy = true;
        break;
        }
        

    }

    if(!foundToy){
    toys.add(toy);
}
}
// создаем метод изменения веса игрушек

public void setWeight(int VendorCode, double weight){

    for(Toy t : toys){
        if (t.getVendorCode() == VendorCode) {
            t.setWeight(weight);
            break;
            
        }
    }
}

// создаем метод получения списка игрушек с их атрибутами
    public ArrayList<String> getToyList(){
        ArrayList<String> toyList = new ArrayList<>();
        for(Toy t : toys){
            toyList.add("Артикул: " + t.getVendorCode() + "," + " Название: " + t.getName() + "," + " Количество: " + t.getQuantity()+"," + " Вес: " + t.getWeight());
        }
        return toyList;

    }


// создаем метод розыгрыша игрушек
public ArrayList<Toy> playLottery(int count){
    ArrayList<Toy> winners = new ArrayList<>();
    double weightSum = 0;
    for(Toy t: toys){
        weightSum += t.getWeight();
    }

    Random random = new Random();
    for(int i = 0; i < count; i++){
        double randomNum = random.nextDouble() * weightSum;
        double currentSum = 0;
        for (Toy t : toys){
            currentSum += t.getWeight();
            if(currentSum >= randomNum){
                if(t.getQuantity() >0){
                    winners.add(t);
                    t.setQuantity(t.getQuantity()-1);
                    weightSum -= t.getWeight();

                }
                break;
            }
        }
    }
    return winners;

}


// создаем метод сохранения данных об игрушках в файл


public void saveToFile(String fileName) throws IOException{
    try(FileWriter writer = new FileWriter(fileName)){
       
        for(Toy t: toys){
            writer.write(t.getVendorCode() + " , " + t.getName() + " , " + t.getQuantity() + " , " + t.getWeight() + "n");
        }
    }
        }
// // создаем метод загрузки данных об игрушках из файла
public void loadFromFile(String fileName) throws IOException{
    try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
        String line;
        while((line = reader.readLine()) != null){
            String[] toyData = line.split(",");
            Toy toy = new Toy(Integer.parseInt(toyData[0]), toyData[1],  Double.parseDouble(toyData[2]),Integer.parseInt(toyData[3]));
            toy.add(toy);
        }

    }
}


    }

  


  
  


    
       
 


    


