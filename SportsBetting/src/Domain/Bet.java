package Domain;

import Domain.SportEvents.SportEvent;
import Global_packages.Enums.BetTypes;
import java.util.ArrayList;
import Controllers.Domain.Logic.BetLogic;

public class Bet {
    
    String description;
    SportEvent event;
    BetTypes bettypes;
    ArrayList<Outcome> outcomes;
    BetLogic betlogic;
    
    
    public Bet(String descritpion,SportEvent event, BetTypes bettypes, ArrayList<Outcome> outcome)
    {
        this.description = descritpion;
        this.event = event;
        this.bettypes = bettypes;
        this.outcomes = outcome;
        this.betlogic = new BetLogic();
    }
    
    

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEvent(SportEvent event) {
        this.event = event;
    }

    public void setBettypes(BetTypes bettypes) {
        this.bettypes = bettypes;
    }

    public void setOutcomes(ArrayList<Outcome> outcomes) {
        this.outcomes = outcomes;
    }

    public String getDescription() {
        return description;
    }

    public SportEvent getEvent() {
        return event;
    }

    public BetTypes getBettypes() {
        return bettypes;
    }

    public ArrayList<Outcome> getOutcomes() {
        return outcomes;
    }
    
    public String OutcomeDescription()
    {
        return this.betlogic.OutcomeDescription(this.outcomes);
    }
    
    public String BettypeTostring()
    {
        return betlogic.BettypeTostring(this.bettypes);
    }
    
    public void AddOutcome(Outcome new_outcome)
    {
        outcomes.add(new_outcome);
    }
    
    @Override
    public String toString()
    {
        return "Bet : \nDescription: " + this.description + " \nEvent: " + this.event.toString() + " \nBet type: " + BettypeTostring() + " \nOutcomes:\n " +OutcomeDescription(); 
    }
    
    
}
