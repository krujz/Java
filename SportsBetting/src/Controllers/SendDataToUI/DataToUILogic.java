package Controllers.SendDataToUI;

import Domain.Bet;
import Domain.Outcome;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.FootballSportEvent;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.DataFactory;
import java.util.ArrayList;

public class DataToUILogic 
{
    DataFactory datafactory;
    public DataToUILogic() throws OutcomeOddTimeOverlapException
    {
        datafactory = new DataFactory();
    }
    public ArrayList<String> getResults() {
        return this.datafactory.getResults();
    }

    public ArrayList<Bet> getBets() {
        return this.datafactory.getBets();
    }

    public ArrayList<Outcome> getOutcomes() {
        return this.datafactory.getOutcomes();
    }

    public ArrayList<OutcomeOdd> getOutcomeodds() {
        return this.datafactory.getOutcomeodds();
    }

    public ArrayList<Player> getPlayers() {
        return this.datafactory.getPlayers();
    }

    public FootballSportEvent getFootballsportevent() {
        return this.datafactory.getFootballsportevent();
    }
}
