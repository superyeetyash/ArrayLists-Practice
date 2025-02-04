package SchoolAssignments;

import java.awt.*;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.black);
        for (int i = 1; i < 3; i++) {
            g.drawLine(0, i * 100, 300, i * 100);
            g.drawLine(i * 100, 0, i * 100, 300);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    g.drawLine(j * 100, i * 100, (j + 1) * 100, (i + 1) * 100);
                    g.drawLine((j + 1) * 100, i * 100, j * 100, (i + 1) * 100);
                } else if (board[i][j] == 'O') {
                    g.drawOval(j * 100, i * 100, 100, 100);
                }
            }
        }
    }

    public void makeMove(int row, int col) {
        if (board[row][col] == '-') {
            board[row][col] = currentPlayer;
            if (currentPlayer == 'X') {
                currentPlayer = 'O';
                int[] bestMove = findBestMove();
                if (bestMove != null) {
                    board[bestMove[0]][bestMove[1]] = currentPlayer;
                    currentPlayer = 'X';
                }
            }
        }
    }

    public int[] findBestMove() {
        int bestVal = Integer.MIN_VALUE;
        int[] bestMove = null;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    board[i][j] = 'O';
                    int moveVal = minimax(0, false);
                    board[i][j] = '-';
                    if (moveVal > bestVal) {
                        bestMove = new int[]{i, j};
                        bestVal = moveVal;
                    }
                }
            }
        }
        return bestMove;
    }

    public int minimax(int depth, boolean isMax) {
        int score = evaluate();

        if (score == 10) return score - depth;
        if (score == -10) return score + depth;
        if (!isMovesLeft()) return 0;

        if (isMax) {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        board[i][j] = 'O';
                        best = Math.max(best, minimax(depth + 1, false));
                        board[i][j] = '-';
                    }
                }
            }
            return best;
        } else {
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        board[i][j] = 'X';
                        best = Math.min(best, minimax(depth + 1, true));
                        board[i][j] = '-';
                    }
                }
            }
            return best;
        }
    }

    public boolean isMovesLeft() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return true;
                }
            }
        }
        return false;
    }

    public int evaluate() {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                if (board[row][0] == 'O') return 10;
                else if (board[row][0] == 'X') return -10;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                if (board[0][col] == 'O') return 10;
                else if (board[0][col] == 'X') return -10;
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 'O') return 10;
            else if (board[0][0] == 'X') return -10;
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == 'O') return 10;
            else if (board[0][2] == 'X') return -10;
        }

        return 0;
    }
}