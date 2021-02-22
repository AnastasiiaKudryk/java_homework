package homework_5;

public class Warrior {
    private int hp;
    private String weapon;
    private int lostHp;
    private String name;

    public Warrior(){
    }

    public void setName() {
        this.name = "Warrior";
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getLostHp() {
        if (weapon == "dirk") {
            lostHp=100;
        }
        if(weapon=="sword"){
            lostHp=200;
        }
        if(weapon=="pistol"){
            lostHp=300;
        }
        return lostHp;
    }

    public void isHittedBy(Warrior someWarrior) {
        if (someWarrior.getHp()>0&&getHp()>0) {
            hp = hp - someWarrior.getLostHp();
            System.out.println(someWarrior.getName() + " поцілив у " + getName());
            System.out.println(getName() + " hp: " + getHp());
            if (getHp() <= 0) {
                System.out.println(getName() + ": помер");
            }
            System.out.println("");
        }
    }
    public void resultOfWar(Warrior somewarrior1, Warrior somewarrior2, Warrior somewarrior3){
        if(somewarrior1.getHp()>0){
            System.out.println(somewarrior1.getName()+" переміг!");
        }
        if(somewarrior2.getHp()>0){
            System.out.println(somewarrior2.getName()+" переміг!");
        }
        if(somewarrior3.getHp()>0){
            System.out.println(somewarrior3.getName()+" переміг!");
        }
    }
}
