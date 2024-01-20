public class Archer extends Character implements Shoot<Archer>{
    int ShootRate;
    public Archer()
    {

    }
    public Archer(String name, Integer hitPoint, Integer proficiencyLevel, int strikeRate)
    {
        Name=name;
        HitPoint= hitPoint;
        ProficiencyLevel= proficiencyLevel;
        ShootRate= strikeRate;
    }


    @Override
    public Integer getProficiencyLevel() {
        return super.getProficiencyLevel();
    }

    public void shoot (Archer A, Character B)
    {
        ShootUtils.shoot(A, B, ShootRate);

    }

    @Override
    public Integer getShootRate() {
        return ShootRate;
    }

}
