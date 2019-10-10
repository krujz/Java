package Domain;

import Controllers.Domain.Logic.OutcomeLogic;
import Exceptions.OutcomeOddTimeOverlapException;
import java.util.ArrayList;

public class Outcome {
    
    String description;
    Bet bet;
    ArrayList<OutcomeOdd> outcomeodds;
    OutcomeLogic outcomelogic;

    public Outcome(String description, Bet bet, ArrayList<OutcomeOdd> outcomeodds)
    {
        this.description = description;
        this.bet = bet;
        this.outcomeodds = outcomeodds;
        this.outcomelogic = new OutcomeLogic();
    }
    
    public String getDescription() {
        return description;
    }

    public Bet getBet() {
        return bet;
    }

    public ArrayList<OutcomeOdd> getOutcomeodds() {
        return outcomeodds;
    }
    
    public void AddOutcomeOdds(OutcomeOdd newOutcomeOdd) throws OutcomeOddTimeOverlapException
    {
        outcomelogic.AddOutcomeOdds(newOutcomeOdd, this.outcomeodds);
    }
        
    private String AppendOutcomeOdds()
    {
        return outcomelogic.AppendOutcomeOdds(outcomeodds);
    }
    
    @Override
    public String toString()
    {
        return "Description: " + this.description + "\tBet: " + this.bet.getDescription() + "\tOutcome odds: " + this.AppendOutcomeOdds();
    }
}
