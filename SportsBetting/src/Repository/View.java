package Repository;

import DataBase.DataFactory;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.SportEvent;
import Domain.Wager;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.Interfaces.IView;
import java.math.BigDecimal;
import java.util.ArrayList;

public class View implements IView{

    DataFactory datafactory;
    public View() throws OutcomeOddTimeOverlapException
    {
        this.datafactory = new DataFactory();
    }
    
    @Override
    public Player readPlayerData() {
        return this.datafactory.getPlayers().get(0);
    }

    @Override
    public void printWelcomeMessage(Player player) {
        System.out.println("What is your name?");
    }

    @Override
    public void printBalance(Player player) {
        int playerindex = this.datafactory.getPlayers().indexOf(player);
        System.out.println(this.datafactory.getPlayers().get(playerindex).getBalance()+ " "+ this.datafactory.getPlayers().get(playerindex).getCurrency().toString() );
    }

    @Override
    public void printOutcomeOdds(ArrayList<SportEvent> sportevents) {
        for(SportEvent sportevent : sportevents)
        {
            System.out.println(sportevent.getBets().toString());
            sportevent.getBets().forEach(x ->System.out.println(x.getOutcomes().toString()));
        }
    }

    @Override
    public OutcomeOdd selectOutcomeOdd(ArrayList<SportEvent> sportevents) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BigDecimal readWAgerAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printWagerSaved(Wager wager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printNotEnoughBalance(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printResults(Player player, ArrayList<Wager> wagers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
