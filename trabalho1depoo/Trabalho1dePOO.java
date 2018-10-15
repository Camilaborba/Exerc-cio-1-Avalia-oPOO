/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1depoo;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Trabalho1dePOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic h
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um nome: ");
        String n = in.nextLine();
        System.out.println("Informe um score");
        int s = in.nextInt();
        GameEntry g1 = new GameEntry(n,s);
        ScoresBuggedImpl g2 = new ScoresBuggedImpl();
       // System.out.println(g2.get(9));
        System.out.println(g2.getNumScores());
        
        
        
        
    }

  
    
}
