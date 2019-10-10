package Controllers.Domain.Logic;

import Domain.Outcome;
import Enums.BetTypes;
import java.util.ArrayList;

public class BetLogic {
    
    public String OutcomeDescription(ArrayList<Outcome> outcomes)
    {
        String AppendedOutcomeDescription = "";
        for(Outcome outcome : outcomes)
        {
            AppendedOutcomeDescription+= "\t" + outcome.getDescription();
        }
        return AppendedOutcomeDescription;
    }
    
    public String BettypeTostring(BetTypes bettypes)
    {
        if (bettypes == BetTypes.GOALS) {
            return "Goals";
        }
        else if (bettypes == BetTypes.NUMBER_OF_SETS) {
            return "Number of sets";
        }
        else if (bettypes == BetTypes.PLAYERS_SCORE) {
            return "Player score";
        }
        else
        {
            return "Winner";
        }
        
       
    }
}
