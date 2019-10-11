package Domain;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getTimestampCreated() {
        return timestampCreated;
    }

    public boolean isProcessed() {
        return processed;
    }

    public boolean isWin() {
        return win;
    }

    public OutcomeOdd getOutcomeodd() {
        return outcomeodd;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Player getPlayer() {
        return player;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setTimestampCreated(LocalDateTime timestampCreated) {
        this.timestampCreated = timestampCreated;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public void setOutcomeodd(OutcomeOdd outcomeodd) {
        this.outcomeodd = outcomeodd;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    /*
    BigDecimal amount;
    LocalDateTime timestampCreated;
    boolean processed;
    boolean win;
    OutcomeOdd outcomeodd;
    Currency currency;
    Player player;
    */
    @Override
    public String toString()
    {
        return "Amount: "+this.amount + "\ntimestampcreated: " + this.timestampCreated + "\nOutcomeodd: " + this.outcomeodd.getValue() + "\nCurrency: " + this.currency + "\nPlayer name:" + this.player.getName();
    }
    
    
}
