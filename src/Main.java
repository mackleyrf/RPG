public class Main {
    public static void main(String[] args) {
        Character myCharacter = new Character();
        myCharacter.name = "Mackley Freire";
        myCharacter.level = 8;
        myCharacter.profession = "Warrior";
        myCharacter.health = 10;
        myCharacter.strenght = 10;
        myCharacter.agility = 10;
        myCharacter.weapon = "Small Sword";
        myCharacter.armor = "Leather Armor";
        myCharacter.shield = "Wooden Shield";
        myCharacter.weaponhit = 3;
        myCharacter.armordefense = 1;
        myCharacter.shieldblock = 2;

        myCharacter.exibirFichaTecnica();
    }
}