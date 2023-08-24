public class Pikachu extends Pokemon {

    public Pikachu(int health, int attackPower, PokemonType type) {
        super("Pikachu", health, attackPower, type);
    }

    @Override
    public void useSpecialAttack(Pokemon opponent) {
        System.out.printf("%s is using ThunderBolt!\n", getName());
        opponent.takeDamage(getAttackPower()*2, getType(), opponent.getType());
    }
}
