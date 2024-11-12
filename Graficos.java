
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Graficos  extends JFrame {
    public Graficos(){
        setTitle("Teoría de Autómatas: Proyecto tercer parcial");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel txtTitulo = new JLabel("Traductor de Codigo Morse");
        txtTitulo.setFont(new Font("Serif", Font.PLAIN, 30));
        txtTitulo.setPreferredSize(new Dimension(200, 50));
        txtTitulo.setBounds(260, 0, 400, 50);
        add(txtTitulo);

        JLabel txtTextoIn = new JLabel("Introducir cadena de texto: ");
        txtTextoIn.setFont(new Font("Serif", Font.PLAIN, 20));
        txtTextoIn.setBounds(30, 70, 330, 40);
        add(txtTextoIn);

        JTextField jtfCadenaIn = new JTextField();
        jtfCadenaIn.setFont(new Font("Serif", Font.PLAIN, 25));
        jtfCadenaIn.setBounds(30, 110, 330, 50);
        add(jtfCadenaIn);

        JSeparator separador = new JSeparator();
        separador.setBounds(20, 200, 370, 10);
        add(separador);

        JLabel txtTextoOut = new JLabel("Cadena de texto traducida: ");
        txtTextoOut.setFont(new Font("Serif", Font.PLAIN, 20));
        txtTextoOut.setBounds(30, 220, 330, 40 );
        add(txtTextoOut);

        JTextField jtfCadenaOut = new JTextField();
        jtfCadenaOut.setFont(new Font("Serif", Font.PLAIN, 25));
        jtfCadenaOut.setBounds(30, 260, 330, 50);
        add(jtfCadenaOut);

        JLabel txtBtnAutomata = new JLabel("Autómata utilizado");
        txtBtnAutomata.setFont(new Font("Serif", Font.PLAIN, 20));
        txtBtnAutomata.setBounds(30, 400, 330, 40);
        add(txtBtnAutomata);

        JButton btnAutomata = new JButton("Ver Autómata");
        btnAutomata.setFont(new Font("Serif", Font.PLAIN, 20));
        btnAutomata.setBounds(30, 440, 185, 50);
        add(btnAutomata);
        
        String rutaImg = "C:/Users/luisf/OneDrive/Escritorio/6to/Teoria de Automatas/3er parcial/Traductor Lenguaje Morse/Traductor-lenguaje-Morse/img/morse.png";
        ImageIcon morseimg = new ImageIcon(rutaImg);
        Image image = morseimg.getImage();
        Image escalaImagen = image.getScaledInstance(400, 390, Image.SCALE_SMOOTH);
        ImageIcon escalaIcono = new ImageIcon(escalaImagen);

        JLabel label = new JLabel(escalaIcono);
        label.setBounds(450, 110, 400, 390);
        add(label);

        JLabel txtTraduciendo = new JLabel("Traduciendo ...");
        txtTraduciendo.setFont(new Font("Serif", Font.PLAIN, 20));
        txtTraduciendo.setBounds(265, 400, 120, 40);
        add(txtTraduciendo);

        CirculoRojo circulo = new CirculoRojo();
        circulo.setBounds(300, 450, 50, 50); 
        add(circulo);

        setVisible(true);
    }

}

class CirculoRojo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(0, 0, 50, 50); 
    }
}

