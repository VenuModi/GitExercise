public class Monster {

    String monsterName;

    Monster(String monsterName)
    {
        this.monsterName = monsterName; 
    }

    public String getMonsterName()
    {
        System.out.println(monsterName);
        return monsterName;
    }

    public static void main(String[] args) {
        Monster monster = new Monster("Goblin");
        Monster monster2 = new Monster("Dragon");

        Player player = new Player("Hero");
        Player player2 = new Player("Warrior");
        monster.getMonsterName();
        player.getPlayerName();
    }
    
}
