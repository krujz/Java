package Controllers.Builders;

import Domain.Bet;
import Domain.Outcome;
import Domain.SportEvents.SportEvent;
import Enums.BetTypes;
import java.util.ArrayList;

public class BetBuilder {
    
    String description;
    SportEvent event;
    BetTypes bettypes;
    ArrayList<Outcome> outcomes;

    
    public BetBuilder()
    {
        outcomes = new ArrayList<Outcome>();
    }
    public BetBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public BetBuilder setEvent(SportEvent event) {
        this.event = event;
        return this;
    }

    public BetBuilder setBettypes(BetTypes bettypes) {
        this.bettypes = bettypes;
        return this;
    }

    public BetBuilder setOutcomes(ArrayList<Outcome> outcomes) {
        this.outcomes = outcomes;
        return this;
    }
    
    public BetBuilder addOutcome(Outcome outcome)
    {
        this.outcomes.add(outcome);
        return this;
    }
    
    public Bet getBetBuilder()
    {
        return new Bet(description,event,bettypes,outcomes);
    }
     
    
}
