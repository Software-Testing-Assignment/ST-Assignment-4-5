
package st.assignment.pkg4.pkg5;

/**
 *
 * @author abdulrahman
 */
public class STAssignment45 {

    public static void logChecker(int kill,int death,int assist, int hour, int minute, int second )
    {
        int flag1=0, flag2=0;
        if(kill > 15 && death <= 6 && assist >= 8)
        {
            flag1=1;
        }
        if(hour>12 && minute>=0 && second >=0)
        {
            flag2=1;
        }
        if(flag1==1 && flag2==1)
        {
            System.out.println("CONGRATULATION SUMMONER YOU HAVE ACHIEVED DIAMOND RANK!!! ");
        }
        else
        {
            System.out.println("Sorry Summoner, you weren't promoted to Diamond Rank.");
        }
        
    }
    public static void main(String[] args) {
        int kill=16;
        int death=3;
        int assist=11;
        int hour=13;
        int minute=25;
        int second=50;
        int flag1=0,flag2=0;
        System.out.println("TIME FORMATE : 24 hours formate");
        System.out.println("KILLS | DEATH | ASSIST");
        System.out.println("");
        System.out.print("Current Rank of Player:");
        System.out.println(" GOLD");
        System.out.println("");
        System.out.println("Log Checking . . . . . ");
        System.out.println("");
        System.out.println("Log Checked Successfully!!");
        System.out.println("");
        
        if(kill>15 && kill <=50 || death>=0 && death <=6 || assist>=8 && assist <=30)
        {
            flag1=1;
        }
        if(hour>=12 && kill <=24 || minute>=0 && minute <= 60 || second>=1 && second <=60)
        {
            flag2=1;
        }
        if(flag1==1 && flag2==1)
        {
            logChecker(kill,death,assist,hour,minute,second);
        }
        else
        {
            System.out.println("Better luck next time summoner.");
        }
        System.out.println("");
    }
}
