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
    
     public String getTitle() {
        return title;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public ArrayList<Bet> getBets() {
        return bets;
    }

    public Result getResults() {
        return results;
    }

    public SportEventLogic getSporteventlogic() {
        return sporteventlogic;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public void setBets(ArrayList<Bet> bets) {
        this.bets = bets;
    }

    public void setResults(Result results) {
        this.results = results;
    }

    public void setSporteventlogic(SportEventLogic sporteventlogic) {
        this.sporteventlogic = sporteventlogic;
    }
    
    
    
    public String BetsToString()
     {
        return this.sporteventlogic.BetsToString(this.bets);
     }
}
