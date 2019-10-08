package Data.SportEvents;

import Data.Bet;
import Data.Bet;
import Data.Result;
import Data.Result;
import java.time.LocalDateTime;
import java.util.List;

public abstract class SportEvent {
    String title;
    LocalDateTime start_date;
    LocalDateTime end_date;
    List<Bet> bets;
    Result results;
    
    public SportEvent(String title, LocalDateTime start_date, LocalDateTime end_date, List<Bet> bets, Result results)
    {
        this.title = title;
        this.start_date = start_date;
        this.end_date = end_date;
        this.bets = bets;
        this.results = results;
    }
    
     public String BetsToString()
     {
         String AppendBets = "";
        
        for(Bet bet : this.bets)
        {
            AppendBets += "\n" + bet.toString();
        }
        return AppendBets;
     }
}
