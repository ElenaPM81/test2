// создаем класс "Игрушка", наследник класса "Товар", 
// который будет содержать артикул, название игрушки,
// ее вес и количество



public class Toy extends Product{
    String name;
    double weight;
    int quantity;

public Toy(int vendorCode ) {
        super(vendorCode);
        
    }
    //создаем конструктор 
    public Toy(int vendorCode, String name, double weight,int quantity ) {
        super(vendorCode);
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }    
public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
public int getQuantity() {
        return quantity;
    }

public void add(Toy toy) {
}

}
