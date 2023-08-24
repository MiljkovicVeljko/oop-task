import java.util.Random;

public class Arena {
    private Random random;
    private PokemonType type;

    public Arena() {

        random = new Random();
        this.type = getRandomType();
    }

    public void applyArenaEffects(Pokemon pokemon) {
        if((pokemon.getType().equals(PokemonType.FIRE) && type.equals(PokemonType.WATER)) || (pokemon.getType().equals(PokemonType.WATER) && type.equals(PokemonType.GRASS)) || (pokemon.getType().equals(PokemonType.GRASS) && type.equals(PokemonType.FIRE))) {
            int pokemonAttack = pokemon.getAttackPower();
            pokemon.setAttackPower(pokemonAttack/2);
        }
    }

    public PokemonType getRandomType() {
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                return PokemonType.WATER;
            case 1:
                return PokemonType.FIRE;
            case 2:
                return PokemonType.GRASS;
            default:
                return PokemonType.WATER;
        }
    }
}
