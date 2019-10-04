package Data;

import Enums.Currency;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Wager {
    
    BigDecimal amount;
    LocalDateTime timestampCreated;
    boolean processed;
    boolean win;
    OutcomeOdd outcomeodd;
    Currency currency;
    Player player;
    
    public Wager(BigDecimal amount, LocalDateTime timestampCreated,
            boolean processed, boolean win, OutcomeOdd outcomeodd,Currency currency,Player player)
    {
        this.amount = amount;
        this.timestampCreated = timestampCreated;
        this.processed = processed;
        this.win = win;
        this.outcomeodd = outcomeodd;
        this.currency = currency;
        this.player = player;
        
    }
}
