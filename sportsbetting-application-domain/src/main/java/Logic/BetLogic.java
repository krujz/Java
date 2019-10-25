package Logic;

import Domain.Outcome;
import Global_packages.Enums.BetTypes;

import java.util.ArrayList;

public class BetLogic {

    public String OutcomeDescription(ArrayList<Outcome> outcomes)
    {
        int i = 0;
        String AppendedOutcomeDescription = "";
        for(Outcome outcome : outcomes)
        {
            AppendedOutcomeDescription+= i++ +". " + outcome.getDescription()+"\n";
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
