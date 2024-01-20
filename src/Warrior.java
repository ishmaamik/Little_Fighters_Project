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
    public void strike (Warrior A, Character B)
    {
        StrikeUtils.strike(A, B, StrikeRate);

    }
    public Integer getStrikeRate() {
        return StrikeRate;
    }


}
