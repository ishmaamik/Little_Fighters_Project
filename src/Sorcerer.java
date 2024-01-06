public class Sorcerer extends Character implements Heal<Sorcerer>, Poison{

    int HealRate;

    public Integer getHealRate()
    {
        return HealRate;
    }

    @Override
    public void heal(Sorcerer A, Character B) {
        CombatUtils.heal(A,B,HealRate);
    }

    @Override
    public void poison(Character A, Character B) {
        Integer PoisonFactor= 3* A.ProficiencyLevel;
        B.HitPoint-= (PoisonFactor);
        System.out.println(B.Name+" is poisoned by "+A.Name+" to "+PoisonFactor+" points, now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+"\n");
        try{Thread.sleep(3000);} catch(InterruptedException e) {}
    }
}
