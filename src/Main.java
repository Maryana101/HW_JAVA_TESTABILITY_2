public class Main {
    public static void main(String[] args) {
        double m_kg = 77; // масса в кг
        double h_cm = 170;// рост в см
        BmiService bmiService = new BmiService();
        double bmi = bmiService.calculate(m_kg, h_cm);
        System.out.println(bmi);
    }

}
