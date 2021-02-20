package homework_4_2;

public class Wheel {
    private int diameter;
    public Wheel(){
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void increaseDiameter(){
        diameter= diameter*2;
    }


    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                '}';
    }
}
