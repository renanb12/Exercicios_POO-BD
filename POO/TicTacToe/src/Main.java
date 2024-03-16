import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tictactoe game = new Tictactoe();
        Scanner sc = new Scanner(System.in);

        while (true) {
            game.showGrid();
            System.out.print("Choose the line (0, 1 ou 2): ");
            int line = sc.nextInt();
            System.out.print("Choose column (0, 1 ou 2): ");
            int column = sc.nextInt();

            if (game.play(line, column)) {
                break;
            }
        }
        sc.close();
    }
}
