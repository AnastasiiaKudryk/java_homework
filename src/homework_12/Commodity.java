package homework_12;

public class Commodity implements Comparable<Commodity>{
    private String name;
    private  int price;

    public Commodity(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Commodity o) {
        int result = this.name.compareTo(o.getName());
        if (result == 0) {
            if (this.price > o.getPrice()) {
                result = 1;
            } else if (this.price < o.getPrice()) {
                result = -1;
            } else {
                result = 0;
            }
        }
        return result;
    }
}
