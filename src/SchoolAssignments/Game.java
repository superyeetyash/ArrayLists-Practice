package SchoolAssignments;

import javax.swing.JFrame;

//public class SchoolAssignments.Game {
//    public static void main(String[] args) {
////        JFrame frame = new JFrame();
////        SchoolAssignments.GamePanel gamePanel = new SchoolAssignments.GamePanel();
////
////        frame.add(gamePanel);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.setTitle("Snake SchoolAssignments.Game");
////        frame.pack();
////        frame.setVisible(true);
////        frame.setLocationRelativeTo(null);
//
//    }
//}

//import javax.swing.JFrame;

public class Game {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        TicTacToePanel ticTacToePanel = new TicTacToePanel();

        frame.add(ticTacToePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tic Tac Toe");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}