package homework_6;

public class MyCalculator implements Numerable{
    private double num1;
    private double num2;


    public MyCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double plus(){
        return num1+num2;
    }
    public double minus(){
        return num1-num2;
    }
    public double multiply(){
        return num1*num2;
    }
    public double devide(){
        return num1/num2;
    }
}
