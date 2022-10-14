package me.sterus.lab2.Pokemons;

import me.sterus.lab2.Moves.BulkUp;
import me.sterus.lab2.Moves.Bulldoze;
import me.sterus.lab2.Moves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Crabrawler extends Pokemon {
    public Crabrawler(String name, int level){
        super(name, level);
        setType(Type.FIGHTING);
        setStats(47, 82, 57, 42, 47, 63);
        setMove(new Bulldoze(), new RockTomb(), new BulkUp());
    }
}
