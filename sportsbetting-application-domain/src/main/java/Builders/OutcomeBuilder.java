package Builders;

import Domain.Bet;
import Domain.Outcome;
import Domain.OutcomeOdd;
import java.util.ArrayList;

public class OutcomeBuilder {

    String description;
    Bet bet;
    ArrayList<OutcomeOdd> outcomeodds;

    public OutcomeBuilder() {
        outcomeodds = new ArrayList<OutcomeOdd>();
    }

    public OutcomeBuilder addOutcomeOdd(OutcomeOdd outcomeodd)
    {
        this.outcomeodds.add(outcomeodd);
        return this;
    }

    public OutcomeBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public OutcomeBuilder setBet(Bet bet) {
        this.bet = bet;
        return this;
    }

    public OutcomeBuilder setOutcomeodds(ArrayList<OutcomeOdd> outcomeodds) {
        this.outcomeodds = outcomeodds;
        return this;
    }

    public Outcome getOutcome()
    {
        return new Outcome(description,bet,outcomeodds);
    }



}
