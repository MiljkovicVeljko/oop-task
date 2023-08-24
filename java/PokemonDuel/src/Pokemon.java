public abstract class Pokemon {

    private String name;
    private int health;
    private int attackPower;
    private PokemonType type;

    private boolean fainted;

    public Pokemon(String name, int health, int attackPower, PokemonType type) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.type = type;
        this.fainted = false;
    }

    public void attack(Pokemon opponent) {
        System.out.printf("%s is attacking %s!", this.name, opponent.getName());
        opponent.takeDamage(attackPower, type, opponent.getType());
    }

    public void takeDamage(int damage, PokemonType attackingType, PokemonType defendingType) {
        if(attackingType.equals(PokemonType.FIRE) && defendingType.equals(PokemonType.GRASS)) {
            damage *= 2;
        } else         if(attackingType.equals(PokemonType.WATER) && defendingType.equals(PokemonType.FIRE)) {
            damage *= 2;
        } else         if(attackingType.equals(PokemonType.WATER) && defendingType.equals(PokemonType.GRASS)) {
            damage /= 2;
        } else         if(attackingType.equals(PokemonType.FIRE) && defendingType.equals(PokemonType.WATER)) {
            damage /= 2;
        }

        health -= damage;
        System.out.printf("%s just took %d damage! Current health is %d\n", getName(), damage, health);
        if (health <= 0) {
            System.out.printf("%s just fainted!", getName());
            this.setFainted(true);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public void setFainted(boolean fainted) {
        this.fainted = fainted;
    }

    public boolean isFainted() {
        return this.fainted;
    }

    public abstract void useSpecialAttack(Pokemon opponent);
}
