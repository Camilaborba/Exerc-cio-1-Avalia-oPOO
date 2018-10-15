package trabalho1depoo;

/**
 *
 * @author Camila orba
 * @author Jessica Manoel
 *
 */
public class ScoresBuggedImpl implements Scores {

    public static final int maxEntradas = 10;
    protected int valorM;
    protected GameEntry[] valor;

    public ScoresBuggedImpl() {
        // inicializar o vetor
        valor = new GameEntry[10];
        //inicializa a variavel valorM
        valorM = 0;
    }

    @Override
    public boolean add(GameEntry e) {
        // a execção foi craida para testar se há um objeyto a ser inserido, se ele é diferente de null, caso o objeto estiver null será retornado o erro.
        if (e == null) {
            throw new NullPointerException("Objeto nulo");
        }
        int novoScore = e.getScore();
        if (valorM == maxEntradas) {
            // está verificando se novo score é menor que um score já exixtente no vetor
            if (novoScore < valor[valorM - 1].getScore()) {
                return false;
            } else {
                valorM++;
            }
            int i = valorM - 1;

            for (; (i >= 1) && (novoScore > valor[i - 1].getScore()); i--) {
                valor[i] = valor[i - 1];

            }
            valor[i] = e;
            // return true;
        }

        return true;
    }

    @Override
    public GameEntry get(int i) {
        GameEntry e = null;
        int max = 10;
        // int valorP = 0;
        /**
         * tratamento de excecção para valores de indice que não estiverem no
         * intervalo de 0-9.
         */
        if (i > 10) {
            throw new IllegalArgumentException("Valor de indice não esta dentro do intervalo esperado");
        }

        int j = 0;
        for (GameEntry valorP : valor) {
            if (j == i) {
                if (valorP == null) {
                    throw new NullPointerException("Objeto nulo");
                } else {
                    return valorP;
                }
            }

            j++;

        }

        return e;

    }

    @Override
    public int getCapacity() {
        return valor.length;

    }

    @Override
    public int getNumScores() {
        GameEntry e = null;
        int cont = 0;

        for (GameEntry y : valor) {
            if (y == null) {
                throw new NullPointerException("Objeto nulo");
            }
            if (e.getScore() != 0) {
                cont++;
            }

        }

        /**
         * for (int i = 0; i < valor.length; i++) { if (valor[i].getScore() ==
         * 0) { throw new NullPointerException("Objeto nulo"); } else{ cont++; }
         */
        return cont;
    }
    //return cont;
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
