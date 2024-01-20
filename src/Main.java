
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character Zero= new Sorcerer();
        Character Oxygen= new Warrior();
        Character OxyMoron= new Archer();
        Character Sabakun= new Swordsman();
        Character SubZero= new Healer();


        Yuri yuri= new Yuri();
        Deadlock deadlock= new Deadlock();
        SubZero subZero= new SubZero();
        Iris iris= new Iris();


        System.out.println(subZero.HitPoint);

        yuri.strike(yuri,deadlock);
        yuri.strike(yuri,deadlock);

        deadlock.strike(deadlock,yuri);

        subZero.heal(subZero, deadlock);

        subZero.heal(subZero, deadlock);

        subZero.heal(subZero, deadlock);

        subZero.heal(subZero, deadlock);

        subZero.poison(subZero, yuri);

        yuri.strike(yuri,subZero);
        yuri.strike(yuri,subZero);

        iris.heal(iris,deadlock);
    }
}