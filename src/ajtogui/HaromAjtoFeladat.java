
package ajtogui;

import java.util.Random;
import java.util.Scanner;

public class HaromAjtoFeladat {

    
    public static void main(String[] args) {
        int osszJatek = 0;
        int csereltJatek = 0;
        int nemCsereltJatek = 0;
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
            int[] ajtok = {0, 0, 0};
            int nyeremenyAjto = random.nextInt(3); 
            ajtok[nyeremenyAjto] = 1;
            
            
            System.out.println("Válasszon egy ajtót (1, 2 vagy 3): ");
            int valasztottAjto = scanner.nextInt() - 1;
            
            
            int mutatottAjto = -1;
            for (int i = 0; i < 3; i++) {
                if (i != valasztottAjto && ajtok[i] == 0) {
                    mutatottAjto = i;
                    break;
                }
            }
            
            System.out.println("A(z) " + (mutatottAjto + 1) + ". ajtó mögött kecske van.");
            
            
            System.out.println("Szeretne cserélni? (i/n): ");
            char csereValasz = scanner.next().charAt(0);
            boolean cserelt = (csereValasz == 'i' || csereValasz == 'I');
            
            
            if (cserelt) {
                for (int i = 0; i < 3; i++) {
                    if (i != valasztottAjto && i != mutatottAjto) {
                        valasztottAjto = i;
                        break;
                    }
                }
                csereltJatek++;
            } else {
                nemCsereltJatek++;
            }
            
            
            if (ajtok[valasztottAjto] == 1) {
                System.out.println("Gratulálok! Nyeremény van a(z) " + (valasztottAjto + 1) + ". ajtó mögött!");
            } else {
                System.out.println("Sajnos a kecskét választotta.");
            }
            
            
            osszJatek++;
            System.out.println("Összes játék: " + osszJatek);
            System.out.println("Cseréléses játékok: " + csereltJatek);
            System.out.println("Nem cseréléses játékok: " + nemCsereltJatek);
            
            
            System.out.println("Szeretne újra játszani? (i/n): ");
            char ujraValasz = scanner.next().charAt(0);
            if (ujraValasz != 'i' && ujraValasz != 'I') {
                break;
            }
        }
        
        scanner.close();
    }
    
}
