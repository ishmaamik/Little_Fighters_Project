public interface Strike<T extends Strike<T>>{
    public void strike(T A, Character B);

    public Integer getStrikeRate();
    public Integer getHitPoint();
    public String getName();
    public Integer getProficiencyLevel();



}
