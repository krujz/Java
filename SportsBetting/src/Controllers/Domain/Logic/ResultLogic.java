package Controllers.Domain.Logic;

import Domain.Result;
import java.util.ArrayList;

public class ResultLogic {
    public ArrayList<String> AddResult(ArrayList<String> results,String result)
    {
        results.add(result);
        return results;
    }
}
