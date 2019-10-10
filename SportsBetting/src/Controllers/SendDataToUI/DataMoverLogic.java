package Controllers.SendDataToUI;

import Domain.Bet;
import Domain.Outcome;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.FootballSportEvent;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.DataSelectorFromDB;
import java.util.ArrayList;

public class DataMoverLogic 
{
    DataSelectorFromDB selectallfromdb;
    public DataMoverLogic() throws OutcomeOddTimeOverlapException
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
}
