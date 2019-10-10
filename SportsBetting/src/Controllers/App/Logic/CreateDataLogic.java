/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.App.Logic;

import Controllers.Builders.*;
import Controllers.Domain.Logic.BetLogic;
import Domain.Bet;
import Domain.SportEvents.SportEvent;
import Domain.Outcome;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.Result;
import Domain.SportEvents.FootballSportEvent;
import Enums.BetTypes;
import Enums.Currency;
import static java.lang.Math.random;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class CreateDataLogic {
    
    
    BetBuilder betbuilder;
    FootBallSportEventBuilder footballsporteventbuilder;
    OutcomeBuilder outcomebuilder;
    OutcomeOddBuilder outcomeoddbuilder;
    PlayerBuilder playerbuilder;

    public CreateDataLogic() 
    {
        
        this.betbuilder = new BetBuilder();
        this.footballsporteventbuilder = new FootBallSportEventBuilder();
        this.outcomebuilder = new OutcomeBuilder();
        this.outcomeoddbuilder = new OutcomeOddBuilder();
        this.playerbuilder = new PlayerBuilder();
    }
    
    
    public Bet CreateBet(String description,SportEvent event, BetTypes bettypes, ArrayList<Outcome> outcomes)
    {
        this.betbuilder.setDescription(description);
        this.betbuilder.setEvent(event);
        this.betbuilder.setBettypes(bettypes);
        this.betbuilder.setOutcomes(outcomes);
        return this.betbuilder.getBetBuilder();
        
    }
    
    public FootballSportEvent CreateFootBallSportEvent(String title, LocalDateTime start_date, LocalDateTime end_date, ArrayList<Bet> bets, Result results)
    {
        this.footballsporteventbuilder.setTitle(title);
        this.footballsporteventbuilder.setStart_date(start_date);
        this.footballsporteventbuilder.setEnd_date(end_date);
        this.footballsporteventbuilder.setBets(bets);
        this.footballsporteventbuilder.setResults(results);
        return this.footballsporteventbuilder.getFootballSportEvent();
        
    }
    
    public Outcome CreateOutcome(String description, Bet bet, ArrayList<OutcomeOdd> outcomeodds)
    {
        this.outcomebuilder.setDescription(description);
        this.outcomebuilder.setBet(bet);
        this.outcomebuilder.setOutcomeodds(outcomeodds);
        return this.outcomebuilder.getOutcome();
    }
    
    public OutcomeOdd CreateOutcomeOdd(BigDecimal value,LocalDateTime validFrom,LocalDateTime validUntil,Currency currency)
    {
        this.outcomeoddbuilder.setValue(value);
        this.outcomeoddbuilder.setValidFrom(validFrom);
        this.outcomeoddbuilder.setValidUntil(validUntil);
        this.outcomeoddbuilder.setCurrency(currency);
        return this.outcomeoddbuilder.getOutcomeOdd();
    }
    
    public Player CreatePlayer(String name,BigDecimal account_number,BigDecimal balance,Currency currency, LocalDateTime dateofbirth)
    {
        this.playerbuilder.setName(name);
        this.playerbuilder.setAccount_number(account_number);
        this.playerbuilder.setCurrency(currency);
        this.playerbuilder.setDateofbirth(dateofbirth);
        return this.playerbuilder.getPlayer();
    }
}
