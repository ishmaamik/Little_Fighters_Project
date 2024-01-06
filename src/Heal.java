public interface Heal<T extends Heal<T>> {
    public void heal(T A, Character B);

    public Integer getHealRate();
    public Integer getHitPoint();
    public String getName();
    public Integer getProficiencyLevel();

}
