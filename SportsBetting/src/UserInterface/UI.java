package UserInterface;

import Controllers.SendDataToUI.DataMoverLogic;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.Interfaces.ISportsBettingService;
import Repository.Interfaces.IView;

public class UI {

    public static void main(String[] args) {
       
        try
        {
           DataMoverLogic receiverlogic = new DataMoverLogic();
        }
        catch(OutcomeOddTimeOverlapException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
