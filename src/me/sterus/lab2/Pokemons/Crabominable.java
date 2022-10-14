package me.sterus.lab2.Pokemons;

import me.sterus.lab2.Moves.IceBeam;
import ru.ifmo.se.pokemon.Type;

public class Crabominable extends Crabrawler {
    public Crabominable(String name, int level){
        super(name, level);
        addType(Type.ICE);
        setStats(97, 132, 77, 62, 67, 43);
        addMove(new IceBeam());
    }

}
