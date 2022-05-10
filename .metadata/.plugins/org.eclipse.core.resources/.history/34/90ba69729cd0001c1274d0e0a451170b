package com.team2.ud20.ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/**
 * 
 * UD20-Actividades - com.team2.ud20.ejercicio3 - Ejercicio3App
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 10/05/2022
 */
public class Ejercicio3App extends JFrame {

	private JPanel contentPane;
	int contador1 = 0;
	int contador2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3App frame = new Ejercicio3App();
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
	public Ejercicio3App() {
		
		
		setTitle("Ejercicio 3, contador dos Botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Boton 2");
		
		btnNewButton.setBounds(264, 301, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Boton 1");
		
		btnNewButton_1.setBounds(10, 301, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("El botón uno se ha pulsado:");
		lblNewLabel.setBounds(34, 91, 294, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("El botón dos se ha pulsado:");
		lblNewLabel_1.setBounds(34, 129, 294, 14);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("El " + btnNewButton.getText() + " se ha pusado " + ++contador1 + " veces" );
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_1.setText("El " + btnNewButton_1.getText() + " se ha pusado " + ++contador2 + " veces" );
			}
		});
	}

	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
