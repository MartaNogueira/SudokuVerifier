import static java.lang.Integer.parseInt;

public class SudokuVerifier {

    public int verify(String candidateSolution) {
        boolean b = true;
        int valor = 0;
        for (int i = 0; i < candidateSolution.length(); i++) {
            if (!(Integer.parseInt(candidateSolution.substring(i, i + 1)) > 0 && Integer.parseInt(candidateSolution.substring(i, i + 1)) <= 9)) {
                b = false;
            }
        }
        if (!b) {
            valor = -1;
        }

        /* for (int i = 0; i < candidateSolution.length(); i++) {
            if (!(Integer.parseInt(candidateSolution.substring(i, i + 1)) > 0 && Integer.parseInt(candidateSolution.substring(i, i + 1)) <= 9)) {
                b = false;
            }
        }
        if (!b) {
            valor = -2;
        } */

        if (b) {
            for (int i = 0; i <= 72; i = i + 9) {
                int j = i + 9;
                if ()  {
                    b = false;
                }
            }
            if (!b) {
                valor = -3;
            }
            return valor;
        }
    }
}