public class Warrior extends Character implements Strike<Warrior>{


    int StrikeRate;
    public Warrior()
    {

    }
    public Warrior(String name, Integer hitPoint, Integer proficiencyLevel, int strikeRate)
    {
        Name=name;
        HitPoint= hitPoint;
        ProficiencyLevel= proficiencyLevel;
        StrikeRate= strikeRate;
    }

    public Integer getStrikeRate() {
        return StrikeRate;
    }

    public void strike (Warrior A, Character B)
    {
        CombatUtils.strike(A, B, StrikeRate);

    }
}
