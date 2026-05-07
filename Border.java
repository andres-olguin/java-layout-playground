import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {

    public Border() {
        setTitle("Aplicación Layout");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JButton btnNorte = new JButton("Norte");
        add(btnNorte, BorderLayout.NORTH);

        JButton btnSur = new JButton("Sur");
        add(btnSur, BorderLayout.SOUTH);

        JButton btnEste = new JButton("Este");
        add(btnEste, BorderLayout.EAST);

        JButton btnOeste = new JButton("Oeste");
        add(btnOeste, BorderLayout.WEST);

        JTextArea textoCentro = new JTextArea(" ");
        add(new JScrollPane(textoCentro), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Border());
    }
}