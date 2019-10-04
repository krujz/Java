package Data;

import Enums.Currency;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OutcomeOdd {
    
    BigDecimal value;
    LocalDateTime validFrom;
    LocalDateTime validUntil;
    Currency currency;
    
    public OutcomeOdd(BigDecimal value,LocalDateTime validFrom,LocalDateTime validUntil,Currency currency)
    {
        this.value = value;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.currency = currency;
    }
    
}
