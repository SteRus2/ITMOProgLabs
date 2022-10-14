package me.sterus.lab2;

import me.sterus.lab2.Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println(pok.getHP() + ' ' + Arrays.toString(pok.getTypes()) + ' ' + pok);
        System.out.println(pek.getHP() + ' ' + Arrays.toString(pek.getTypes()) + ' ' + pek);
        System.out.println(puk.getHP() + ' ' + Arrays.toString(puk.getTypes()) + ' ' + puk);
        NidoranM pok = new NidoranM("SteRus1", 10);
        Nidorino pek = new Nidorino("SteRus2", 10);
        Nidoking puk = new Nidoking("SteRus3", 10);
         */
        Oranguru ora = new Oranguru("SterusOra", 10);
        Crabrawler crab = new Crabrawler("SteruCrab", 10);
        Crabominable crabominable = new Crabominable("SteruCra", 10);
        NidoranM nidoranM = new NidoranM("NidoranM", 10);
        Nidorino nidorino = new Nidorino("Nidorino", 10);
        Nidoking nidoking = new Nidoking("Nidoking", 10);
        Battle battle = new Battle();

        battle.addAlly(nidoranM);
        battle.addAlly(nidorino);
        battle.addAlly(nidoking);
        battle.addFoe(ora);
        battle.addFoe(crab);
        battle.addFoe(crabominable);
        battle.go();
    }
}