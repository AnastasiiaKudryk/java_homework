package homework_4_2;

public class Car {
  private String model;
  private int age;

  CarBody carBody= new CarBody();
  Helm helm = new Helm();
  Wheel wheel = new Wheel();

  public Car(){
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public CarBody getCarBody() {
    return carBody;
  }

  public void setCarBody(CarBody carBody) {
    this.carBody = carBody;
  }

  public Helm getHelm() {
    return helm;
  }

  public void setHelm(Helm helm) {
    this.helm = helm;
  }

  public Wheel getWheel() {
    return wheel;
  }

  public void setWheel(Wheel wheel) {
    this.wheel = wheel;
  }

  public void setCarBodyColor(String color){
    carBody.setColor(color);
  }

  public String getCarBodyColor(){
    return carBody.getColor();
  }

  public void setHelmDiameter(int diameter){
    helm.setDiameter(diameter);
  }

  public int getHelmDiameter(){
    return helm.getDiameter();
  }

  public void increaseHelmDiameter(){
    helm.increaseDiameter();
  }
  public void setWheelDiameter(int diameter){
    wheel.setDiameter(diameter);
  }

  public int getWheelDiameter(){
    return wheel.getDiameter();
  }

  public void increaseWheelDiameter(){
    wheel.increaseDiameter();
  }

  @Override
  public String toString() {
    return "Car{" +
            "model='" + model + '\'' +
            ", age=" + age +
            ", carBody=" + carBody +
            ", helm=" + helm +
            ", wheel=" + wheel +
            '}';
  }
}
