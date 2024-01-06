public class CombatUtils {
    public  static <T extends Strike> void strike(T A, Character B, int x)
    {
        x=A.getStrikeRate();
        int StrikeFactor= x* A.getProficiencyLevel();

        if(B.getHitPoint()==0)
        {
            System.out.println(B.getName()+" is dead already! now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+"\n");
        }

        else if(B.getHitPoint()-StrikeFactor<0)
        {
            Integer D= B.HitPoint;
            B.HitPoint=0;
            System.out.println(B.getName()+" got hit points reduced by "+(D-B.getHitPoint())+" from "+A.getName()+" now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+ "\n");
        }
        else
        {
            B.HitPoint=B.getHitPoint()-StrikeFactor;
            System.out.println(B.getName() + " got hit points reduced by " + StrikeFactor + " from " + A.getName() + " now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+ "\n");
        }
        try{Thread.sleep(3000);} catch(InterruptedException e) {};
    }


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
