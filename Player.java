public class Player{

    String playerName;

    public Player(String playerName){
        this.playerName = playerName;
    }

    public String getPlayerName(){
        System.out.println(playerName);
        return playerName;
    }
}