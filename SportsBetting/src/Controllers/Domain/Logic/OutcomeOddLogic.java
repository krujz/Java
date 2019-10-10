package Controllers.Domain.Logic;

import Enums.Currency;

public class OutcomeOddLogic {
    
     public String CurrencyToString(Currency currency)
    {
        if (currency == Currency.EUR) {
            return "EUR";
        }
        else if (currency == Currency.HUF) {
            return "HUF";
        }
        else
        {
            return "USD";
        }
    }
    
}
