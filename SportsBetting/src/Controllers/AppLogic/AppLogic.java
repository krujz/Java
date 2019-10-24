package Controllers.AppLogic;

import Domain.Bet;
import Domain.Outcome;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.FootballSportEvent;
import Domain.Wager;
import Global_packeges.Enums.Currency;
import Global_packeges.Exceptions.OutcomeOddTimeOverlapException;
import Repository.DataSelectorFromDB;
import Repository.SportsBettingService;
import UserInterface.View;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class AppLogic 
{
    SportsBettingServiceLogic sportsbettingservicelogic;
    ViewLogic viewlogic;
    long accountnumber = 0;
    DataSelectorFromDB selectallfromdb;

    public AppLogic() throws OutcomeOddTimeOverlapException
    {
        this.selectallfromdb = new DataSelectorFromDB();
        this.sportsbettingservicelogic = new SportsBettingServiceLogic(new SportsBettingService());
        this.viewlogic = new ViewLogic(new View());
    }

    public ArrayList<String> getResults() {
        return this.selectallfromdb.getResults();
    }

    public ArrayList<Bet> getBets() {
        return this.selectallfromdb.getBets();
    }

    public ArrayList<Outcome> getOutcomes() {
        return this.selectallfromdb.getOutcomes();
    }

    public ArrayList<OutcomeOdd> getOutcomeodds() {
        return this.selectallfromdb.getOutcomeodds();
    }

    public ArrayList<Player> getPlayers() {
        return this.selectallfromdb.getPlayers();
    }

    public FootballSportEvent getFootballsportevent() {
        return this.selectallfromdb.getFootballsportevent();
    }
    
    public ArrayList<Wager> getWagers() {
        return this.selectallfromdb.getWagers();
    }
    
    public Currency StringToCurrency(String strcurrency){
        if (strcurrency.equals("HUF")) 
        {
            return Currency.HUF;
        }
        else if (strcurrency.equals("EUR"))
        {
            return Currency.EUR;
        }
        else
        {
            return Currency.USD;
        }
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
        Currency playercurrency = this.StringToCurrency(currency);
        Player newplayer = new Player(name,new BigDecimal(accountnumber++),new BigDecimal(amountmoney),playercurrency, LocalDateTime.of(1997, Month.MARCH, 1, 1, 1));
        this.sportsbettingservicelogic.SavePlayer(newplayer);
        return newplayer;
    }

    public ArrayList<Wager> doBetting(Player newplayer)
    {
        String choosenletter = "";
        int choosennumber=-1;
        Wager wager;
        //ArrayList<Wager> wagers = new ArrayList<Wager>();
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
                wager = new Wager(new BigDecimal("100"),LocalDateTime.now(),false,false,this.getOutcomeodds().get((choosennumber)),newplayer.getCurrency(),newplayer);
                System.out.println(wager);

                if (this.viewlogic.printNotEnoughBalance(newplayer))
                {
                    System.out.println("Not Enough balance ! ");
                }
                else
                {
                    newplayer.setBalance();
                    this.sportsbettingservicelogic.saveWaget(wager);
                    //wagers.add(wager);
                    this.viewlogic.printWagerSaved(wager);
                }
            }
        }
        return this.getWagers();
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
}
