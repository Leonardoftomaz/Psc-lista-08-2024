public class App {
    public static void main(String[] args) throws Exception {
        int soma = somarTresNumeros(1, 2, 3);
        System.out.println("A soma de 1, 2 e 3 é: " + soma);
    }

    public static int somarTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}
