package UserInterface;

import Controllers.SendDataToUI.DataMoverLogic;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.Interfaces.ISportsBettingService;
import Repository.Interfaces.IView;

public class App {

    DataMoverLogic receiverlogic;
    
    public App(ISportsBettingService sportbettingservice,IView view) 
    {
        try
        {
           this.receiverlogic = new DataMoverLogic();
        }
        catch(OutcomeOddTimeOverlapException e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public void play()
    {
        
    }
    
    public void createPlayer(){
        
    }
    
    public void doBetting()
    {
        
    }
    
    public void calculateResults()
    {
        
    }
    
    public void printResults()
    {
        
    }

    
    public static void main(String[] args) {
       
        
//        try{
//            
//        }
//        catch(OutcomeOddTimeOverlapException e){
//            System.out.println(e.getMessage());
//        }
    }
}
