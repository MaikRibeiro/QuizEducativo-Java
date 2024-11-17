package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener {

	private static final long serialVersionUID = -3015097527531969563L;

	private JButton jbBack, jbStart;
	
	public Rules(String nameUser) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		getContentPane().setBackground(Color.BLACK);
		setLayout(null);
		
		JLabel jlImage = new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg")));
		jlImage.setBounds(-50, -100, 900, 800);
		add(jlImage);

		JLabel jlHeading = new JLabel("Bem vindo(a) " + nameUser);
		jlHeading.setBounds(930, 60, 330, 45);
		jlHeading.setFont(new Font("century gothic", NORMAL, 26));
		jlHeading.setForeground(Color.WHITE);
		add(jlHeading);

		JLabel jlRules = new JLabel();
		jlRules.setBounds(930, 150, 330, 350);
		jlRules.setFont(new Font("Times New Roman", NORMAL, 16));
		jlRules.setForeground(Color.WHITE);
		jlRules.setText( "<html>" +
												"1.  <br><br>" +
												"2.  <br><br>" +
												"3.  <br><br>" +
												"4.  <br><br>" +
												"5.  <br><br>" +
												"5.  <br><br>" +
												"6.  <br><br>" +
										"<html>"
										);

		add(jlRules);
		
		addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println("Free resources...");
                jlImage.setIcon(null);
                dispose();
            }
        });
		
		jbBack = new JButton("Voltar");
		jbBack.setBounds(930, 550, 100, 30);
		jbBack.setBackground(new Color(50, 150, 118));
		jbBack.setForeground(Color.WHITE);
		jbBack.addActionListener(this);
		add(jbBack);

		jbStart = new JButton("Começar");
		jbStart.setBounds(1120, 550, 100, 30);
		jbStart.setBackground(new Color(50, 150, 118));
		jbStart.setForeground(Color.WHITE);
		jbStart.addActionListener(this);
		add(jbStart);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		if (e.getSource() == jbBack) {
			new Login();
		} else if (e.getSource() == jbStart) {
			
		}
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Rules(" ");
			}
		});
	}
}