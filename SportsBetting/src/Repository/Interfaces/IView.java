/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository.Interfaces;

import Domain.OutcomeOdd;
import Domain.Player;
import Domain.SportEvents.SportEvent;
import Domain.Wager;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author komol
 */
public interface IView {
    Player readPlayerData();
    
    void printWelcomeMessage(Player player);
    
    void printBalance(Player player);
    
    void printOutcomeOdds(ArrayList<SportEvent> sportevent);
    
    OutcomeOdd selectOutcomeOdd(ArrayList<SportEvent> sportevent);
    
    BigDecimal readWAgerAmount();
    
    void printWagerSaved(Wager wager);
    
    void printNotEnoughBalance(Player player);
    
    void printResults(Player player, ArrayList<Wager> wagers);
}
