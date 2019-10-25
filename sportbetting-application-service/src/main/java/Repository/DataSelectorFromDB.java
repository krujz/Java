/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DataBase.DataFactory;
import Domain.Bet;
import Domain.Outcome;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.FootballSportEvent;
import Domain.Wager;
import Global_packages.Exceptions.OutcomeOddTimeOverlapException;
import java.util.ArrayList;

public class DataSelectorFromDB {

    DataFactory datafactory;
    public DataSelectorFromDB() throws OutcomeOddTimeOverlapException
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

    public ArrayList<Wager> getWagers() {
        return this.datafactory.getWagers();
    }
}
