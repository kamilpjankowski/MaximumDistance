public class MaximumDistance {

    String brand = "";
    double fuel = 0;
    double fuelUsage = 0;
    int passengers = 0;
    boolean airConditioner = true;
    double maximumDistance = 0;
    double totalDistance = 0;



    public double getFuelUsage() {
        return fuelUsage;
    }

    public double getFuel() {
        return fuel;
    }

    public MaximumDistance(String brand, double fuel, double fuelUsage, int passengers, boolean airConditioner) {
        this.brand = brand;
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
        this.airConditioner = airConditioner;
    }

    double consumptionAC()
    {
        if (airConditioner)
        {
            return getFuelUsage()*0.1;
        }
        else
        {
            return 0;
        }
    }


    double calculateFuelUsage() {
        double calculateFuelUsage;
        double additionaFuelUsageFromPassengers = passengers * 0.05 * getFuelUsage();
        calculateFuelUsage = consumptionAC() + getFuelUsage() + additionaFuelUsageFromPassengers;
        return calculateFuelUsage;
    }

    double totalDistance() {

        totalDistance = (getFuel()/calculateFuelUsage())*100;
        return totalDistance;

    }
    @Override
    public String toString() {
        return "____________________________________\n"
                + "Statistics for "
                + brand + ":" + "\n" +
                "[Fuel in tank: " + fuel + "]\n" +
                "[Basic fuel usage: " + fuelUsage + "]\n" +
                "[No. of passengers: " + passengers + "]\n" +
                "[AC is on? " + airConditioner + "]\n" +
                "[Total distance before empty tank: " + totalDistance() + "]\n" +
                "------------------------------------\n";
    }
}
