import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac-Man");
        frame.setSize(boardWidth, boardHeight + 50); // Added extra space for the button
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Pacman pacmanGame = new Pacman();
        frame.setLayout(new BorderLayout());
        frame.add(pacmanGame, BorderLayout.CENTER);

        // Restart button
        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(e -> pacmanGame.restartGame());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(restartButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);
    }
}
