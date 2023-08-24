import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(100, 15, PokemonType.GRASS);
        Charizard charizard = new Charizard(70, 20, PokemonType.FIRE);

        Arena arena = new Arena();
        Scanner scanner = new Scanner(System.in);

        arena.applyArenaEffects(charizard);
        arena.applyArenaEffects(pikachu);

        Random rand = new Random();

        while(true) {
            System.out.println("Choose attack:");
            System.out.println("1) Normal attack");
            System.out.println("2) Special attack");
            int tmp = scanner.nextInt();
            if(tmp ==1) {
                pikachu.attack(charizard);
            } else if (tmp == 2) {
                pikachu.useSpecialAttack(charizard);
            } else {
                System.out.println("Wrong input!");
                continue;
            }
            if(charizard.isFainted()) {
                break;
            }

            int charizardAttack = rand.nextInt(2);
            if (charizardAttack == 0) {
                charizard.attack(pikachu);
            } else {
                pikachu.attack(charizard);
            }
        }
    }
}