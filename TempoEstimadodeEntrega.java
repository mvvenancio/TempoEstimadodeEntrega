import java.util.Scanner;

public class TempoEstimadodeEntrega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do restaurante: ");
        String nomeRestaurante = scanner.nextLine();

        System.out.print("Digite o tempo estimado de entrega em minutos: ");
        int tempoEstimadoEntrega = scanner.nextInt();

        if (tempoEstimadoEntrega < 0 || tempoEstimadoEntrega > 240) {
            System.out.println("O tempo estimado de entrega deve ser um número entre 0 e 240.");
        } else {
            String mensagem = "O restaurante " + nomeRestaurante + " entrega em " + tempoEstimadoEntrega + " minutos.";
            System.out.println(mensagem);
        }

        scanner.close();
    }
}
