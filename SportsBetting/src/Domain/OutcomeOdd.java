package Domain;

import Controllers.Domain.Logic.OutcomeOddLogic;
import Enums.Currency;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OutcomeOdd {
    
    BigDecimal value;
    LocalDateTime validFrom;
    LocalDateTime validUntil;
    Currency currency;
    OutcomeOddLogic outcomeoddlogic;
    
     public OutcomeOdd(BigDecimal value,LocalDateTime validFrom,LocalDateTime validUntil,Currency currency)
    {
        this.value = value;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.currency = currency;
        this.outcomeoddlogic = new OutcomeOddLogic();
    }
    
    public BigDecimal getValue() {
        return value;
    }

    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(LocalDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    private String CurrencyToString()
    {
        return this.outcomeoddlogic.CurrencyToString(this.currency);
    }
    
    @Override
    public String toString()
    {
        return "Value: " + this.value + "\tValid from: " + this.validFrom + "\tValid until: " + this.validUntil + "\tCurrency: " + CurrencyToString();
    }
    
    
}
