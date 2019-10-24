package Controllers.Domain.Logic;

import Domain.Bet;
import java.util.ArrayList;

public class SportEventLogic {
    
    public String BetsToString(ArrayList<Bet> bets)
     {
         String AppendBets = "";
        
        for(Bet bet : bets)
        {
            AppendBets += "\n" + bet.toString();
        }
        return AppendBets;
     }
}
