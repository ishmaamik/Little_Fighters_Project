public class HealUtils {
    public  static <T extends Heal> void heal(T A, Character B, int x)
    {
        x=A.getHealRate();
        int HealFactor= x*A.getProficiencyLevel();

        if(B.HitPoint<100 && B.HitPoint+HealFactor>100)
        {
            Integer C= B.HitPoint;
            B.HitPoint=100;
            System.out.println(B.Name+" is healed by "+A.getName()+" by "+((B.HitPoint)-C)+" points, now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+"\n");
        }
        else if(B.HitPoint==100)
        {
            System.out.println(A.getName()+" cannot heal full-health "+B.Name+", now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+"\n");
        }
        else
        {
            B.HitPoint+= HealFactor;
            System.out.println(B.Name+" is healed by "+A.getName()+" by "+HealFactor+" points, now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+"\n");
        }

        try{Thread.sleep(3000);} catch(InterruptedException e) {}

    }
}
