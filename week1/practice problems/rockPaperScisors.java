package Step.practice;
import java.util.Random;

public class rockPaperScisors {
    public static String playerround(String playermove,String computermove)
    {
        if ((playermove.equals("rock") && computermove.equals("scissors"))||(playermove.equals("paper") && computermove.equals("rock"))||(playermove.equals("scissors") && computermove.equals("paper")))
        {
            return "player wins";
        } else if (playermove.equals(computermove)) {
            return "draw";
        }
        else {
            return "computer wins";
        }
    }

    public static void main(String[] args) {
        String[] playermoves = new String[]{"rock","paper","scissors","rock","paper","scissors"};
        String[] computermoves = new String[]{"rock","paper","scissors"};
        Random rand = new Random();
        int wins=0;
        int loss=0;
        int draws=0;

        System.out.println("round\tplayer\tcomputer\tresult");
        System.out.println("------------------------------------");


        for (int i = 0; i < playermoves.length; i++)
        {
            String playermove=playermoves[i];

            String computermove = computermoves[rand.nextInt(computermoves.length)];
            String result=playerround(playermove,computermove);
            if(result.equals("player wins"))
            {
                wins++;
            } else if (result.equals("computer wins")) {
                loss++;
            }
            else {
                draws++;
            }
            System.out.println((i+1)+"        "+playermove+"\t"+computermove+"\t"+result);

        }
        int totalrounds=playermoves.length;
        double winpercentage=(wins*100.0)/totalrounds;
        System.out.println("wins="+wins);
        System.out.println("loss="+loss);
        System.out.println("draws="+draws);
        System.out.printf("wins=%.2f",winpercentage);
    }
}
