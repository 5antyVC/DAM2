package factorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Entrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Titulo = new JLabel("Ponga su numero para hacer el factorial");
		Titulo.setBounds(80, 10, 254, 13);
		contentPane.add(Titulo);

		Entrada = new JTextField();
		Entrada.setBounds(74, 33, 201, 19);
		contentPane.add(Entrada);
		Entrada.setColumns(10);

		JLabel Salida = new JLabel("");
		Salida.setBounds(66, 93, 254, 21);
		contentPane.add(Salida);

		JButton Boton = new JButton("Factorial");
		Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String entri = Entrada.getText();
					int valor = Integer.parseInt(entri);
					int resultado = factorial(valor);
					Salida.setText("El factorial " + valor + " es " + resultado);
				} catch ( NumberFormatException ex) {
					Salida.setText("Introduzca un numero entero y positivo");
				}
				
				
				
			}
		});
		Boton.setBounds(74, 62, 85, 21);
		contentPane.add(Boton);
		
		JButton SalidaSumarial = new JButton("Sumarial");
		SalidaSumarial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String entri = Entrada.getText();
					int valor = Integer.parseInt(entri);
					int resultado = sumar(valor);
					Salida.setText("El sumarial " + valor + " es " + resultado);
				} catch ( NumberFormatException ex) {
					Salida.setText("Introduzca un numero entero y positivo");
				}
				
			}
		});
		SalidaSumarial.setBounds(190, 62, 85, 21);
		contentPane.add(SalidaSumarial);

	}

	public static int factorial(int n) {
		int facto = 1;
		for (int i = n; i >= 1; i--) {
			facto *= i;
		}
		return facto;
	}
	
	public static int sumar(int n) {	
        int suma = 0;
        for (int i = n; i >= 1; i--) {
            suma += i;
        }
        return suma;
    }
	
}
