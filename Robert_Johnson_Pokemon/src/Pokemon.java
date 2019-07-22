public class Pokemon {
    private String name;
    private int health;
    private String type;
    private static int count;

    public Pokemon() {
        count++;
    }

    public Pokemon(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }

    // Getters

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public String getType() {
        return this.type;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void attackPokemon(Pokemon pokemon) {
        pokemon.health -= 10;
    }

}