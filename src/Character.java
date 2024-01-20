public class Character {
    public String Name;
    public Integer HitPoint;
    public Integer ProficiencyLevel;
    public Character() {
        //create object, then assign their name, proficiency level etc
    }
    public Character(String name, Integer hitPoint, Integer proficiencyLevel) {
        Name = name;
        HitPoint = hitPoint;
        ProficiencyLevel = proficiencyLevel;

        if(HitPoint>100)
        {
            HitPoint=100;
        }
    }

    public Integer getHitPoint() {
        return HitPoint;
    }

    public String getName() {
        return Name;
    }

    public Integer getProficiencyLevel() {
        return ProficiencyLevel;
    }

    public void setHitPoint(int HitPoint) {
        this.HitPoint=HitPoint;
    }

    public void setName(String Name) {
        this.Name= Name;

    }

    public void setProficiencyLevel(int ProficiencyLevel) {
        this.ProficiencyLevel=ProficiencyLevel;
    }
}
