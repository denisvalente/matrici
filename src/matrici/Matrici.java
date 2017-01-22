package matrici;

//@author Denis Valente
public class Matrici {

    public static void main(String[] args) {

        Matrice m = new Matrice(4, 6);

        m.fillRandom();
        System.out.println(m);

        m.toFile("data/matrice.txt");

    }
}