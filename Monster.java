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
        monster.getMonsterName();
    }
    
}
