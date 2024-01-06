public class Yuri extends Warrior{

    public Yuri()
    {
        Name= "Yuri";
        ProficiencyLevel=5;
        HitPoint=100;
        StrikeRate=2;
    }

    public Yuri(String name, Integer hitPoint, Integer proficiencyLevel) {
        Name = name;
        HitPoint = hitPoint;
        ProficiencyLevel = proficiencyLevel;

        if(HitPoint>100)
        {
            HitPoint=100;
        }
    }

}
