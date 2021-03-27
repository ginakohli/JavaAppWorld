import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class JavaApplicationWorld extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaApplicationWorld frame = new JavaApplicationWorld();
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
	public JavaApplicationWorld() {
		setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 12));
		setBackground(new Color(204, 153, 204));
		setForeground(Color.BLACK);
		setTitle("Java Application World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 688, 673);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/home/gina/Desktop/img1crop.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Calculator.main(new String[]{});
			}
		});
		
		btnNewButton.setBounds(-5, 87, 336, 265);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CharCount.main(new String[]{});
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("/home/gina/Desktop/wordcountcrop.jpg"));
		btnNewButton_1.setBounds(344, 86, 345, 268);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("/home/gina/Desktop/ipfindercrop.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IpFinder.main(new String[]{});
			}
		});
		btnNewButton_2.setBackground(new Color(204, 204, 204));
		btnNewButton_2.setBounds(1, 364, 329, 282);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(204, 153, 204));
		btnNewButton_3.setIcon(new ImageIcon("/home/gina/Desktop/testknowledgecrop.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExamSystem.main(new String[]{});
			}
		});
		btnNewButton_3.setBounds(343, 364, 345, 282);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("JAVA APPLICATION WORLD");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Century Schoolbook L", Font.BOLD, 28));
		lblNewLabel.setBounds(139, 23, 454, 52);
		contentPane.add(lblNewLabel);
		
	
	
	}
}
