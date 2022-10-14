package me.sterus.lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove {
    public BulkUp(){
        super(Type.FIGHTING, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "использует BulkUp";
    }
}
