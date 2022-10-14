package me.sterus.lab2.Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (!pokemon.hasType(Type.ELECTRIC) && Math.random() <= 0.3){
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Thunder";
    }
}
