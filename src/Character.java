public class Character {
    String name;
    int level;
    String profession;
    int health, strenght, agility;
    String weapon, armor, shield;
    int weaponhit, armordefense, shieldblock;

    void exibirFichaTecnica(){
        System.out.println(name);
        System.out.println("Level: " + level + " | Profession: " + profession);
        System.out.println("Health: " + health + " | Strenght: " + strenght + " | Agility: " + agility);
    }
}
