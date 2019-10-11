package Controllers.AppLogic;

import Domain.Bet;
import Domain.Outcome;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.FootballSportEvent;
import Enums.Currency;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.DataSelectorFromDB;
import java.util.ArrayList;

public class AppLogic 
{
    DataSelectorFromDB selectallfromdb;
    public AppLogic() throws OutcomeOddTimeOverlapException
    {
        selectallfromdb = new DataSelectorFromDB();
    }
    public ArrayList<String> getResults() {
        return this.selectallfromdb.getResults();
    }

    public ArrayList<Bet> getBets() {
        return this.selectallfromdb.getBets();
    }

    public ArrayList<Outcome> getOutcomes() {
        return this.selectallfromdb.getOutcomes();
    }

    public ArrayList<OutcomeOdd> getOutcomeodds() {
        return this.selectallfromdb.getOutcomeodds();
    }

    public ArrayList<Player> getPlayers() {
        return this.selectallfromdb.getPlayers();
    }

    public FootballSportEvent getFootballsportevent() {
        return this.selectallfromdb.getFootballsportevent();
    }
    
     public Currency StringToCurrency(String strcurrency)
    {
        if (strcurrency.equals("HUF")) 
        {
            return Currency.HUF;
        }
        else if (strcurrency.equals("EUR"))
        {
            return Currency.EUR;
        }
        else
        {
            return Currency.USD;
        }
    }
}
