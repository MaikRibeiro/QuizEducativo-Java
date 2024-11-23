package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {

	private static final long serialVersionUID = 867348866661924368L;

	private JButton jbPlayAgain = null;

	public Score(String userName, int score) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		getContentPane().setBackground(Color.WHITE);

		ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
		Image i2 = img1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel jlImage = new JLabel(i3);
		jlImage.setBounds(0, 0, 300, 250);
		add(jlImage);

		JLabel jlHeading = new JLabel("Obrigado " + userName + " por jogar Mentes Racionais");
		jlHeading.setBounds(400, 30, 900, 50);
		jlHeading.setFont(new Font("Tahoma", Font.PLAIN, 30));
		add(jlHeading);

		JLabel jlScore = new JLabel("Sua pontuação é: " + score);
		jlScore.setBounds(350, 200, 300, 30);
		jlScore.setFont(new Font("Tahoma", Font.PLAIN, 30));
		add(jlScore);
		
		jbPlayAgain = new JButton("Jogar Novamente");
    jbPlayAgain.setBounds(350, 270, 250, 30);
    jbPlayAgain.setFont(new Font("Arial", Font.PLAIN, 22));
    jbPlayAgain.setBackground(new Color(50, 150, 118));
    jbPlayAgain.setForeground(Color.WHITE);
    add(jbPlayAgain);
		
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
		if (e.getSource() == jbPlayAgain) {
			setVisible(false);
			dispose();
			new Login();
		} else {
			setVisible(false);
			dispose();
		}
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Score("", 0);
			}
		});
	}
}