package Vehicle;

public class Cars {

    public static void main(String[] args) {

        Vehiclehw Audi = new Vehiclehw(1, 5000, 150.0f, "Zoomies");
        Audi.getPrice();

        Bike Mongoose = new Bike(1, 3000, 75.0f, "Ankle Breaker");
        Mongoose.getPrice();

        Rollercoaster Volcano = new Rollercoaster(1, 20000, 300.0f, "Whiplash");

        Horse Megan = new Horse(1, 3000, 100.0f, "Stallion");
        Megan.getPrice();


        Product[] Carosel = {Audi, Mongoose, Megan};

        VehicleApp.vehicleNamesAndPrices(Carosel);
    }
}