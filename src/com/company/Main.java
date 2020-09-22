package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Ecrivez un nombre ");
            int number = scanner.nextInt();
            int sommePair =0;
            int sommeImpair =0;
            int resultat;
            for ( int i = 0; i < number;  i++){
                if ( i%2 ==0){
                    sommePair += i;
                    System.out.println("la somme des nombres pair est de :" + sommePair);
                } else {
                    sommeImpair += i;
                    System.out.println("la somme des nombres impair est de :" +sommeImpair);
                }
            }
            resultat = sommePair+sommeImpair;
            System.out.println("Le resultat total est de :" +resultat);

        }
    }
}
