public class SubZero extends Sorcerer{
    public SubZero()
    {
        Name= "Sub Zero";
        HitPoint=100;
        ProficiencyLevel= 4;
        HealRate=2;
    }

    public SubZero(String name, Integer hitPoint, Integer proficiencyLevel, Integer healRate) {
        Name = name;
        HitPoint = hitPoint;
        ProficiencyLevel = proficiencyLevel;
        HealRate= healRate;

        if(HitPoint>100)
        {
            HitPoint=100;
        }
    }

}
