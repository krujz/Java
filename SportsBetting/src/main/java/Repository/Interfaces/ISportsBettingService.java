package Repository.Interfaces;

import Domain.Player;
import Domain.SportEvents.SportEvent;
import Domain.Wager;
import java.util.ArrayList;

public interface ISportsBettingService {
    void SavePlayer(Player player);
    
    Player findPlayer();
    
    ArrayList<SportEvent> findAllSportEvents();
    
    void saveWaget(Wager wager);
    
    ArrayList<Wager> findAllWagers();
    
    void CalculateResults();
    
}
