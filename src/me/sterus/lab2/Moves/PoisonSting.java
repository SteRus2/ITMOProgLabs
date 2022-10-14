package me.sterus.lab2.Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonSting extends PhysicalMove {
    public PoisonSting(){
        super(Type.POISON, 15, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (!pokemon.hasType(Type.POISON) && Math.random() <= 0.3){
            Effect.poison(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Использует Poison Sting";
    }
}
