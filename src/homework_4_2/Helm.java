package homework_4_2;

public class Helm {
    private int diameter;
    public Helm(){
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
        return "Helm{" +
                "diameter=" + diameter +
                '}';
    }
}
