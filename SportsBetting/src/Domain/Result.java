package Domain;

import Controllers.Domain.Logic.ResultLogic;
import java.util.ArrayList;

public class Result {
    ArrayList<String> results;
    ResultLogic resultlogic;

    public Result(ArrayList<String> results) {
        this.results = results;
        this.resultlogic = new ResultLogic();
    }
    
    public void AddResult(String result)
    {
        this.results = resultlogic.AddResult(this.results, result);
    }

    public ArrayList<String> getResults() {
        return results;
    }

    public void setResults(ArrayList<String> results) {
        this.results = results;
    }
    
 
 
}
