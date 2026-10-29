public class Monster {

    String monsterName;

    public static void getMonsterName(String monsterName)
    {
        System.out.println(monsterName);
    }

    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.getMonsterName("Goblin");
    }
    
}
