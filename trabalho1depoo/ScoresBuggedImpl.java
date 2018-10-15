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
        valor = new GameEntry[2];
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
    public int get(int i) {
        int valorP = 0;
        for (int j = 0; j < valor.length; j++) {
            if (j == i) {
                valorP = valor[j].getScore();
            }
        }
        return valorP;

    }

    @Override
    public int getCapacity() {
        return valor.length;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumScores() {
        int cont = 0;
        for (int i = 0; i < valor.length; i++) {
            if (valor[i].getScore() != 0) {
                cont++;
            }
        }
        return cont;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
