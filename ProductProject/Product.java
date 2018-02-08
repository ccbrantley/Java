public abstract class Product {
    // Private Data Attributes
    private String name;
    private int sku;
    private double price;
    // Fully Overloaded Constructor
    public Product (String name, int sku, double price){
        this.name = name;
        this.sku = sku;
        this.price = price;
    }
    //Getter/Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Overridden toString with custom formatting
    @Override
    public String toString() {
        return "\nProduct: " + name + "\nSku: " + sku +
                "\nprice: " + price;
    }
}
