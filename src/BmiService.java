public class BmiService {
    public double calculate(double weightInKg, double heightInMeters) {
        double calculation;
        calculation = weightInKg / (heightInMeters * heightInMeters);
        return calculation;
    }
}