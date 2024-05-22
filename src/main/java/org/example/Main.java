package org.example;

public class Main {
    public static void main(String[] args) {

        Matrica matrica = new Matrica();
        matrica.sukurtiMatrica();
        matrica.isvestiMatrica(matrica.elementai);
        System.out.println();
        //matrica.transponuotiMatrica(matrica.elementai);
//        Matrica matrica2 = new Matrica();
//        matrica2.sukurtiMatrica();
//        matrica2.isvestiMatrica(matrica2.elementai);
//        System.out.println();
//        matrica.matricuSudetis(matrica.elementai, matrica2.elementai);

        Vektorius vektorius = new Vektorius();
        vektorius.sukurtiVektoriu();
        vektorius.isvestiVektoriu(vektorius.vektorius);
        System.out.println();
        matrica.daugintIsVektoriaus(matrica.elementai, vektorius.vektorius);


    }
}