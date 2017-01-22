package matrici;

//@author Denis Valente
import java.io.FileWriter;
import java.io.IOException;

public class Matrice {

    int[][] theMatrix;

    public Matrice(int x, int y) {
        theMatrix = new int[x][y];
    }

    public Matrice(int[][] m) {
        theMatrix = m;
    }

    public void fillRandom() {
        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix[i].length; j++) {
                theMatrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix[i].length; j++) {
                s += "m[" + i + "][" + j + "]=" + theMatrix[i][j] + "\t";
            }
            s += "\n";
        }
        return s;
    }

    public void toFile(String filename) {
        FileWriter out;
        try {
            out = new FileWriter(filename);
            out.write(this.toString());
            out.write("\n");

            out.close();
        } catch (IOException ex) {
            System.out.println("Errore: " + ex.getMessage());
        }
    }

    public void fromFile(String filename) {

    }

}
