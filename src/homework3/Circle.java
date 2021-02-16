package homework3;
import java.lang.Math;

public class Circle {
    double radius;
    double diameter;

    Circle(double radius, double diameter){
        this.diameter=diameter;
        this.radius=radius;
    }

    public double area(){
        return Math.PI*diameter*diameter/4;
    }

    public double length(){
        return 2*Math.PI*radius;
    }
}
