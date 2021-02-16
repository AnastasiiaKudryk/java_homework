package homework3;

public class Rectangle {
    int length;
    int height;

    Rectangle(){
        this.height=9;
        this.length=6;
    }

    Rectangle(int height, int length){
        this.height=height;
        this.length=length;
    }

    public int area(){
        return length*height;
    }

    public int perimeter(){
        return 2*(height+length);
    }

}
