public class Deadlock extends Warrior{
    public Deadlock()
    {
        Name="Deadlock";
        ProficiencyLevel= 3;
        HitPoint= 100;
        StrikeRate=2;

    }

    public Deadlock(String name, Integer hitPoint, Integer proficiencyLevel, int strikeRate) {
        Name = name;
        HitPoint = hitPoint;
        ProficiencyLevel = proficiencyLevel;
        StrikeRate= strikeRate;

        if(HitPoint>100)
        {
            HitPoint=100;
        }
    }
}
