package Builders;

import Domain.Bet;
import Domain.Result;
import java.time.LocalDateTime;
import Domain.SportEvents.TennisSportEvent;
import java.util.ArrayList;

public class TennisSportEventBuilder {
    String title;
    LocalDateTime start_date;
    LocalDateTime end_date;
    ArrayList<Bet> bets;
    Result results;


    public TennisSportEventBuilder()
    {
        this.bets = new ArrayList<Bet>();
    }

    public TennisSportEventBuilder addBet(Bet bet)
    {
        this.bets.add(bet);
        return this;
    }
    public TennisSportEventBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public TennisSportEventBuilder setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
        return this;
    }

    public TennisSportEventBuilder setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
        return this;
    }

    public TennisSportEventBuilder setBets(ArrayList<Bet> bets) {
        this.bets = bets;
        return this;
    }

    public TennisSportEventBuilder setResults(Result results) {
        this.results = results;
        return this;
    }

    public TennisSportEvent getTennisSportEventBuilder()
    {
        return new TennisSportEvent(title,start_date,end_date,bets,results);
    }


}
