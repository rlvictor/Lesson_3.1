public class BmiService {
    public int calculate(double heightMeters, int weightKg) {
        double bmi = weightKg / Math.pow(heightMeters, 2);
        return (int) bmi;
    }
}
