import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int hora, minuto;
        char amPm;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora (0-23) e os minutos (0-59):");
        hora = scanner.nextInt();
        minuto = scanner.nextInt();

        while (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59) {
            if (hora >= 12) {
                amPm = 'P';
                if (hora > 12) {
                    hora -= 12;
                }
            } else {
                amPm = 'A';
                if (hora == 0) {
                    hora = 12;
                }
            }

            if (minuto == 0) {
                minuto = 00;
            }

            System.out.printf("%d:%02d %c\n", hora, minuto, amPm);

            System.out.println("Digite a hora (0-23) e os minutos (0-59):");
            hora = scanner.nextInt();
            minuto = scanner.nextInt();
        }

        scanner.close();
    }
}
