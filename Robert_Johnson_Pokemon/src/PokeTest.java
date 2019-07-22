public class PokeTest {
    public static void main(String[] args) {
        Pokedex p1 = new Pokedex();
        Pokemon charmander = p1.createPokemon("Charmander", 100, "Fire");
        System.out.println(p1.pokemonInfo(charmander));
        Pokemon bulbasaur = p1.createPokemon("Bulbasaur", 100, "Grass");
        charmander.attackPokemon(bulbasaur);
        System.out.println(p1.pokemonInfo(bulbasaur));
    }
}