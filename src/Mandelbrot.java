import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Mandelbrot extends JFrame {
    private final int WIDTH = 800;
    private final int HEIGHT = 800;
    private final int MAX_ITER = 570;
    private double zoom = 150;
    private double centerX = -0.75; // Adjusted to focus on the smallest shape
    private double centerY = 0;
    private BufferedImage image;

    public Mandelbrot() {
        super("Mandelbrot Set");
        setBounds(100, 100, WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Timer timer = new Timer(50, e -> { // Decreased timer interval for smoother zoom
            zoom *= 1.05; // Reduced zoom factor for smoother transition
            createMandelbrotSet();
            repaint();
        });
        timer.start();
    }

    private void createMandelbrotSet() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                double zx = 0;
                double zy = 0;
                double cX = (x - WIDTH / 2) / zoom + centerX;
                double cY = (y - HEIGHT / 2) / zoom + centerY;
                int iter = MAX_ITER;
                while (zx * zx + zy * zy < 4 && iter > 0) {
                    double tmp = zx * zx - zy * zy + cX;
                    zy = 2.0 * zx * zy + cY;
                    zx = tmp;
                    iter--;
                }
                image.setRGB(x, y, iter | (iter << 8));
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Mandelbrot mandelbrot = new Mandelbrot();
            mandelbrot.setVisible(true);
        });
    }
}