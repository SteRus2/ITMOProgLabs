package me.sterus.lab2.Pokemons;

import me.sterus.lab2.Moves.CalmMind;
import me.sterus.lab2.Moves.Confusion;
import me.sterus.lab2.Moves.EnergyBall;
import me.sterus.lab2.Moves.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oranguru extends Pokemon {
    public Oranguru(String name, int level){
        super(name, level);
        setType(Type.NORMAL, Type.PSYCHIC);
        setStats(90, 60, 80, 90, 110, 60);
        setMove(new EnergyBall(), new Confusion(), new CalmMind(), new Thunder());
    }
}
