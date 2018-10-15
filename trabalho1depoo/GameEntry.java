/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1depoo;

/**
 *
 * @author camil
 */
public class GameEntry {
    protected String nome;
     protected int score;
    
    public GameEntry(String n, int s){
       if (s < 0) {
            throw new IllegalArgumentException("Valor de score negativo");
        }

        
    }
    public int getScore(){
        return score;
    }
    
}
