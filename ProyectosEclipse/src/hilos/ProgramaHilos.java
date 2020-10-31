package hilos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

import hilos.threads.ComponentThread;
import java.awt.event.ActionListener;

public class ProgramaHilos extends JFrame {

	private JPanel contentPane;
	private JProgressBar ProgressBar1;
	private JProgressBar ProgressBar2;
	private ComponentThread Barra1,Barra2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramaHilos frame = new ProgramaHilos();
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
	public ProgramaHilos() {
		setResizable(false);
		setTitle("Carrera de barras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(18, 13, 663, 338);
		contentPane.add(panel);
		panel.setLayout(null);
				
		JLabel lblNewLabel = new JLabel("Barra N\u00B01");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(53, 77, 95, 14);
		panel.add(lblNewLabel);
		
		JLabel lblProgressDos = new JLabel("Barra N\u00B02");
		lblProgressDos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProgressDos.setBounds(53, 189, 95, 14);
		panel.add(lblProgressDos);
		
		ProgressBar1 = new JProgressBar();
		ProgressBar1.setBounds(160, 55, 472, 57);
		panel.add(ProgressBar1);
			
		ProgressBar2 = new JProgressBar();
		ProgressBar2.setBounds(160, 165, 472, 57);
		panel.add(ProgressBar2);
		
		JButton btnCorrer = new JButton("Empezar carrera");
		btnCorrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Barra1 = new ComponentThread(ProgressBar1, "Uno");
				Barra2 = new ComponentThread(ProgressBar2, "Dos");
				
				Barra1.start();
				Barra2.start();
			}
		});
		btnCorrer.setBounds(217, 257, 216, 68);
		panel.add(btnCorrer);
				
	}
}
