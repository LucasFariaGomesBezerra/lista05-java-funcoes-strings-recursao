public class Exercicio03 {

    static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        // se nao achar divisor ate a metade entao e primo
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int contarPrimos(int[] v) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                cont++;
            }
        }
        return cont;
    }

    static void exibirPrimos(int[] v) {
        System.out.print("primos: ");
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("numero " + (i + 1) + ": "));
        }

        exibirPrimos(numeros);
        System.out.println("quantidade de primos: " + contarPrimos(numeros));
    }
}
