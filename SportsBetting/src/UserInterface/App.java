package UserInterface;

import Controllers.SendDataToUI.DataMoverLogic;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.Interfaces.ISportsBettingService;
import Repository.Interfaces.IView;

public class App {

    ISportsBettingService sportsbettingservice;
    IView view;
    public App(ISportsBettingService sportsbettingservice, IView view)
    {
        this.sportsbettingservice = sportsbettingservice;
        this.view = view;
    }
    
    
    
    public static void main(String[] args) {
       
        
    }
}
