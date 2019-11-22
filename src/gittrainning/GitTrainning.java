/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittrainning;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author BR40044422
 */
public class GitTrainning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Scanner scn = new Scanner (System.in);
        
        System.out.println("Hola <3");

        int opMenu = 1;
        while (opMenu != 0){
            System.out.println("\nDo que vc precisa? (:");
            System.out.println("1 - chorar");
            System.out.println("2 - fugir");
            System.out.println("3 - dormir");
            System.out.print("\nOpção: ");
            opMenu = scn.nextInt();
            switch (opMenu){
                case 1:
                    System.out.println("\nVenk te dou abracin <3");
                    System.out.println("Continuar? (1- Sim | 0 - Nao)");
                    opMenu = scn.nextInt();
                    break;
                case 2:
                    System.out.println("\nFoge sim, e me leva junto");
                    System.out.println("Continuar? (1- Sim | 0 - Nao)");
                    opMenu = scn.nextInt();
                    break;
                case 3:
                    System.out.println("\nFaz naninha então, eu deixo");
                    System.out.println("Continuar? (1- Sim | 0 - Nao)");
                    opMenu = scn.nextInt();
                    break;
                default:
                    System.out.println("Tudo bem, eu não quero nada da vida tbm");
                    System.out.println("Continuar? (1- Sim | 0 - Nao): ");
                    opMenu = scn.nextInt();
                    break;
            }
       }
        
        
        
    }

}
