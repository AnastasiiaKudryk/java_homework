package homework_5;

public class Warrior2 extends Warrior{
    private String weapon1;
    private String weapon2;
    private int lostHp1, lostHp2;
    private String name;

    public String getName() {
        return "Воїн №2";
    }
    public void setWeapon(String weapon1,String weapon2) {
        this.weapon1 = weapon1;
        this.weapon2 = weapon2;
    }
    public String getWeapon1(){
        return weapon1;
    }

    public String getWeapon2() {
        return weapon2;
    }
    @Override
    public int getLostHp() {
        if (weapon1 == "dirk") {
            lostHp1=100;
        }
        if(weapon1=="sword"){
            lostHp1=200;
        }
        if(weapon1=="pistol"){
            lostHp1=300;
        }
        if (weapon2 == "dirk") {
            lostHp2=100;
        }
        if(weapon2=="sword"){
            lostHp2=200;
        }
        if(weapon2=="pistol"){
            lostHp2=300;
        }
        return lostHp1+lostHp2;
    }
}
