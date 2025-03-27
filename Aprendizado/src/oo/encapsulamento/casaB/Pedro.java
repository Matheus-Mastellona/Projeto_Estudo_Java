package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    // Ana mae = new Ana();

    void testeAcessos() {
        // System.out.println(mae.segredo);
        // System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar); // para acessar não pode ter a Ana estanciado, pois ja vem do extends
        System.out.println(todosSabem);// para acessar não pode ter a Ana estanciado, pois ja vem do extends
    }
}
