package Controllers.Domain.Logic;

import Global_packeges.Enums.Currency;

public class OutcomeOddLogic {
    
     public String CurrencyToString(Currency currency)
    {
        if (currency == Currency.USD) {
            return "USD";
        }
        else if (currency == Currency.HUF) {
            return "HUF";
        }
        else
        {
            return "EUR";
        }
    }
    
}
