package Domain.SportEvents;

import Domain.Bet;
import Domain.Result;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TennisSportEvent extends SportEvent{

    public TennisSportEvent(String title, LocalDateTime start_date, LocalDateTime end_date, ArrayList<Bet> bets, Result results) {
        super(title, start_date, end_date, bets, results);
    }

    @Override
    public String toString()
    {
        return "Tennis : \nTitle: " + title + "\nStarts: " + start_date.toString() + "\nEnds: " + end_date.toString() + "\nBets:" + BetsToString() + "\nResult: " + results.getResults().toString();
    }
}
