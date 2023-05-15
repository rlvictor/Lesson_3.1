public class BmiService {
    public double calculate(double heightMeters, int weightKg) {
        double bmi = weightKg / Math.pow(heightMeters, 2);
        return (int) bmi;
    }
}
