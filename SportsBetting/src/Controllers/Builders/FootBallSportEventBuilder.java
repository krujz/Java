package Controllers.Builders;

import Domain.Bet;
import Domain.Result;
import java.time.LocalDateTime;
import java.util.List;
import Domain.SportEvents.FootballSportEvent;
import java.util.ArrayList;

public class FootBallSportEventBuilder {
    String title;
    LocalDateTime start_date;
    LocalDateTime end_date;
    ArrayList<Bet> bets;
    Result results;

    
    public FootBallSportEventBuilder()
    {
        this.bets = new ArrayList<Bet>();
    }
    
    public FootBallSportEventBuilder addBet(Bet bet)
    {
        this.bets.add(bet);
        return this;
    }
    public FootBallSportEventBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public FootBallSportEventBuilder setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
        return this;
    }

    public FootBallSportEventBuilder setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
        return this;
    }

    public FootBallSportEventBuilder setBets(ArrayList<Bet> bets) {
        this.bets = bets;
        return this;
    }

    public FootBallSportEventBuilder setResults(Result results) {
        this.results = results;
        return this;
    } 
    
    public FootballSportEvent getFootballSportEvent()
    {
        return new FootballSportEvent(title,start_date,end_date,bets,results);
    }
    
    
}
