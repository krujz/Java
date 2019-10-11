package UserInterface;

import Controllers.AppLogic.AppLogic;
import Controllers.AppLogic.SportsBettingServiceLogic;
import Controllers.AppLogic.ViewLogic;
import Domain.Player;
import Domain.SportEvents.FootballSportEvent;
import Domain.SportEvents.SportEvent;
import Enums.Currency;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.Interfaces.ISportsBettingService;
import Repository.SportsBettingService;
import Repository.View;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    SportsBettingServiceLogic sportsbettingservicelogic;
    ViewLogic viewlogic;
    long accountnumber = 0;
    
    AppLogic applogic;
    public App() throws OutcomeOddTimeOverlapException
    {
        this.sportsbettingservicelogic = new SportsBettingServiceLogic(new SportsBettingService());
        this.viewlogic = new ViewLogic(new View());
        this.applogic = new AppLogic();
    }
    
    public void play() throws IOException
    {
       Scanner input = new Scanner(System.in);
       System.out.println("What is your name?");
       String name = input.nextLine();
       System.out.println("How much money do you have?(more than 0)");
       long amountmoney = input.nextInt();
       System.out.println("What is your currency? ( HUF, EUR, USD)\n");
       Scanner currencyinput = new Scanner(System.in);
       String currency = currencyinput.nextLine();
       Currency playercurrency = applogic.StringToCurrency(currency);
       Player newplayer = new Player(name,new BigDecimal(accountnumber++),new BigDecimal(amountmoney),playercurrency,LocalDateTime.of(1997, Month.MARCH, 1, 1, 1));
       this.sportsbettingservicelogic.SavePlayer(newplayer);
       
       this.viewlogic.printWelcomeMessage(newplayer);
       FootballSportEvent footballsportevent = this.applogic.getFootballsportevent();
       ArrayList<SportEvent> sportevents = new ArrayList<SportEvent>();
       sportevents.add(footballsportevent);
       int counter = 0;
       this.viewlogic.printOutcomeOdds(sportevents);
       Scanner choosennumberscanner = new Scanner(System.in);
       int choosennumber = choosennumberscanner.nextInt();
       this.sportsbettingservicelogic.findAllSportEvents().get(choosennumber);
       
       
       
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
