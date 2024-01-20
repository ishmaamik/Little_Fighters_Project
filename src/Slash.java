public interface Slash<T extends Slash<T>>{
public void slash(T A, Character B);

public Integer getSlashRate();
public Integer getHitPoint();
public String getName();
public Integer getProficiencyLevel();

}
