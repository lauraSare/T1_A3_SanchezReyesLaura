import java.awt.*;
import javax.swing.*;

class VentanaGui extends JFrame {
    public VentanaGui() {

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        getContentPane().setLayout(new GridBagLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setTitle("FORMULARIO DE REGISTRO GUI");
        setVisible(true);

        JLabel txtTexto1 = new JLabel("The Classic Form includes all visible fields for this list.");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.WEST; // izquierda
        add(txtTexto1, gbc);

        JLabel txtTexto2 = new JLabel("FORM OPTIONS");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        add(txtTexto2, gbc);

        JLabel txtTexto3 = new JLabel("Include the following: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        add(txtTexto3, gbc);

        JCheckBox Tittle1 = new JCheckBox("a title for your form");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(Tittle1, gbc);

        JTextField Caja1 = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(Caja1, gbc);

        JRadioButton Radio1 = new JRadioButton("Only required field");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(Radio1, gbc);

        JRadioButton Radio2 = new JRadioButton("All fields");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(Radio2, gbc);

        JLabel texto1 = new JLabel("<html>(edit required fields in <font color='blue'>the form builder</font>)</html>");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(texto1, gbc);

        JCheckBox Tittle2 = new JCheckBox("Interest group field");
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(Tittle2, gbc);

        JCheckBox Tittle3 = new JCheckBox("Required field indicators");
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(Tittle3, gbc);

        JLabel txtTexto4 = new JLabel("Set form width");
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtTexto4, gbc);

        JTextField Caja2 = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(Caja2, gbc);

        JLabel tittle4 = new JLabel("Enhance your form");
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(tittle4, gbc);
        

        JCheckBox tittle5 = new JCheckBox("Enable evil popup mode");
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(tittle5, gbc);

        JCheckBox tittle6 = new JCheckBox("Disable all JavaScript");
        gbc.gridx = 0;
        gbc.gridy = 14;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(tittle6, gbc);

        JCheckBox tittle7 = new JCheckBox("Include archive link");
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(tittle7, gbc);

        JCheckBox tittle8 = new JCheckBox("<html>Include <font color='blue'>MonkeyRewards link</font></html>");
        gbc.gridx = 0;
        gbc.gridy = 16;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(tittle8, gbc);

        JLabel txtPre = new JLabel("Preview");
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.WEST; 
        add(txtPre, gbc);

        JLabel txt1 = new JLabel("*indicate required");
        gbc.gridy = 1;
        gbc.gridwidth = 1;

        JLabel txtE = new JLabel("Email Address");
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(txtE, gbc);

        JFormattedTextField CajaE = new JFormattedTextField();
        CajaE.setColumns(10);
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(CajaE, gbc);

        JLabel txt2 = new JLabel("First Name");
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(txt2, gbc);

        JTextField cajaF = new JTextField(10);
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(cajaF, gbc);

        JLabel txt3 = new JLabel("Last Name");
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        add(txt3, gbc);

        JTextField cajaN = new JTextField(10);
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(cajaN, gbc);

        JButton btnSubs = new JButton("Subscribe");
        gbc.gridx = 3;
        gbc.gridy = 8;
        gbc.gridwidth = 3;
        add(btnSubs, gbc);

        JLabel txtCop = new JLabel("Copy/paste onto your site");
        gbc.gridx = 3;
        gbc.gridy = 9;
        gbc.gridwidth = 3;
        add(txtCop, gbc);

        JTextArea txtUlt = new JTextArea(5, 20);
        gbc.gridx = 3;
        gbc.gridy = 10;
        gbc.gridwidth = 3;
        add(txtUlt, gbc);
    }
}

public class GUI_GridbagLayout {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                new VentanaGui();
            }
        });
    }
}