package me.sterus.lab2.Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() <= 0.1) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Ice Beam";
    }
}
