/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Domain.Logic;

import Domain.Bet;
import java.util.ArrayList;

/**
 *
 * @author komol
 */
public class SportEventLogic {
    
    public String BetsToString(ArrayList<Bet> bets)
     {
         String AppendBets = "";
        
        for(Bet bet : bets)
        {
            AppendBets += "\n" + bet.toString();
        }
        return AppendBets;
     }
}
