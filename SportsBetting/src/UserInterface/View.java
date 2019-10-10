package UserInterface;

import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.SportEvent;
import Domain.Wager;
import Repository.Interfaces.IView;
import java.math.BigDecimal;
import java.util.ArrayList;

public class View implements IView{

    @Override
    public Player readPlayerData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printWelcomeMessage(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printBalance(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printOutcomeOdds(ArrayList<SportEvent> sportevent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OutcomeOdd selectOutcomeOdd(ArrayList<SportEvent> sportevent) {
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
