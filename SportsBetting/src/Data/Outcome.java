package Data;

import Exceptions.OutcomeOddTimeOverlapException;
import java.util.List;

public class Outcome {
    
    String description;
    Bet bet;
    List<OutcomeOdd> outcomeodds;
    
    public Outcome(String description, Bet bet)
    {
        this.description = description;
        this.bet = bet;
    }
    
    public void AddOutcomeOdds(OutcomeOdd newOutcomeOdd) throws OutcomeOddTimeOverlapException
    {
        if (!CheckOverlap(newOutcomeOdd)) {
            outcomeodds.add(newOutcomeOdd);
        }
        else
        {
            throw new OutcomeOddTimeOverlapException("The time of the odds are overlapped");
        }
        
    }
    
    public boolean CheckOverlap(OutcomeOdd checkableoutcome)
    {
        int index = 0;
        while(index < outcomeodds.size())
        {
            if (outcomeodds.get(index).validFrom.equals(checkableoutcome.validFrom)) {
                return true;
            }
            index++;
        }
        return false;
    }
    
    private String AppendOutcomeOdds()
    {
        String AppendableOutcomeOdds = "";
        
        for(OutcomeOdd outcomeodd : outcomeodds)
        {
            AppendableOutcomeOdds += outcomeodd + "\n";
        }
        return AppendableOutcomeOdds;
    }
    
    @Override
    public String toString()
    {
        return "Description: " + this.description + "\tBet: " + this.bet.getDescription() + "\tOutcome odds: " + this.AppendOutcomeOdds();
    }
}
