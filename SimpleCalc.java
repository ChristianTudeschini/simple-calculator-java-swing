import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleCalc extends JFrame {
	
    private JLabel lblvalorn1;
    private JLabel lblvalorn2;
    private JLabel lblres;
    private JTextField txtvn1;
    private JTextField txtvn2;
    private JButton btnsoma;
    private JButton btnsubt;
    private JButton btnmult;
    private JButton btndivi;

	public SimpleCalc() {
        setTitle("Calculadora");
		setLayout(new FlowLayout());		
		lblvalorn1 = new JLabel("Primeiro Valor: ");
        txtvn1 = new JTextField(12);
        lblvalorn2 = new JLabel("Segundo Valor: ");
        txtvn2 = new JTextField(12);
        btnsoma = new JButton("Soma");
        btnsubt = new JButton("Subtracao");
        btnmult = new JButton("Multiplicacao");
        btndivi = new JButton("Divisao");
        lblres = new JLabel("        ");

        add(lblvalorn1);
        add(txtvn1);
        add(lblvalorn2);
        add(txtvn2);
        add(btnsoma);
        add(btnsubt);
        add(btnmult);
        add(btndivi);
        add(lblres);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        ActionListener soma = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(txtvn1.getText());
                double n2 = Double.parseDouble(txtvn2.getText());
                double so = n1 + n2;
                lblres.setText(Double.toString(so));                
			}
        };
        
        ActionListener subt = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(txtvn1.getText());
                double n2 = Double.parseDouble(txtvn2.getText());
                double su = n1 - n2;
                lblres.setText(Double.toString(su));
			}
        };

        ActionListener mult = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(txtvn1.getText());
                double n2 = Double.parseDouble(txtvn2.getText());
                double mu = n1 * n2;
                lblres.setText(Double.toString(mu));
			}
        };

        ActionListener divi = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(txtvn1.getText());
                double n2 = Double.parseDouble(txtvn2.getText());
                double di = n1 / n2;
                lblres.setText(Double.toString(di));
			}
        };

        btnsoma.addActionListener(soma);
        btnsubt.addActionListener(subt);
        btnmult.addActionListener(mult);
        btndivi.addActionListener(divi);

        setVisible(true);
	}

	public static void main(String[] args) {		
		new SimpleCalc();
	}
}