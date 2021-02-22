package homework_5;

public class War {
    // dirk - 100 hp
    // sword - 200 hp
    // pistol - 300 hp
    // Warrior1 is simple warrior
    // Warrior2 has two types of weapon
    // Warrior3 is more impact resistant
    public static void main(String[] args) {

        Warrior1 warrior1 = new Warrior1();
        Warrior2 warrior2 = new Warrior2();
        Warrior3 warrior3 = new Warrior3();

        warrior1.setHp(300);
        warrior2.setHp(900);
        warrior3.setHp(700);
        warrior1.setWeapon("pistol");
        warrior2.setWeapon("dirk","dirk");
        warrior3.setWeapon("sword");

        while((warrior1.getHp()>0&&warrior2.getHp()>0)||(warrior1.getHp()>0&&warrior3.getHp()>0)||(warrior3.getHp()>0&&warrior2.getHp()>0)) {
            warrior2.isHittedBy(warrior1);
            warrior3.isHittedBy(warrior2);
            warrior1.isHittedBy(warrior3);
            warrior3.isHittedBy(warrior1);
            warrior2.isHittedBy(warrior3);
            warrior1.isHittedBy(warrior2);
        }
        warrior1.resultOfWar(warrior1, warrior2, warrior3);
    }
}
