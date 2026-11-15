public class Exercicio02 {

    static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "abaixo do peso";
        } else if (imc < 25) {
            return "peso normal";
        } else if (imc < 30) {
            return "sobrepeso";
        } else {
            return "obesidade";
        }
    }

    static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            String imcTexto = String.format("%.2f", imc).replace(".", ",");
            System.out.println("pessoa " + (i + 1) + ": imc " + imcTexto + " - " + classificarImc(imc));
        }
    }

    public static void main(String[] args) {
        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("pessoa " + (i + 1));
            pesos[i] = Double.parseDouble(IO.readln("  peso (kg): ").replace(",", "."));
            alturas[i] = Double.parseDouble(IO.readln("  altura (m): ").replace(",", "."));
        }

        System.out.println();
        exibirRelatorio(pesos, alturas);
    }
}
