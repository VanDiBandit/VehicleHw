package Vehicle;

public class Horse extends Product implements RideAble{

    private double qty;
    private double price;
    private float speed;
    private String name;
    private final double TAX = 0.15;

    public Horse(int qty, double price, float speed, String name) {
        super(qty, price, speed, name);
    }

    public double totalBeforeTax(Horse horsey){
        return horsey.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public double calcTax(Horse horsey){
        double tax = horsey.getPrice() * TAX;
        return tax;

    }

    public void totalAfterTax(Horse horsey) {

        double tax = calcTax(horsey);
        double totalBeforeTax = horsey.getPrice();
        double amountAfterTax = tax + totalBeforeTax;

        System.out.println("With tax your amount is" + amountAfterTax);
    }
    @Override
    public int milesPerHour() {
        return 0;
    }
}
