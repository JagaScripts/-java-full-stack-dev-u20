package com.team2.ud20.ejercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class Ejercicio1App extends JFrame {

	private JPanel contentPane;
	private final static int MAXIMIZED_BOTH = 10;
	private final static int  ABORT = 11;
	private final static int  WIDTH = 256;
	private final static int  HEIGHT = 14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1App frame = new Ejercicio1App();
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
	public Ejercicio1App() {
		
		setTitle("Ventana con título");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Etiqueta de la ventana");
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		lblNewLabel.setBorder(border);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 256, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(404, 230, 30, 20);
		
		contentPane.add(spinner);
		spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				
				
				Integer valorSpinner = Integer.parseInt(spinner.getValue().toString()) * 2;
				lblNewLabel.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH + valorSpinner , HEIGHT + valorSpinner);
				//tf.setText(spinner.getValue().toString());
			}
		
		});
	}
}
