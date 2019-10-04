package Data;

import Enums.BetTypes;
import Events.SportEvent;
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
}
