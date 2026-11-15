public class Exercicio01 {

    static String gerarLinha(char simbolo, int tamanho) {
        String linha = "";
        for (int i = 0; i < tamanho; i++) {
            linha = linha + simbolo;
        }
        return linha;
    }

    static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            System.out.println(gerarLinha('*', i));
        }
    }

    public static void main(String[] args) {
        int[] alturas = new int[3];

        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = Integer.parseInt(IO.readln("altura do triangulo " + (i + 1) + ": "));
        }

        System.out.println();
        for (int i = 0; i < alturas.length; i++) {
            desenharTriangulo(alturas[i]);
            System.out.println();
        }
    }
}
