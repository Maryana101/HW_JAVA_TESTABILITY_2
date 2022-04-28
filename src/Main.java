public class Main {
    public static void main(String[] args) {
        double mKg = 77; // масса в кг
        double hCm = 170;// рост в см
        BmiService bmiService = new BmiService();
        int bmi = (int) bmiService.calculate(mKg, hCm);
        System.out.println(bmi);
    }
}
