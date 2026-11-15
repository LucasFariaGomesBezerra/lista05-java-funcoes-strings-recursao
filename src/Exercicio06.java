public class Exercicio06 {

    static int contarVogais(String texto) {
        String t = texto.toLowerCase();
        int cont = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }
        }
        return cont;
    }

    static void exibirContagem(String[] frases) {
        int posMaior = 0;
        for (int i = 0; i < frases.length; i++) {
            int qtd = contarVogais(frases[i]);
            System.out.println(frases[i] + " -> " + qtd + " vogais");
            if (qtd > contarVogais(frases[posMaior])) {
                posMaior = i;
            }
        }
        System.out.println("frase com mais vogais: " + frases[posMaior]);
    }

    public static void main(String[] args) {
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            frases[i] = IO.readln("frase " + (i + 1) + ": ");
        }

        System.out.println();
        exibirContagem(frases);
    }
}
