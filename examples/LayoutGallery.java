import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class LayoutGallery {
    static JPanel borderSample() {
        JPanel panel = new JPanel(new BorderLayout(8, 8));
        panel.add(new JButton("Norte"), BorderLayout.NORTH);
        panel.add(new JButton("Sur"), BorderLayout.SOUTH);
        panel.add(new JButton("Este"), BorderLayout.EAST);
        panel.add(new JButton("Oeste"), BorderLayout.WEST);
        panel.add(new JButton("Centro"), BorderLayout.CENTER);
        return panel;
    }

    static JPanel buttons(String name, java.awt.LayoutManager layout) {
        JPanel panel = new JPanel(layout);
        for (int i = 1; i <= 6; i++) panel.add(new JButton(name + " " + i));
        return panel;
    }

    static void display() {
        JFrame frame = new JFrame("Layout Playground");
        frame.setSize(800, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Border", borderSample());
        tabs.addTab("Grid", buttons("Celda", new GridLayout(2, 3, 8, 8)));
        tabs.addTab("Flow", buttons("Ítem", new FlowLayout(FlowLayout.CENTER, 8, 8)));
        frame.add(new JLabel("Selecciona un layout y cambia el tamaño de la ventana"), BorderLayout.NORTH);
        frame.add(tabs, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) { SwingUtilities.invokeLater(LayoutGallery::display); }
}
