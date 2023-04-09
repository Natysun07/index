public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 98;
        double heightInMeters = 1.87;
        double index = service.calculate(weightInKg, heightInMeters);
        index = (int) index;
        System.out.println(index);
    }
} 