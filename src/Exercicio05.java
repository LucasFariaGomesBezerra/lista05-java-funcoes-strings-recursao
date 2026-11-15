public class Exercicio05 {

    static String paraBinario(int n) {
        if (n == 0) {
            return "0";
        }
        String binario = "";
        while (n > 0) {
            int resto = n % 2;
            binario = resto + binario; // o resto vai na esquerda
            n = n / 2;
        }
        return binario;
    }

    static void exibirTabela(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " = " + paraBinario(v[i]));
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("numero " + (i + 1) + ": "));
        }

        System.out.println();
        exibirTabela(numeros);
    }
}
