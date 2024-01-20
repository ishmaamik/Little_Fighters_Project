public class Healer extends Character implements Heal<Healer>{
    int HealRate;
    public Healer()
    {

    }
    public Healer(String name, Integer hitPoint, Integer proficiencyLevel, int healRate)
    {
        Name=name;
        HitPoint= hitPoint;
        ProficiencyLevel= proficiencyLevel;
        HealRate=healRate;
    }
    public void heal(Healer A, Character B) {
        HealUtils.heal(A,B,HealRate);
    }

    public Integer getHealRate()
    {
        return HealRate;
    }







}
