public class BmiService {
    public double calculate (double weight, double height){
        double height_mtr=height/100;
        return weight/height_mtr/height_mtr;
    }
}
