public class Swordsman extends Character implements Strike<Warrior>{


    int StrikeRate;
    public Swordsman()
    {

    }
    public Swordsman(String name, Integer hitPoint, Integer proficiencyLevel, int strikeRate)
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
        StrikeUtils.strike(A, B, StrikeRate);

    }
}
