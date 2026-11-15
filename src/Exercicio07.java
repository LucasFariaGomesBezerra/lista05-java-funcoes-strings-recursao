public class Exercicio07 {

    static String gerarIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.trim().split(" ");
        String iniciais = "";
        for (int i = 0; i < partes.length; i++) {
            iniciais = iniciais + partes[i].toUpperCase().charAt(0) + ".";
        }
        return iniciais;
    }

    static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }

    public static void main(String[] args) {
        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = IO.readln("nome completo do aluno " + (i + 1) + ": ");
        }

        System.out.println();
        System.out.println("lista de chamada:");
        exibirChamada(nomes);
    }
}
