package Data.SportEvents;

import Data.Bet;
import Data.Bet;
import Data.Result;
import Data.Result;
import java.time.LocalDateTime;

public class SportEvent {
    String title;
    LocalDateTime start_date;
    LocalDateTime end_date;
    Bet bets;
    Result result;
    
    public SportEvent(String title, LocalDateTime start_date, LocalDateTime end_date, Bet bets, Result results)
    {
        this.title = title;
        this.start_date = start_date;
        this.end_date = end_date;
        this.bets = bets;
        this.result = results;
    }
    
    public void SetResult(Result result)
    {
        this.result = result;
    }
    
}
