package Data;

public class User {
    
    Player player;
    String email;
    String password;
    
    public User(Player player, String email, String password)
    {
        this.player = player;
        this.email = email;
        this.password = password;
    }
}
