public class Exercicio08 {

    static String maiorPalavra(String[] palavras) {
        String maior = palavras[0];
        for (int i = 1; i < palavras.length; i++) {
            if (palavras[i].length() > maior.length()) {
                maior = palavras[i];
            }
        }
        return maior;
    }

    static void exibirPalavras(String[] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println((i + 1) + " - " + palavras[i]);
        }
    }

    public static void main(String[] args) {
        String frase = IO.readln("digite uma frase: ");
        String[] palavras = frase.trim().split(" ");

        System.out.println();
        exibirPalavras(palavras);
        System.out.println("total de palavras: " + palavras.length);
        System.out.println("maior palavra: " + maiorPalavra(palavras));
    }
}
