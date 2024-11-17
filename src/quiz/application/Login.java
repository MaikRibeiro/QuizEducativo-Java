package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 5598741349090497172L;
	
	private JButton jbBack, jbRules;
	private JTextField jtfNameInput;
	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLACK);
		setLayout(null);

		JLabel jlImage = new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg")));
		jlImage.setBounds(-50, -100, 900, 800);
		add(jlImage);

		JLabel jlHeading = new JLabel("Mentes Racionais");
		jlHeading.setBounds(935, 250, 330, 45);
		jlHeading.setFont(new Font("century gothic", NORMAL, 32));
		jlHeading.setForeground(Color.WHITE);
		add(jlHeading);

		JLabel jlNameTitle = new JLabel("Digite seu primeiro nome");
		jlNameTitle.setBounds(900, 330, 480, 20);
		jlNameTitle.setFont(new Font("century gothic", NORMAL, 14));
		jlNameTitle.setForeground(Color.WHITE);
		add(jlNameTitle);

		jtfNameInput = new JTextField();
		jtfNameInput.setBounds(900, 350, 350, 20);
		jtfNameInput.setFont(new Font("Times New Roman", NORMAL, 20));
		add(jtfNameInput);

		jbBack = new JButton("Voltar");
		jbBack.setBounds(930, 390, 100, 30);
		jbBack.setBackground(new Color(50, 150, 118));
		jbBack.setForeground(Color.WHITE);
		jbBack.addActionListener(this);
		add(jbBack);

		jbRules = new JButton("Regras");
		jbRules.setBounds(1120, 390, 100, 30);
		jbRules.setBackground(new Color(50, 150, 118));
		jbRules.setForeground(Color.WHITE);
		jbRules.addActionListener(this);
		add(jbRules);

		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println("Free resources...");
                jlImage.setIcon(null);
                dispose();
            }
        });
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbRules) {
			setVisible(false);
			new Rules(jtfNameInput.getText());
		} else if (e.getSource() == jbBack) {
			setVisible(false);
		}
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Login();
			}
		});
	}
}