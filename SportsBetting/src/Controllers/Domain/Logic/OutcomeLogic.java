package Controllers.Domain.Logic;

import Domain.OutcomeOdd;
import Exceptions.OutcomeOddTimeOverlapException;
import java.util.ArrayList;

public class OutcomeLogic {
    
    
    public ArrayList<OutcomeOdd> AddOutcomeOdds(OutcomeOdd newOutcomeOdd,ArrayList<OutcomeOdd> outcomeodds) throws OutcomeOddTimeOverlapException
    {
        if (!CheckOverlap(newOutcomeOdd,outcomeodds)) {
            outcomeodds.add(newOutcomeOdd);
            return outcomeodds;
        }
        else
        {
            throw new OutcomeOddTimeOverlapException("The time of the odds are overlapped");
        }
        
    }
    
    private boolean CheckOverlap(OutcomeOdd checkableoutcome,ArrayList<OutcomeOdd> outcomeodds)
    {
        int index = 0;
        while(index < outcomeodds.size())
        {
            if (outcomeodds.get(index).getValidFrom().equals(checkableoutcome.getValidFrom())) {
                return true;
            }
            index++;
        }
        return false;
    }
    
    public String AppendOutcomeOdds(ArrayList<OutcomeOdd> outcomeodds)
    {
        String AppendableOutcomeOdds = "";
        
        for(OutcomeOdd outcomeodd : outcomeodds)
        {
            AppendableOutcomeOdds += outcomeodd +"\n";
        }
        return AppendableOutcomeOdds;
    }
}
