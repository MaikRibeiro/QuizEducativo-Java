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
		jlRules.setBounds(930, 150, 400, 350);
		jlRules.setFont(new Font("Times New Roman", NORMAL, 16));
		jlRules.setForeground(Color.WHITE);
		jlRules.setText( "<html>" +
								"1. São 20 questões, sendo as 10 primeiras de Matemática e as seguintes de Português<br><br>" +
								"2. Nivel de complexidade das questões é até Ensino Médio<br><br>" +
								"3. Cada questão é cronometrada <br><br>" +
								"4. Para cada questão, apenas uma é a correta<br><br>" +
								"5. Responda todas as questões para finalizar o Quiz <br><br>" +
								"5. Se divirta! <br><br>" +
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
		setExtendedState(JFrame.MAXIMIZED_BOTH);
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