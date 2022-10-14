package me.sterus.lab2.Pokemons;

import me.sterus.lab2.Moves.HornAttack;

public class Nidorino extends NidoranM {
    public Nidorino(String name, int level){
        super(name, level);
        setStats(61, 72, 57, 55, 55, 65);
        addMove(new HornAttack());
    }
}
