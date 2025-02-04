import javax.swing.*;
import java.awt.*;

public class FibonacciVisualization extends JPanel {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int MAX_FIB = 100; // Number of Fibonacci numbers to visualize

    public FibonacciVisualization() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    private int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;
        int y = HEIGHT / 2;
        for (int i = 0; i < MAX_FIB; i++) {
            int fib = fibonacci(i);
            g.drawRect(x, y - fib / 2, fib, fib);
            x += fib + 10;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fibonacci Visualization");
        FibonacciVisualization panel = new FibonacciVisualization();
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}