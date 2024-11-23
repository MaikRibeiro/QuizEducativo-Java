package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class QuizApp extends JFrame implements ActionListener {

	private static final long serialVersionUID = 6574515577473204562L;

	private String[][] questions = new String[20][5];
	private String[][] answers = new String[20][2];
	private String[][] userAnswers = new String[20][1];   

	private JLabel jlQNo, jlQuestion;
	private JRadioButton jrbOpt1, jrbOpt2, jrbOpt3, jrbOpt4;
	private ButtonGroup bgOpts = new ButtonGroup();
	private JButton jbNext, jbSubmit;

	private static int timer = 30;
	private static int ansGiven = 0;
	private static int count = 0;
	private static int score = 0;

	private String userName = null;

	public QuizApp(String userName) {
		this.userName = userName;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);

		getContentPane().setBackground(Color.BLACK);

		JLabel jlImage = new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg")));
		jlImage.setBounds(0, 0, 1280, 350);
		add(jlImage);

		jlQNo = new JLabel();
		jlQNo.setBounds(100, 400, 50, 30);
		jlQNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlQNo.setForeground(Color.WHITE);
		add(jlQNo);

		jlQuestion = new JLabel();
		jlQuestion.setBounds(130, 400, 900, 30);
		jlQuestion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlQuestion.setForeground(Color.WHITE);
		add(jlQuestion);

		questions[0][0] = "Qual é o valor de 2⁵?";
		questions[0][1] = "32";
		questions[0][2] = "25";
		questions[0][3] = "10";
    questions[0][4] = "20";

    questions[1][0] = "Dada a equação 3x + 5 = 11. Qual é a solução?";
    questions[1][1] = "2";
    questions[1][2] = "3";
    questions[1][3] = "4";
    questions[1][4] = "5";

    questions[2][0] = "A área de um triângulo de base 10 cm e altura 5 cm é:";
    questions[2][1] = "25cm²";
    questions[2][2] = "50cm²";
    questions[2][3] = "15cm²";
    questions[2][4] = "20cm²";

    questions[3][0] = "Qual é o valor de √144?";
    questions[3][1] = "12";
    questions[3][2] = "8";
    questions[3][3] = "10";
    questions[3][4] = "Nenhuma das anteriores";

    questions[4][0] = "O que é um número primo?";
    questions[4][1] = "Um número que só é divisível por 1 e ele mesmo";
    questions[4][2] = "Um número divisível por 2.";
    questions[4][3] = "Um número ímpar";
    questions[4][4] = "Um número maior que 100";

    questions[5][0] = "Qual é a soma dos ângulos internos de um triângulo?";
    questions[5][1] = "180°";
    questions[5][2] = "90°";
    questions[5][3] = "270°";
    questions[5][4] = "360°";

    questions[6][0] = "Quanto é 15% de R$200,00";
    questions[6][1] = "R$30,00";
    questions[6][2] = "R$100,00";
    questions[6][3] = "R$20,00";
    questions[6][4] = "R$180,00";

    questions[7][0] = "Se (a + 4 = 10) e (a - 4 = 2), quanto vale 'a'?";
    questions[7][1] = "6";
    questions[7][2] = "4";
    questions[7][3] = "5";
    questions[7][4] = "3";

    questions[8][0] = "O valor de (x) que satisfaz (x² = 49) é:";
    questions[8][1] = "-7 e 7";
    questions[8][2] = "24,5";
    questions[8][3] = "7";
    questions[8][4] = "26";

    questions[9][0] = "Qual é o perímetro de um quadrado com lado 8 cm?";
    questions[9][1] = "32cm";
    questions[9][2] = "16cm";
    questions[9][3] = "64cm";
    questions[9][4] = "8cm";

    //---------------------Português-----------------------
    
		questions[10][0] = "Qual é o sujeito na frase: \"Os alunos estudam para a prova\"?";
    questions[10][1] = "Os alunos";
    questions[10][2] = "Estudam";
    questions[10][3] = "Para a prova";
    questions[10][4] = "Prova";

    questions[11][0] = "Qual das palavras abaixo é um substantivo abstrato?";
    questions[11][1] = "Coragem";
    questions[11][2] = "Mesa";
    questions[11][3] = "Casa";
    questions[11][4] = "Flor";

    questions[12][0] = "Qual das palavras abaixo está grafada corretamente?";
    questions[12][1] = "Conserto";
    questions[12][2] = "Tranzeunte";
    questions[12][3] = "Propiço";
    questions[12][4] = "Inxeção";

    questions[13][0] = "A frase \"Ela trouxe o livro para ler\" contém:";
    questions[13][1] = "Uma preposição";
    questions[13][2] = "Uma conjunção coordenativa";
    questions[13][3] = "Um verbo no futuro";
    questions[13][4] = "Um pronome de tratamento";

    questions[14][0] = "Qual é o antônimo de \"feliz\"?";
    questions[14][1] = "Triste";
    questions[14][2] = "Contente";
    questions[14][3] = "Alegre";
    questions[14][4] = "Amargo";

    questions[15][0] = "Identifique a função da palavra \"que\" na frase: \"O filme que assistimos foi emocionante\"";
    questions[15][1] = "Pronome relativo";
    questions[15][2] = "Conjunção";
    questions[15][3] = "Advérbio";
    questions[15][4] = "Preposição";

    questions[16][0] = "A oração \"Embora esteja cansado, ele foi trabalhar\" é:";
    questions[16][1] = "Subordinada adverbial concessiva";
    questions[16][2] = "Coordenada";
    questions[16][3] = "Subordinada substantiva";
    questions[16][4] = "Principal";

    questions[17][0] = "Qual palavra da frase \"Os livros na estante são antigos\" é um adjetivo?";
    questions[17][1] = "antigos";
    questions[17][2] = "estante";
    questions[17][3] = "livros";
    questions[17][4] = "são";

    questions[18][0] = "Na palavra \"coração\", qual é o tipo de acento utilizado?";
    questions[18][1] = "Nenhum";
    questions[18][2] = "Agudo";
    questions[18][3] = "Circunflexo";
    questions[18][4] = "Grave";

    questions[19][0] = "Qual alternativa possui uma oração subordinada adjetiva?";
    questions[19][1] = "O carro que comprei é novo";
    questions[19][2] = "Comprei um carro novo";
    questions[19][3] = "Eles saíram cedo para trabalhar";
    questions[19][4] = "A decisão foi rápida";
    
    // ---------------------Answers------------------------

    answers[0][1]  = "32";
    answers[1][1]  = "2";
    answers[2][1]  = "25cm²";
    answers[3][1]  = "12";
    answers[4][1]  = "Um número que só é divisível por 1 e ele mesmo";
    answers[5][1]  = "180°";
    answers[6][1]  = "R$30,00";
    answers[7][1]  = "6";
    answers[8][1]  = "-7 e 7";
    answers[9][1]  = "32cm";
    // -------------português
    answers[10][1] = "Os alunos";
    answers[11][1] = "Coragem";
    answers[12][1] = "Conserto";
    answers[13][1] = "Uma preposição";
    answers[14][1] = "Triste";
    answers[15][1] = "Pronome relativo";
    answers[16][1] = "Subordinada adverbial concessiva";
    answers[17][1] = "antigos";
    answers[18][1] = "Nenhum";
    answers[19][1] = "O carro que comprei é novo";

    jrbOpt1 = new JRadioButton("Opção 1");
    jrbOpt1.setBounds(130, 450, 700, 30);
    jrbOpt1.setFont(new Font("Dialog", Font.PLAIN, 16));
    jrbOpt1.setBackground(Color.BLACK);
    jrbOpt1.setForeground(Color.WHITE);
    jrbOpt1.setBorder(null);
    add(jrbOpt1);

    jrbOpt2 = new JRadioButton("Opção 1");
    jrbOpt2.setBounds(130, 490, 700, 30);
    jrbOpt2.setFont(new Font("Dialog", Font.PLAIN, 16));
    jrbOpt2.setBackground(Color.BLACK);
    jrbOpt2.setForeground(Color.WHITE);
    jrbOpt2.setBorder(null);
    add(jrbOpt2);

    jrbOpt3 = new JRadioButton("Opção 1");
    jrbOpt3.setBounds(130, 530, 700, 30);
    jrbOpt3.setFont(new Font("Dialog", Font.PLAIN, 16));
    jrbOpt3.setBackground(Color.BLACK);
    jrbOpt3.setForeground(Color.WHITE);
    jrbOpt3.setBorder(null);
    add(jrbOpt3);

    jrbOpt4 = new JRadioButton("Opção 1");
    jrbOpt4.setBounds(130, 570, 700, 30);
    jrbOpt4.setFont(new Font("Dialog", Font.PLAIN, 16));
    jrbOpt4.setBackground(Color.BLACK);
    jrbOpt4.setForeground(Color.WHITE);
    jrbOpt4.setBorder(null);
    add(jrbOpt4);

    bgOpts = new ButtonGroup();
    bgOpts.add(jrbOpt1);
    bgOpts.add(jrbOpt2);
    bgOpts.add(jrbOpt3);
    bgOpts.add(jrbOpt4);

    jbNext = new JButton("Next");
    jbNext.setBounds(1050, 500, 180, 30);
    jbNext.setFont(new Font("Arial", Font.PLAIN, 22));
    jbNext.setBackground(new Color(50, 150, 118));
    jbNext.setForeground(Color.WHITE);
    jbNext.addActionListener(this);
    add(jbNext);

    jbSubmit = new JButton("Finalizar");
    jbSubmit.setBounds(1050, 540, 180, 30);
    jbSubmit.setFont(new Font("Arial", Font.PLAIN, 22));
    jbSubmit.setBackground(new Color(50, 150, 118));
    jbSubmit.setForeground(Color.WHITE);
    jbSubmit.setEnabled(false);
    jbSubmit.addActionListener(this);
    add(jbSubmit);

    start(count);
    setVisible(true);

    addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            jlImage.setIcon(null);
            dispose();
        }
    });
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbNext) {
			repaint();

			ansGiven = 1;
			if (bgOpts.getSelection() == null)
				userAnswers[count][0] = "";
			else
				userAnswers[count][0] = bgOpts.getSelection().getActionCommand();

			if (count == 18) {
				jbNext.setEnabled(false);
				jbSubmit.setEnabled(true);
			}

			count++;
			start(count);

		} else {
			ansGiven = 1;
			if (bgOpts.getSelection() == null)
				userAnswers[count][0] = "";
			else
				userAnswers[count][0] = bgOpts.getSelection().getActionCommand();

			for (int i = 0; i < userAnswers.length; i++) {

				if (userAnswers[i][0].equals(answers[i][1]))
					score += 10;
				else
					score += 0;
			}
			setVisible(false);
			new Score(userName, score);
		}
	}

	public void paint(Graphics g) {
		super.paint(g);

		String time = "Tempo restante: " + timer + "s";

		if (timer >= 6)
			g.setColor(Color.WHITE);
		else
			g.setColor(Color.RED);

		g.setFont(new Font("Arial", Font.BOLD, 18));

		if (timer > 0)
			g.drawString(time, 550, 410);
		else
			g.drawString("Tempo esgotado", 550, 410);
			

		timer--;
		
		try {
			Thread.sleep(1000);
			repaint();

		} catch (Exception e) {
			e.printStackTrace(); 
		}

		if (ansGiven == 1) {
			ansGiven = 0;
			timer = 30;

		} else if (timer < 0) {
			timer = 30;

			if (count == 18) {
				jbNext.setEnabled(false);
				jbSubmit.setEnabled(true);
			}

			if (count == 19) { // submit button

				if (bgOpts.getSelection() == null)
					userAnswers[count][0] = "";
				else
					userAnswers[count][0] = bgOpts.getSelection().getActionCommand();

				for (int i = 0; i < userAnswers.length; i++) {

					if (userAnswers[i][0].equals(answers[i][1]))
						score += 10;
					else
						score += 0;
				}
				setVisible(false);
				new Score(time, score);

			} else { // next button

				if (bgOpts.getSelection() == null)
					userAnswers[count][0] = "";
				else
					userAnswers[count][0] = bgOpts.getSelection().getActionCommand();
			}

			count++;
			start(count);
		}
	}

	private void start(int count) {
		jlQNo.setText((count + 1) + ".");
		jlQuestion.setText(questions[count][0]);
		jrbOpt1.setText(questions[count][1]);
		jrbOpt1.setActionCommand(questions[count][1]);

		jrbOpt2.setText(questions[count][2]);
		jrbOpt2.setActionCommand(questions[count][2]);

		jrbOpt3.setText(questions[count][3]);
		jrbOpt3.setActionCommand(questions[count][3]);
		
		jrbOpt4.setText(questions[count][4]);
		jrbOpt4.setActionCommand(questions[count][4]);

		bgOpts.clearSelection();
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new QuizApp("");
			}
		});
	}
}