/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1;

import java.util.Scanner;

/**
 *
 * @author 31438938
 */
public class Exercicio2 {

    private int code;

    public Exercicio2() {
        do {
            System.out.println("1 - Solteiro(a)\n 2 - Desquitado(a)\n 3 - Casado(a)\n  4 - Divorciado(a)\n5 - Viúvo(a) \n 6- SAIR !");
            Scanner sc = new Scanner(System.in);
            code = sc.nextInt();

            switch (code) {
                case 1:
                    System.out.println("Voce é solteiro");
                    break;
                case 2:
                    System.out.println("Voce é desquitado");
                    break;
                case 3:
                    System.out.println("Voce é casado");
                    break;
                case 4:
                    System.out.println("Voce é divorciado");
                    break;
                case 5:
                    System.out.println("Voce é viuvo");
                    break;
                case 6: 
                    System.exit(0);
                    
                default:
                    System.out.println("Opção invalida manolo");

            }
        } while (code !=6 );

        
    }

    public static void main (String Args[]){
        Exercicio2 ex2= new Exercicio2();
        
    }
}
