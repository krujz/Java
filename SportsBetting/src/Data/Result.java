package Data;

import java.util.List;

public class Result {
    List<String> results;
    
 public void AddResult(String result)
 {
     results.add(result);
 }

    public List<String> getResults() {
        return results;
    }
 
 
}
