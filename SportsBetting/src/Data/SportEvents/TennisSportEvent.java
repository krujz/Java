package Data.SportEvents;

import Data.Bet;
import Data.Bet;
import Data.Result;
import Data.Result;
import java.time.LocalDateTime;

public class TennisSportEvent extends SportEvent{
    
    public TennisSportEvent(String title, LocalDateTime start_date, LocalDateTime end_date, Bet bets, Result results) {
        super(title, start_date, end_date, bets, results);
    }
    
}
