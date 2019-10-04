package Data;

import Enums.Currency;
import java.math.BigDecimal;
import java.util.Date;

class Player {
    String name;
    BigDecimal account_number;
    BigDecimal balance;
    Currency currency;
    Date dateofbirth;
    
    public Player(String name,BigDecimal account_number,BigDecimal balance,Currency currency, Date dateofbirth)
    {
        this.name = name;
        this.account_number = account_number;
        this.balance = balance;
        this.currency = currency;
        this.dateofbirth = dateofbirth;
    }
}
