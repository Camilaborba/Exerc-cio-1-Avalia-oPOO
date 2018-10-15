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
public interface Scores {

    String toString();

    /**
     * Adiciona um novo score se ele for grande o suficiente
     */
    boolean add(GameEntry e);

    /**
     * Retorna o score na posição i
     */
    int get(int i);

    /**
     * Retorna a capacidade de coleção
     */
    int getCapacity();

    /**
     * Retorna o número de scores armazenados
     */
    int getNumScores();

}
