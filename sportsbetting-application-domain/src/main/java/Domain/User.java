package Domain;

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

    public Player getPlayer() {
        return player;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
