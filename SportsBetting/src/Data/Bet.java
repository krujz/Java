package Data;

import Data.SportEvents.SportEvent;
import Enums.BetTypes;
import java.util.List;

public class Bet {
    
    String description;
    SportEvent event;
    BetTypes bettypes;
    List<Outcome> outcomes;
    
    public void AddOutcome(Outcome new_outcome)
    {
        outcomes.add(new_outcome);
    }
    
    private String OutcomeDescription()
    {
        String AppendedOutcomeDescription = "";
        for(Outcome outcome : this.outcomes)
        {
            AppendedOutcomeDescription+= "\t" + outcome.description;
        }
        return AppendedOutcomeDescription;
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

    public void setOutcomes(List<Outcome> outcomes) {
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

    public List<Outcome> getOutcomes() {
        return outcomes;
    }
    
    
    public String BettypeTostring()
    {
        if (this.bettypes == BetTypes.GOALS) {
            return "Goals";
        }
        else if (this.bettypes == BetTypes.NUMBER_OF_SETS) {
            return "Number of sets";
        }
        else if (this.bettypes == BetTypes.PLAYERS_SCORE) {
            return "Player score";
        }
        else
        {
            return "Winner";
        }
        
       
    }
    
    @Override
    public String toString()
    {
        return "Description: " + this.description + "\nEvent: " + this.event.toString() + "\nBet type: " + BettypeTostring() + "\nOutcomes: " +OutcomeDescription(); 
    }
    
    
}
