public class Exercicio04 {

    // metodo da bolha
    static void ordenar(int[] v) {
        for (int volta = 0; volta < v.length - 1; volta++) {
            for (int i = 0; i < v.length - 1 - volta; i++) {
                if (v[i] > v[i + 1]) {
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
            }
        }
    }

    static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("numero " + (i + 1) + ": "));
        }

        System.out.print("antes: ");
        exibir(numeros);
        System.out.println("esta ordenado? " + estaOrdenado(numeros));

        ordenar(numeros);

        System.out.print("depois: ");
        exibir(numeros);
        System.out.println("esta ordenado? " + estaOrdenado(numeros));
    }
}
