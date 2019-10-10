package UserInterface;

import Controllers.App.Logic.CreateDataLogic;
import Domain.Bet;
import Domain.Outcome;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.Result;
import Domain.SportEvents.FootballSportEvent;
import Enums.BetTypes;
import Enums.Currency;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.Interfaces.ISportsBettingService;
import Repository.Interfaces.IView;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class App {

    CreateDataLogic createdatalogic;

    public App(ISportsBettingService isportbettingservice,IView iview) {
        long account_number = 0;
        this.createdatalogic = new CreateDataLogic();
        ArrayList<Player> players = new ArrayList<Player>(); 
        FootballSportEvent footballevent = this.createdatalogic.CreateFootBallSportEvent("Arsenal vs Tottenham",LocalDateTime.now(),LocalDateTime.of(2020, Month.MARCH, 10, 10, 10), new ArrayList<Bet>(),new Result(new ArrayList<String>()));
        //add bet and result strings
        Bet bet = new Bet("Nyerő csapar",footballevent,BetTypes.WINNER,new ArrayList<Outcome>());
        Outcome firstoutcome = this.createdatalogic.CreateOutcome("több mint 1", bet, new ArrayList<OutcomeOdd>());
        OutcomeOdd firstvalofoutcome = this.createdatalogic.CreateOutcomeOdd(BigDecimal.ONE, LocalDateTime.now(),LocalDateTime.of(2020, Month.MARCH, 10, 10, 10), Currency.EUR);
        Player vicc_elek = this.createdatalogic.CreatePlayer("Vicc Elek", BigDecimal.ONE, BigDecimal.valueOf(account_number++), Currency.EUR, LocalDateTime.of(1997, Month.MARCH, 10, 10, 10));
    }
    
    public void play()
    {
        
    }
    
    public void createPlayer(){
        
    }
    
    public void doBetting()
    {
        
    }
    
    public void calculateResults()
    {
        
    }
    
    public void printResults()
    {
        
    }

    
    public static void main(String[] args) {
       
        
//        try{
//            
//        }
//        catch(OutcomeOddTimeOverlapException e){
//            System.out.println(e.getMessage());
//        }
    }
}
