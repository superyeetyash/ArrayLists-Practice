package SchoolAssignments;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToePanel extends JPanel {
    private TicTacToe game;

    public TicTacToePanel() {
        game = new TicTacToe();
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.white);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = e.getY() / 100;
                int col = e.getX() / 100;
                game.makeMove(row, col);
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.draw(g);
    }
}
