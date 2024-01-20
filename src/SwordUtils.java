public class SwordUtils {
    public  static <T extends Slash> void slash(T A, Character B, int x)
    {
        x=A.getSlashRate();
        int SlashFactor= x* A.getProficiencyLevel();

        if(B.getHitPoint()==0)
        {
            System.out.println(B.getName()+" is dead already! now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+"\n");
        }

        else if(B.getHitPoint()-SlashFactor<0)
        {
            Integer D= B.HitPoint;
            B.HitPoint=0;
            System.out.println(B.getName()+" got hit points reduced by "+(D-B.getHitPoint())+" from "+A.getName()+" now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+ "\n");
        }
        else
        {
            B.HitPoint=B.getHitPoint()-SlashFactor;
            System.out.println(B.getName() + " got hit points reduced by " + SlashFactor + " from " + A.getName() + " now HP is, "+ B.getName()+": "+B.getHitPoint()+", "+A.getName()+": "+A.getHitPoint()+ "\n");
        }
        try{Thread.sleep(3000);} catch(InterruptedException e) {};
    }



}
