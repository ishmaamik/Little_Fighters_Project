public class Iris extends Healer{
    public Iris()
    {
        Name="Iris";
        ProficiencyLevel= 4;
        HitPoint= 100;
        HealRate=2;

    }

    public Iris(String name, Integer hitPoint, Integer proficiencyLevel, int strikeRate) {
        Name = name;
        HitPoint = hitPoint;
        ProficiencyLevel = proficiencyLevel;
        HealRate= strikeRate;

        if(HitPoint>100)
        {
            HitPoint=100;
        }
    }
}
