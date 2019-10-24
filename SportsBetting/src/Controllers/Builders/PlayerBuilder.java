package Controllers.Builders;

import Global_packeges.Enums.Currency;
import java.math.BigDecimal;

import Domain.Player;
import java.time.LocalDateTime;

public class PlayerBuilder {
    
    String name;
    BigDecimal account_number;
    BigDecimal balance;
    Currency currency;
    LocalDateTime dateofbirth;

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder setAccount_number(BigDecimal account_number) {
        this.account_number = account_number;
        return this;
    }

    public PlayerBuilder setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public PlayerBuilder setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public PlayerBuilder setDateofbirth(LocalDateTime dateofbirth) {
        this.dateofbirth = dateofbirth;
        return this;
    }
    
    public Player getPlayer()
    {
        return new Player(name,account_number,balance,currency,dateofbirth);
    }
    
    
    
}
