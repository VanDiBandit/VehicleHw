package Vehicle;

public class Bike extends Product implements RideAble{

    private double qty;
    private double price;
    private float speed;
    private String name;
    private final double TAX = 0.15;
    public Bike(int qty, double price, float speed, String name) {
        super(qty, price, speed, name);
    }

    public double totalBeforeTax(Bike bikey){
        return bikey.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public double calcTax(Bike bikey){
        double tax = bikey.getPrice() * TAX;
        return tax;

    }

    public void totalAfterTax(Bike bikey) {

        double tax = calcTax(bikey);
        double totalBeforeTax = bikey.getPrice();
        double amountAfterTax = tax + totalBeforeTax;

        System.out.println("With tax your amount is" + amountAfterTax);
    }

    @Override
    public int milesPerHour() {
        return 0;
    }
}
