package homework_5;

public class Warrior3 extends Warrior{
    public int lostHp;
    private String name;

    public String getName() {
        return "Воїн №3";
    }
    public int lostHp(String weapon) {
        if (weapon == "dirk") {
            lostHp=50;
        }
        if(weapon=="sword"){
            lostHp=100;
        }
        if(weapon=="pistol"){
            lostHp=150;
        }
        return lostHp;
    }
}
