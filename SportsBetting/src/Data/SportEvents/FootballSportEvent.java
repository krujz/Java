package Data.SportEvents;

import Data.Bet;
import Data.Bet;
import Data.Result;
import Data.Result;
import java.time.LocalDateTime;
import java.util.List;

public class FootballSportEvent extends SportEvent {
    
    public FootballSportEvent(String title, LocalDateTime start_date, LocalDateTime end_date, List<Bet> bets, Result results) {
        super(title, start_date, end_date, bets, results);
    }
    
    @Override
    public String toString()
    {
        return "Football : \nTitle: " + title + "\nStarts: " + start_date.toString() + "\nEnds: " + end_date.toString() + "\nBets:" + BetsToString() + "\nResult: " + results.getResults().toString();
    }
    
}
