package UserInterface;

import Controllers.SendDataToUI.DataMoverLogic;
import Exceptions.OutcomeOddTimeOverlapException;
import Repository.Interfaces.ISportsBettingService;
import Repository.Interfaces.IView;

public class App {

   
    
    public App(ISportsBettingService sportbettingservice,IView view) 
    {
        
        
        
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
