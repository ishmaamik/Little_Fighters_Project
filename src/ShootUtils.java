public class ShootUtils {
    public  static <T extends Shoot> void shoot(T A, Character B, int x)
    {
        x=A.getShootRate();
        int ShootFactor= x* A.getProficiencyLevel();

        if(B.getHitPoint()==0)
        {
            System.out.println(B.getName()+" is dead already! now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+"\n");
        }

        else if(B.getHitPoint()-ShootFactor<0)
        {
            Integer D= B.HitPoint;
            B.HitPoint=0;
            System.out.println(B.getName()+" got hit points reduced by "+(D-B.getHitPoint())+" from "+A.getName()+" now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+ "\n");
        }
        else
        {
            B.HitPoint=B.getHitPoint()-ShootFactor;
            System.out.println(B.getName() + " got hit points reduced by " + ShootFactor + " from " + A.getName() + " now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+ "\n");
        }
        try{Thread.sleep(3000);} catch(InterruptedException e) {};
    }



}
