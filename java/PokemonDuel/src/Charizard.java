
public class Charizard extends Pokemon {
    public Charizard(int health, int attackPower, PokemonType type) {
        super("Charizard", health, attackPower, type);
    }

    @Override
    public void useSpecialAttack(Pokemon opponent) {
        System.out.printf("%s is using Fire Blast!\n", getName());
        opponent.takeDamage(getAttackPower()*3, getType(), opponent.getType());
    }
}