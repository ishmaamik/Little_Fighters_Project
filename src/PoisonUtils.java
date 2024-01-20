public class PoisonUtils {
    public  static <T extends Poison> void poison(T A, Character B, int x)
    {
        x=A.getPoisonRate();
        int PoisonFactor= x* A.getProficiencyLevel();

        if(B.getHitPoint()==0)
        {
            System.out.println(B.getName()+" is dead already! now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+"\n");
        }

        else if(B.getHitPoint()-PoisonFactor<0)
        {
            Integer D= B.HitPoint;
            B.HitPoint=0;
            System.out.println(B.getName()+" got hit points reduced by "+(D-B.getHitPoint())+" from "+A.getName()+" now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+ "\n");
        }
        else
        {
            B.HitPoint=B.getHitPoint()-PoisonFactor;
            System.out.println(B.getName() + " got hit points reduced by " + PoisonFactor + " from " + A.getName() + " now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+ "\n");
        }
        try{Thread.sleep(3000);} catch(InterruptedException e) {};
    }



}
