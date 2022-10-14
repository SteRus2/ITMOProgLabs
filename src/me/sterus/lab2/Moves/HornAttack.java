package me.sterus.lab2.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class HornAttack extends PhysicalMove {
    public HornAttack(){
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected String describe() {
        return "использует Horn Attack";
    }
}
