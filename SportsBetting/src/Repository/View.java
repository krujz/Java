package Repository;

import DataBase.DataFactory;
import Domain.Bet;
import Domain.Outcome;
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
        System.out.println(this.datafactory.getPlayers().get(playerindex).getBalance()+ " "+ this.datafactory.getPlayers().get(playerindex).getCurrency().toString());
    }

    @Override
    public void printOutcomeOdds(ArrayList<SportEvent> sportevents) {
        for(SportEvent sportevent : sportevents)
        {
            System.out.println(sportevent.getBets().toString());
            sportevent.getBets().forEach(x ->System.out.println(x.getOutcomes().toString()));
        }
    }

    @Override // Not going to do anything with the param because of the too many cycle-s
    public OutcomeOdd selectOutcomeOdd(ArrayList<SportEvent> sportevents) {
        OutcomeOdd minoutcomeodd = null;
        BigDecimal minvalue = new BigDecimal("10000000");
        for(OutcomeOdd outcomeodd : this.datafactory.getOutcomeodds())
        {
            if ((outcomeodd.getValue().compareTo(minvalue)) == -1) 
            {
                minvalue = outcomeodd.getValue();
                minoutcomeodd = outcomeodd;
            }
        }
        return minoutcomeodd;
    }

    @Override // Which one???
    public BigDecimal readWAgerAmount() {
        return this.datafactory.getWagers().get(0).getAmount() ;
    }

    @Override
    public void printWagerSaved(Wager wager) 
    {
        this.datafactory.AddWager(wager);
        System.out.println("Wager saved ! ");
    }

    @Override // no param for the amount money he/she wanted to play with , default amount is 100
    public void printNotEnoughBalance(Player player) {
        
        BigDecimal defaultamount = new BigDecimal("100");
        if (defaultamount.compareTo(player.getBalance()) == 1 ) 
        {
            System.out.println("Not Enough balance ! ");
        }
    }

    @Override // Didn t have to set the connections between the sportevent class
    public void printResults(Player player, ArrayList<Wager> wagers) 
    {
        this.datafactory.getFootballsportevent().getResults();
    }
    
}
