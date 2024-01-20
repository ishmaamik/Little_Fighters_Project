public interface Poison<T extends Poison<T>> {
    public void poison(T A, Character B);

    public Integer getPoisonRate();
    public Integer getHitPoint();
    public String getName();
    public Integer getProficiencyLevel();

}
