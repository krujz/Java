package Domain.SportEvents;

import Controllers.Domain.Logic.SportEventLogic;
import Domain.Bet;
import Domain.Bet;
import Domain.Result;
import Domain.Result;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class SportEvent {
    String title;
    LocalDateTime start_date;
    LocalDateTime end_date;
    ArrayList<Bet> bets;
    Result results;
    SportEventLogic sporteventlogic;
    
    public SportEvent(String title, LocalDateTime start_date, LocalDateTime end_date, ArrayList<Bet> bets, Result results)
    {
        this.title = title;
        this.start_date = start_date;
        this.end_date = end_date;
        this.bets = bets;
        this.results = results;
        this.sporteventlogic = new SportEventLogic();
    }
    
     public String BetsToString()
     {
        return this.sporteventlogic.BetsToString(this.bets);
     }
}
