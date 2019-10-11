package Domain.SportEvents;

import Domain.Bet;
import Domain.Bet;
import Domain.Result;
import Domain.Result;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class FootballSportEvent extends SportEvent {
    
    public FootballSportEvent(String title, LocalDateTime start_date, LocalDateTime end_date, ArrayList<Bet> bets, Result results) {
        super(title, start_date, end_date, bets, results);
    }
    
    @Override
    public String toString()
    {
        return "Title: " + title + " Starts: " + start_date + " Ends: " + end_date;
    }
    
}
