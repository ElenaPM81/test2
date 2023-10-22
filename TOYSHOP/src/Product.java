// создаем абстрактный класс "Товар", который имеет определенный артикул
public abstract  class Product {
    public Product(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    int vendorCode;

    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }
}
