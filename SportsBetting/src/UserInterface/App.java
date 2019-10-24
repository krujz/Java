package UserInterface;

import Controllers.AppLogic.AppLogic;
import Controllers.AppLogic.SportsBettingServiceLogic;
import Controllers.AppLogic.ViewLogic;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.FootballSportEvent;
import Domain.SportEvents.SportEvent;
import Domain.Wager;
import Enums.Currency;
import Exceptions.OutcomeOddTimeOverlapException;
import Interfaces.ISportsBettingService;
import Repository.SportsBettingService;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    
    AppLogic applogic;
    public App() throws OutcomeOddTimeOverlapException
    {
        this.applogic = new AppLogic();
    }

    public void play() throws IOException
    {
       applogic.play();
    }
    public static void main(String[] args)
    {
        try
        {
            App app = new App();
            app.play();
        }
        catch(OutcomeOddTimeOverlapException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
       
        
    }
}
