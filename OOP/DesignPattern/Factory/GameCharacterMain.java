package Factory;

import java.util.Scanner;

interface GameCharacter {
    void attack();
    void defend();
}
enum CharacterType {
    WARRIOR, MAGE, ARCHER
}
class Warrior implements GameCharacter {
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }
    public void defend() {
        System.out.println("Warrior defends with a shield!");
    }
}
class Mage implements GameCharacter {
    public void attack() {
        System.out.println("Mage attacks with a spell!");
    }
    public void defend() {
        System.out.println("Mage defends with a magic barrier!");
    }
}
class Archer implements GameCharacter {
    public void attack() {
        System.out.println("Archer attacks with a bow!");
    }
    public void defend() {
        System.out.println("Archer defends by dodging!");
    }
}
class CharacterFactory {
    public static GameCharacter getCharacter(CharacterType type) {
        if (type == null) return null;
        switch (type) {
            case WARRIOR:
                return new Warrior();
            case MAGE:
                return new Mage();
            case ARCHER:
                return new Archer();
            default:
                throw new IllegalArgumentException("Invalid character type");
        }
    }
}
public class GameCharacterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a character type: WARRIOR, MAGE or ARCHER");

        String s = sc.next();
        try{
            CharacterType type=CharacterType.valueOf(s.toUpperCase());
            GameCharacter character=CharacterFactory.getCharacter(type);
            if(character!=null){
                character.attack();
                character.defend();
            }
        }catch(IllegalArgumentException e){
            System.out.println("Invalid character type. Please choose WARRIOR, MAGE or ARCHER.");
        }
    }
}
