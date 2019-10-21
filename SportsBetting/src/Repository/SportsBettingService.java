package Repository;

import DataBase.DataFactory;
import Domain.Player;
import Domain.Result;
import Domain.SportEvents.SportEvent;
import Domain.Wager;
import Exceptions.OutcomeOddTimeOverlapException;
import Interfaces.ISportsBettingService;
import java.math.BigDecimal;
import java.util.ArrayList;

public class SportsBettingService implements ISportsBettingService {

    private DataFactory datafactory;
    
    public  SportsBettingService() throws OutcomeOddTimeOverlapException
    {
        this.datafactory = new DataFactory();
    }
    @Override
    public void SavePlayer(Player player) 
    {
        this.datafactory.SetPlayer(player);
    }

    @Override
    public Player findPlayer() {
        return this.datafactory.getPlayers().get(0);
    }

    @Override
    public ArrayList<SportEvent> findAllSportEvents() {
        
        ArrayList<SportEvent> sportevents = new ArrayList<SportEvent>();
        sportevents.add(this.datafactory.getFootballsportevent());
        return sportevents;
    }

    @Override
    public void saveWaget(Wager wager) 
    {
        this.datafactory.AddWager(wager);
    }

    @Override
    public ArrayList<Wager> findAllWagers() {
       return this.datafactory.getWagers();
    }

    @Override
    public void CalculateResults() {
        
        ArrayList<String> results = new ArrayList<String>();
        results.add("Arsenal nyert");
        results.add("gólok száma 2");
        
        this.datafactory.AddResult(new Result(results));
        
        for (int i = 0; i < this.datafactory.getWagers().size(); i++) 
        {
            if (this.datafactory.getWagers().get(i).getOutcomeodd().getValue() == new BigDecimal("1") ||
                this.datafactory.getWagers().get(i).getOutcomeodd().getValue() == new BigDecimal("2")) 
            {
                 this.datafactory.getWagers().get(i).setWin(true);
            }
            else
            {
                this.datafactory.getWagers().get(i).setWin(false);
            }
           
            
        }
        
    }
    
}
