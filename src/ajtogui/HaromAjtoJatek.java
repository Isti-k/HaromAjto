/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajtogui;

import java.util.Random;
public class HaromAjtoJatek {
    private int[] ajtok = {0, 0, 0}; 
    private int valasztottAjto = -1;
    private int nyeremenyAjto;
    private int mutatottAjto;
    private boolean cserelt = false;

    public void ujJatek() {
        Random random = new Random();
        nyeremenyAjto = random.nextInt(3);
        for (int i = 0; i < 3; i++) {
            ajtok[i] = (i == nyeremenyAjto) ? 1 : 0;
        }
        valasztottAjto = -1;
        mutatottAjto = -1;
        cserelt = false;
    }

    public void valasztAjtot(int ajtoSzam) {
        valasztottAjto = ajtoSzam;
    }

    public int mutatKecskesAjtot() {
        for (int i = 0; i < 3; i++) {
            if (i != valasztottAjto && ajtok[i] == 0) {
                mutatottAjto = i;
                break;
            }
        }
        return mutatottAjto;
    }

    public void cserel() {
        for (int i = 0; i < 3; i++) {
            if (i != valasztottAjto && i != mutatottAjto) {
                valasztottAjto = i;
                cserelt = true;
                break;
            }
        }
    }

    public boolean nyert() {
        return ajtok[valasztottAjto] == 1;
    }
}
