package Vehicle;

public class Rollercoaster implements RideAble{
    private int qty;
    private double price;
    private float speed;

    private String name;

    private final double TAX = 0.20;

    public Rollercoaster(int qty, double price, float speed, String name) {
        this.qty = qty;
        this.price = price;
        this.speed = speed;
        this.name = name;
    }
    //need price before tax
    //need price with tax
    //the tax by itself

    public double totalBeforeTax(Rollercoaster rollercoaster){
        return rollercoaster.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public double calcTax(Rollercoaster rollercoaster){
        double tax = rollercoaster.getPrice() * TAX;
        return tax;

    }

    public void totalAfterTax(Rollercoaster rollercoaster) {

        double tax = calcTax(rollercoaster);
        double totalBeforeTax = rollercoaster.getPrice();
        double amountAfterTax = tax + totalBeforeTax;

        System.out.println("With tax your amount is" + amountAfterTax);
    }
    @Override
    public int milesPerHour() {
        return 0;
    }
}
