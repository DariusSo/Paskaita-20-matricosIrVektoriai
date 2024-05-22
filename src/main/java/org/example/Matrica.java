package org.example;

import java.util.Random;

public class Matrica {
    public static int DYDIS = 4;
    int[][] elementai = new int[DYDIS][DYDIS];

    public void sukurtiMatrica(){
        Random random = new Random();
        for(int i = 0; i < DYDIS; i++){
            for(int j = 0; j < DYDIS; j++){
                elementai[i][j] = random.nextInt(1,10);
            }
        }
    }
    public void isvestiMatrica(int[][] matrica){
        for (int i = 0; i < DYDIS; i++) {
            for (int j = 0; j < DYDIS; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void transponuotiMatrica(int[][] matrica){
        int[][] transponuota = new int[DYDIS][DYDIS];
        for (int i = 0; i < DYDIS ; i++){
            for (int j = 0; j < DYDIS; j++){
                transponuota[i][j] = elementai[j][i];
            }
        }
        isvestiMatrica(transponuota);

    }
    public void matricuSudetis(int[][] matrica, int[][] matrica2){
        int[][] sudetaMatrica = new int[DYDIS][DYDIS];
        for (int i = 0; i < DYDIS ; i++) {
            for (int j = 0; j < DYDIS; j++) {
                sudetaMatrica[i][j] = matrica[i][j] + matrica2[i][j];
            }
        }
        isvestiMatrica(sudetaMatrica);
    }
    public void daugintIsVektoriaus(int[][] matrica, int[] vektorius){
        int[] naujasVektorius = new int[DYDIS];
        for(int i = 0; i < DYDIS; i++){
            for(int j = 0; j < DYDIS; j++){
                int temp = matrica[i][j] * vektorius[i];
                naujasVektorius[i] += temp;
            }
        }
        for(int i = 0; i < DYDIS; i++){
            System.out.println(naujasVektorius[i]);
        }
    }
}
