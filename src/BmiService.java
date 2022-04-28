public class BmiService {
    public double calculate(double weight, double height) {
        double heightMtr = height / 100;
        return weight / heightMtr / heightMtr;
    }
}

