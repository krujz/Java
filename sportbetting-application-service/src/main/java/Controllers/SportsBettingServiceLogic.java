package Controllers;

import Domain.Player;
import Domain.SportEvents.SportEvent;
import Domain.Wager;
import Repository.Interfaces.ISportsBettingService;

import java.util.ArrayList;

public class SportsBettingServiceLogic
{

    private ISportsBettingService sportbettingservice;
    public  SportsBettingServiceLogic(ISportsBettingService sportbettingservice)
    {
        this.sportbettingservice = sportbettingservice;
    }

    public void SavePlayer(Player player)
    {
        this.sportbettingservice.SavePlayer(player);
    }



    public Player findPlayer()
    {
        return this.sportbettingservice.findPlayer();
    }


    public ArrayList<SportEvent> findAllSportEvents()
    {
        return this.sportbettingservice.findAllSportEvents();
    }


    public void saveWaget(Wager wager)
    {
        this.sportbettingservice.saveWaget(wager);
    }


    public ArrayList<Wager> findAllWagers()
    {
        return this.sportbettingservice.findAllWagers();
    }


    public void CalculateResults()
    {
        this.sportbettingservice.CalculateResults();

    }
}



