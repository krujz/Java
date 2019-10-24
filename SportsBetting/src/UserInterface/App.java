package UserInterface;

import Controllers.AppLogic.AppLogic;
import Exceptions.OutcomeOddTimeOverlapException;

import java.io.IOException;

public class App {

    AppLogic applogic;
    public App() throws OutcomeOddTimeOverlapException
    {
        this.applogic = new AppLogic();
    }

    public void play() throws IOException
    {
       applogic.play();
    }
    public static void main(String[] args)
    {
        try
        {
            App app = new App();
            app.play();
        }
        catch(OutcomeOddTimeOverlapException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
