package Vehicle;

public abstract class Product {

private double qty;
private double price;
private float speed;

private String name;

    public Product(int qty, double price, float speed, String name) {

        this.qty = qty;
        this.price = price;
        this.speed = speed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
