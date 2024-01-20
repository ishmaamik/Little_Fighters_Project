public class Sorcerer extends Character implements Heal<Sorcerer>, Poison<Sorcerer>{

    int HealRate;
    int PoisonRate;
    public Sorcerer()
    {

    }
    public Sorcerer(String name, Integer hitPoint, Integer proficiencyLevel, int healRate, int poisonRate)
    {
        Name=name;
        HitPoint= hitPoint;
        ProficiencyLevel= proficiencyLevel;
        HealRate=healRate;
        PoisonRate=poisonRate;
    }

    public Integer getHealRate()
    {
        return HealRate;
    }
    public Integer getPoisonRate()
    {
        return PoisonRate;
    }

    @Override
    public void heal(Sorcerer A, Character B) {
        HealUtils.heal(A,B,HealRate);
    }

    @Override
    public void poison(Sorcerer A, Character B) {
        PoisonUtils.poison(A,B,PoisonRate);
    }



}
