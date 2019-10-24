package Domain;

import Global_packeges.Enums.Currency;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Player {
    String name;
    BigDecimal account_number;
    BigDecimal balance;
    Currency currency;
    LocalDateTime dateofbirth;

    public Player(String name,BigDecimal account_number,BigDecimal balance,Currency currency, LocalDateTime dateofbirth)
    {
        this.name = name;
        this.account_number = account_number;
        this.balance = balance;
        this.currency = currency;
        this.dateofbirth = dateofbirth;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAccount_number(BigDecimal account_number) {
        this.account_number = account_number;
    }

    public void setBalance() {
        this.balance = this.balance.subtract(new BigDecimal("100"));
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setDateofbirth(LocalDateTime dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAccount_number() {
        return account_number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public LocalDateTime getDateofbirth() {
        return dateofbirth;
    }
    
    @Override
    public String toString()
    {
        return "Név: " + this.name + "\naccountnumber: " + this.account_number + "\nBalance: " + this.balance + "\nCurrency: " + this.currency + "\nDate of birth: " + dateofbirth;
    }
}
