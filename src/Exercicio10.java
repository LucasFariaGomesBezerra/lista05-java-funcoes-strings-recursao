public class Exercicio10 {

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("digite n (1 a 30): "));

        if (n < 1 || n > 30) {
            System.out.println("quantidade invalida");
            return;
        }

        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            fib[i] = fibonacci(i);
        }

        exibir(fib);
        System.out.println("soma: " + somar(fib));
    }
}
