package Controllers.Domain.Logic;

import Domain.Bet;
import Domain.Result;
import java.util.ArrayList;

public class ResultLogic {
    public ArrayList<String> AddResult(ArrayList<String> results,String result)
    {
        results.add(result);
        return results;
    }
    
    public String ResultsToString(ArrayList<String> results)
     {
         String AppendResults = "";
        
        for(String result : results)
        {
            AppendResults += "\n" + result;
        }
        return AppendResults;
     }
}
