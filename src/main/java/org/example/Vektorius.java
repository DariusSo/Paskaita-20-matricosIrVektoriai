package org.example;

import java.util.Random;

public class Vektorius {

    public int[] vektorius = new int[Matrica.DYDIS];

    public void sukurtiVektoriu(){
        Random random = new Random();
        for (int i = 0; i < Matrica.DYDIS; i++){
            vektorius[i] = random.nextInt(1, 10);
        }
    }
    public void isvestiVektoriu(int[] vektorius){
        for (int i = 0; i < Matrica.DYDIS; i++){
            System.out.println(vektorius[i]);
        }
    }
}
