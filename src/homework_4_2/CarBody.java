package homework_4_2;

public class CarBody {
    private String color;
    public CarBody(){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarBody{" +
                "color='" + color + '\'' +
                '}';
    }
}
