package Controllers.Builders;

import Domain.OutcomeOdd;
import Global_packages.Enums.Currency;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OutcomeOddBuilder {
    
    BigDecimal value;
    LocalDateTime validFrom;
    LocalDateTime validUntil;
    Currency currency;

    public OutcomeOddBuilder setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public OutcomeOddBuilder setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public OutcomeOddBuilder setValidUntil(LocalDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public OutcomeOddBuilder setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }
    
    public OutcomeOdd getOutcomeOdd()
    {
        return new OutcomeOdd(value,validFrom,validUntil,currency);
    }
    
    
}
