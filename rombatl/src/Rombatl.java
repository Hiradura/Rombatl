/*
* File: App.java
* Author: Orosz Olivér Arnold
* Copyright: 2024, Orosz Olivér Arnold
* Group: Szoft II/I/N
* Date: 2024-10-06
* Github: https://github.com/Hiradura/
* Licenc: GNU GPL
*/
import java.util.Scanner;
public class Rombatl{
    /**
     * Rombusz területét kiszámoló függvény. Beolvassa a rombusz két átlóját, majd kiszámolja a területét azzal a formulával, hogy a terület egyenl  az átlók szorzatának a felével.
     */
    public void RombuszTer(){

        System.out.println("Rombusz területét kiszámoló program.");
        Scanner scanner = new Scanner(System.in);
        System.out.println(); System.out.println("1 átlo: ");
        String elsoBe = scanner.nextLine();
        Double egyatlo = Double.valueOf(elsoBe);
        System.out.println("2 átlo: ");                               
        String masodikBe = scanner.nextLine();
        Double kettesatlo = Double.valueOf(masodikBe); 
        Double osszesen = (1.0/2.0) * egyatlo * kettesatlo;
        System.out.println("A rombusz területe: " + osszesen);
        scanner.close();

    }
}