package lesson6;

class Product {

    private String name;
    private int price;
    private boolean inStock;
    private Type device;


    public Product(Type device, boolean inStock, int price, String name) {
        this.device = device;
        this.inStock = inStock;
        this.price = price;
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public Boolean inStock(){
        return inStock;
    }
    public Type getDevice(){
        return device;
    }
}
