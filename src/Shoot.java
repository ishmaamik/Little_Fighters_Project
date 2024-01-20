public interface Shoot <T extends Shoot<T>> {
    public void shoot(T A, Character B);

    public Integer getShootRate();
    public Integer getHitPoint();
    public String getName();
    public Integer getProficiencyLevel();
}
