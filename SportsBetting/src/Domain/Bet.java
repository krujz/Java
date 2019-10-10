package Domain;

import Domain.SportEvents.SportEvent;
import Enums.BetTypes;
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
        this.description = description;
        this.event = event;
        this.bettypes = bettypes;
        this.outcomes = outcomes;
        this.betlogic = new BetLogic();
    }
    
    public String OutcomeDescription()
    {
        return this.betlogic.OutcomeDescription(this.outcomes);
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
        return "Description: " + this.description + "\nEvent: " + this.event.toString() + "\nBet type: " + BettypeTostring() + "\nOutcomes: " +OutcomeDescription(); 
    }
    
    
}
