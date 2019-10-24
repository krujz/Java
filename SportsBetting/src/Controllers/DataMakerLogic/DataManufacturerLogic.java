/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.DataMakerLogic;

import Controllers.Builders.*;
import Domain.Bet;
import Domain.SportEvents.SportEvent;
import Domain.Outcome;
import Domain.OutcomeOdd;
import Domain.Player;
import Domain.Result;
import Domain.SportEvents.FootballSportEvent;
import Global_packeges.Enums.BetTypes;
import Global_packeges.Enums.Currency;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class DataManufacturerLogic {
    
    BetBuilder betbuilder;
    FootBallSportEventBuilder footballsporteventbuilder;
    OutcomeBuilder outcomebuilder;
    OutcomeOddBuilder outcomeoddbuilder;
    PlayerBuilder playerbuilder;
    

    public DataManufacturerLogic() 
    {
        this.betbuilder = new BetBuilder();
        this.footballsporteventbuilder = new FootBallSportEventBuilder();
        this.outcomebuilder = new OutcomeBuilder();
        this.outcomeoddbuilder = new OutcomeOddBuilder();
        this.playerbuilder = new PlayerBuilder();
    }

    public Bet CreateBet(String description,SportEvent event, BetTypes bettypes, ArrayList<Outcome> outcomes)
    {
        return this.betbuilder.setDescription(description).setEvent(event).setBettypes(bettypes).setOutcomes(outcomes).getBetBuilder();      
    }
    
    public FootballSportEvent CreateFootBallSportEvent(String title, LocalDateTime start_date, LocalDateTime end_date, ArrayList<Bet> bets, Result results)
    {
        return this.footballsporteventbuilder.setTitle(title).setStart_date(start_date).setEnd_date(end_date).setBets(bets).setResults(results).getFootballSportEvent();        
    }
    
    public Outcome CreateOutcome(String description, Bet bet, ArrayList<OutcomeOdd> outcomeodds)
    {
        return this.outcomebuilder.setDescription(description).setBet(bet).setOutcomeodds(outcomeodds).getOutcome();
    }
    
    public OutcomeOdd CreateOutcomeOdd(BigDecimal value,LocalDateTime validFrom,LocalDateTime validUntil,Currency currency)
    {
        return this.outcomeoddbuilder.setValue(value).setValidFrom(validFrom).setValidUntil(validUntil).setCurrency(currency).getOutcomeOdd();
    }
    
    public Player CreatePlayer(String name,BigDecimal account_number,BigDecimal balance,Currency currency, LocalDateTime dateofbirth)
    {
        return this.playerbuilder.setName(name).setAccount_number(account_number).setCurrency(currency).setDateofbirth(dateofbirth).getPlayer();
    }
    
    
}
