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
    
    public Player createPlayer()
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
       return newplayer;
    }
    
    public ArrayList<Wager> doBetting(Player newplayer)
    {
       String choosenletter = "";
       int choosennumber=-1;
       Wager wager;
       ArrayList<Wager> wagers = new ArrayList<Wager>();
       while(!choosenletter.equals("q"))
       {
            this.viewlogic.printWelcomeMessage(newplayer); 
            this.viewlogic.printOutcomeOdds();
            Scanner choosennumberscanner = new Scanner(System.in);
            choosenletter = choosennumberscanner.nextLine();
            if (choosenletter.equals("1")) 
            {
               choosennumber = 1;
            }
            else if(choosenletter.equals("2"))
            {
                choosennumber = 0;
            }
            else
            {
                choosennumber = 2;
            }
            if (!choosenletter.equals( "q"))
            {
                wager = new Wager(new BigDecimal("100"),LocalDateTime.now(),false,false,this.applogic.getOutcomeodds().get((choosennumber)),newplayer.getCurrency(),newplayer);
                System.out.println(wager.toString());

                if (this.viewlogic.printNotEnoughBalance(newplayer)) 
                {
                   System.out.println("Not Enough balance ! ");
                }
                else
                {
                    newplayer.setBalance();
                    this.sportsbettingservicelogic.saveWaget(wager);
                    wagers.add(wager);
                    this.viewlogic.printWagerSaved(wager);
                }
            }
       }
       return wagers;
    }
    
    public void calculateResults()
    {
       this.sportsbettingservicelogic.CalculateResults();
       
    
    }
    
    public void printResults(Player newplayer,ArrayList<Wager> wagers)
    {
        System.out.println("THE RESULTS:");
        this.viewlogic.printResults(newplayer, wagers);
        System.out.println("Viszlát");
    }
    
    public void play() throws IOException
    {
       Player newplayer = this.createPlayer();
       ArrayList<Wager> wagers = this.doBetting(newplayer);
       this.calculateResults();
       this.printResults(newplayer, wagers);
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
