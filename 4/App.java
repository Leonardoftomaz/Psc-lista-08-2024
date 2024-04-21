public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(obterCaractereParaNumero(10)); // imprime 'P'
        System.out.println(obterCaractereParaNumero(-10)); // imprime 'N'
        System.out.println(obterCaractereParaNumero(0)); // imprime 'N'
    }

    public static char obterCaractereParaNumero(int num) {
        if (num > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}
