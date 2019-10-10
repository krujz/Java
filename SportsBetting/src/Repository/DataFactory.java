/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Controllers.App.Logic.DataManufacturerLogic;
import Domain.Bet;
import Domain.Outcome;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.Result;
import Domain.SportEvents.FootballSportEvent;
import Enums.BetTypes;
import Enums.Currency;
import Exceptions.OutcomeOddTimeOverlapException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author komol
 */
public class DataFactory 
{    
    DataManufacturerLogic datamanufacturerlogic;
    ArrayList<String> results;
    ArrayList<Bet> bets ;
    ArrayList<Outcome> outcomes ;
    ArrayList<OutcomeOdd> outcomeodds;
    ArrayList<Player> players;
    FootballSportEvent footballsportevent;
    
    
    public DataFactory() throws OutcomeOddTimeOverlapException
    {
        this.datamanufacturerlogic = new DataManufacturerLogic();
        this.results = new ArrayList<String>();
        this.bets = new ArrayList<Bet>();
        this.outcomes = new ArrayList<Outcome>();
        this.outcomeodds = new ArrayList<OutcomeOdd>();
        this.players = new ArrayList<Player>();
        this.footballsportevent = this.SetFootballSportEvent();
        
        this.outcomes.get(0).AddOutcomeOdds(outcomeodds.get(0));
        this.outcomes.get(1).AddOutcomeOdds(outcomeodds.get(1));
        this.outcomes.get(2).AddOutcomeOdds(outcomeodds.get(2));
        this.outcomes.get(2).AddOutcomeOdds(outcomeodds.get(3));
        
        this.bets.get(0).AddOutcome(this.outcomes.get(0));
        this.bets.get(1).AddOutcome(this.outcomes.get(1));
        this.bets.get(1).AddOutcome(this.outcomes.get(2));
        
    }
    public void SetPlayer()
    {
        long account_number = 0;
        this.players.add(this.datamanufacturerlogic.CreatePlayer("Vicc Elek", BigDecimal.ONE, BigDecimal.valueOf(account_number++), Currency.EUR, LocalDateTime.of(1997, Month.MARCH, 10, 10, 10)));
    }
    
    public FootballSportEvent SetFootballSportEvent()
    {
        this.results.add("A győztes csapat az ARSENAL");
        this.results.add("A gólok száma 2");
        return this.datamanufacturerlogic.CreateFootBallSportEvent("Arsenal vs Tottenham",LocalDateTime.now(),LocalDateTime.of(2020, Month.MARCH, 10, 10, 10),new ArrayList<Bet>(),new Result(results));
    }
    
    public void SetBets(FootballSportEvent footballsportevent)
    {
        this.bets.add(new Bet("Nyerő csapar",footballsportevent,BetTypes.WINNER,new ArrayList<Outcome>()));
        this.bets.add(new Bet("Gólok száma",footballsportevent,BetTypes.GOALS,new ArrayList<Outcome>()));
    }
    
    public void SetOutcomes(ArrayList<Bet> bets)
    {
        this.outcomes.add(this.datamanufacturerlogic.CreateOutcome("több mint 1", bets.get(0), new ArrayList<OutcomeOdd>()));
        this.outcomes.add(this.datamanufacturerlogic.CreateOutcome("Arsenal", bets.get(0), new ArrayList<OutcomeOdd>()));
        this.outcomes.add(this.datamanufacturerlogic.CreateOutcome("Tottenham", bets.get(1), new ArrayList<OutcomeOdd>()));
    }
    
    public void SetOutcomeOdds()
    {
        this.outcomeodds.add(this.datamanufacturerlogic.CreateOutcomeOdd(new BigDecimal("12"), LocalDateTime.now(),LocalDateTime.of(2020, Month.MARCH, 10, 10, 10), Currency.EUR));
        this.outcomeodds.add(this.datamanufacturerlogic.CreateOutcomeOdd(new BigDecimal("2"), LocalDateTime.now(),LocalDateTime.of(2020, Month.MARCH, 10, 10, 10), Currency.EUR));
        this.outcomeodds.add(this.datamanufacturerlogic.CreateOutcomeOdd(new BigDecimal("30"), LocalDateTime.now(),LocalDateTime.of(2020, Month.MARCH, 10, 10, 10), Currency.EUR));
        this.outcomeodds.add(this.datamanufacturerlogic.CreateOutcomeOdd(new BigDecimal("10"), LocalDateTime.now(),LocalDateTime.of(2020, Month.MARCH, 10, 10, 10), Currency.EUR));
    }

    public ArrayList<String> getResults() {
        return results;
    }

    public ArrayList<Bet> getBets() {
        return bets;
    }

    public ArrayList<Outcome> getOutcomes() {
        return outcomes;
    }

    public ArrayList<OutcomeOdd> getOutcomeodds() {
        return outcomeodds;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public FootballSportEvent getFootballsportevent() {
        return footballsportevent;
    }
    
    
}
