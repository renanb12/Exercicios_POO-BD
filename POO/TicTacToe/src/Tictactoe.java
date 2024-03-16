enum State {
    EMPTY,
    PLAYER1,
    PLAYER2
}

public class Tictactoe {
    private State[][] grid;
    private State currentPlayer;


    public Tictactoe() {
        grid = new State[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = State.EMPTY;
            }
        }
        currentPlayer = State.PLAYER1;
    }

    public void showGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(stateToString(grid[i][j]));
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----");
            }
        }
    }


    public boolean play(int line, int column) {
        if (grid[line][column] == State.EMPTY) {
            grid[line][column] = currentPlayer;
            if (checkWin() || verificarEmpate()) {
                return true;
            }
            currentPlayer = (currentPlayer == State.PLAYER1) ? State.PLAYER2 : State.PLAYER1;
            return false;
        } else {
            System.out.println("Occupied house, choose another one.");
            return false;
        }
    }


    private boolean checkWin() {

        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != State.EMPTY) ||
                    (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i] != State.EMPTY)) {
                System.out.println("Player " + stateToString(currentPlayer) + " win!");
                return true;
            }
        }

        if ((grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != State.EMPTY) ||
                (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != State.EMPTY)) {
            System.out.println("Player " + stateToString(currentPlayer) + " win!");
            return true;
        }
        return false;
    }


    private boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == State.EMPTY) {
                    return false;
                }
            }
        }
        System.out.println("Draw!");
        return true;
    }


    private String stateToString(State state) {
        switch (state) {
            case EMPTY:
                return " ";
            case PLAYER1:
                return "X";
            case PLAYER2:
                return "O";
            default:
                return "";
        }
    }

}
