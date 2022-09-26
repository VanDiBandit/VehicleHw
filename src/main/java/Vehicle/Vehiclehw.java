package Vehicle;

public class Vehiclehw extends Product {

    private int qty;
    private double price;
    private String engine;
    private final double tax = 0.15;
    private float speed;

    private String name;
    public Vehiclehw(int qty, double price, float speed, String name) {
        super(qty, price, speed, name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
        this.name = name;

    }

    public double getTax() {
        return tax;
    }

    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    //@Override
    //public void setPrice(double price) {
        //super.setPrice(price);
    }