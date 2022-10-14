package me.sterus.lab2.Pokemons;

import me.sterus.lab2.Moves.PoisonSting;
import me.sterus.lab2.Moves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NidoranM extends Pokemon {
    public NidoranM(String name, int level){
        super(name, level);
        setType(Type.POISON);
        setStats(46, 57, 40, 40, 40, 50);
        setMove(new PoisonSting(), new Thunderbolt());
    }
}
