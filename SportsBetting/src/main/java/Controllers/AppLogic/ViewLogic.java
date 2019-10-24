package Controllers.AppLogic;

import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.SportEvent;
import Domain.Wager;
import UserInterface.Interfaces.IView;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ViewLogic 
{
    private IView view;
    
    public ViewLogic(IView view)
    {
        this.view = view;
    }
    public Player readPlayerData()
    {
        return this.view.readPlayerData();
    }
    
    public void printWelcomeMessage(Player player)
    {
        this.view.printWelcomeMessage(player);
    }
    
    public void printBalance(Player player)
    {
        this.view.printBalance(player);
    }
    
    public void printOutcomeOdds()
    {
        this.view.printOutcomeOdds();
    }
    
    public OutcomeOdd selectOutcomeOdd(ArrayList<SportEvent> sportevents)
    {
        return this.view.selectOutcomeOdd(sportevents);
    }
    
    public BigDecimal readWAgerAmount()
    {
        return this.view.readWAgerAmount();
    }
    
    public void printWagerSaved(Wager wager)
    {
        this.view.printWagerSaved(wager);
    }
    
    public boolean printNotEnoughBalance(Player player)
    {
        return this.view.printNotEnoughBalance(player);
    }
    
    public void printResults(Player player, ArrayList<Wager> wagers)
    {
        this.view.printResults(player, wagers);
    }
}
