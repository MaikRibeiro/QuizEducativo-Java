package quiz.application;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class QuizApp extends JFrame {

	private static final long serialVersionUID = 6574515577473204562L;

	private String[][] questions = new String[9][5];
	private String[][] answers = new String[9][5];

	public QuizApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);

		getContentPane().setBackground(Color.BLACK);

		JLabel jlImage = new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg")));
		jlImage.setBounds(0, 0, 1280, 392);
		add(jlImage);

		questions[0][0] = "Qual é o valor de 2⁵?";
	    questions[0][1] = "25";
	    questions[0][2] = "10";
	    questions[0][3] = "32";
	    questions[0][4] = "20";
	
	    questions[1][0] = "Dada a equação 3x + 5 = 11. Qual é a solução?";
	    questions[1][1] = "2";
	    questions[1][2] = "3";
	    questions[1][3] = "4";
	    questions[1][4] = "5";
	
	    questions[2][0] = "A área de um triângulo de base 10 cm e altura 5 cm é:";
	    questions[2][1] = "50cm²";
	    questions[2][2] = "25cm²";
	    questions[2][3] = "15cm²";
	    questions[2][4] = "20cm²";
	
	    questions[3][0] = "Qual é o valor de √144?";
	    questions[3][1] = "8";
	    questions[3][2] = "12";
	    questions[3][3] = "10";
	    questions[3][4] = "Nenhuma das anteriores";
	
	    questions[4][0] = "O que é um número primo?";
	    questions[4][1] = "Um número que só é divisível por 1 e ele mesmo";
	    questions[4][2] = "Um número divisível por 2.";
	    questions[4][3] = "Um número ímpar";
	    questions[4][4] = "Um número maior que 100";
	
	    questions[5][0] = "Qual é a soma dos ângulos internos de um triângulo?";
	    questions[5][1] = "90°";
	    questions[5][2] = "180°";
	    questions[5][3] = "270°";
	    questions[5][4] = "360°";
	
	    questions[6][0] = "Quanto é 15% de R$200,00";
	    questions[6][1] = "R$20,00";
	    questions[6][2] = "R$100,00";
	    questions[6][3] = "R$30,00";
	    questions[6][4] = "R$180,00";
	
	    questions[7][0] = "Se (a + 4 = 10) e (a - 4 = 2), quanto vale 'a'?";
	    questions[7][1] = "3";
	    questions[7][2] = "4";
	    questions[7][3] = "5";
	    questions[7][4] = "6";
	
	    questions[8][0] = "O valor de (x) que satisfaz (x² = 49) é:";
	    questions[8][1] = "26";
	    questions[8][2] = "24,5";
	    questions[8][3] = "7";
	    questions[8][4] = "-7 e 7";
	
	    questions[9][0] = "Qual é o perímetro de um quadrado com lado 8 cm?";
	    questions[9][1] = "16cm";
	    questions[9][2] = "32cm";
	    questions[9][3] = "64cm";
	    questions[9][4] = "8cm";
	
	    //---------------------Português-----------------------
	    
			questions[10][0] = "Qual é o sujeito na frase: 'Os alunos estudam para a prova'?";
	    questions[10][1] = "Os alunos";
	    questions[10][2] = "Estudam";
	    questions[10][3] = "Para a prova";
	    questions[10][4] = "Prova";
	
	    questions[11][0] = "Qual das palavras abaixo é um substantivo abstrato?";
	    questions[11][1] = "Mesa";
	    questions[11][2] = "Coragem";
	    questions[11][3] = "Casa";
	    questions[11][4] = "Flor";
	
	    questions[12][0] = "Qual das palavras abaixo está grafada corretamente?";
	    questions[12][1] = "Conserto";
	    questions[12][2] = "Tranzeunte";
	    questions[12][3] = "Propiço";
	    questions[12][4] = "Inxeção";
	
	    questions[13][0] = "A frase 'Ela trouxe o livro para ler' contém:";
	    questions[13][1] = "Uma conjunção coordenativa";
	    questions[13][2] = "Uma preposição";
	    questions[13][3] = "Um verbo no futuro";
	    questions[13][4] = "Um pronome de tratamento";
	
	    questions[14][0] = "Qual é o antônimo de 'feliz'?";
	    questions[14][1] = "Alegre";
	    questions[14][2] = "Contente";
	    questions[14][3] = "Triste";
	    questions[14][4] = "Amargo";
	
	    questions[15][0] = "Identifique a função da palavra 'que' na frase: 'O filme que assistimos foi emocionante'";
	    questions[15][1] = "Pronome relativo";
	    questions[15][2] = "Conjunção";
	    questions[15][3] = "Advérbio";
	    questions[15][4] = "Preposição";
	
	    questions[16][0] = "A oração 'Embora esteja cansado, ele foi trabalhar' é:";
	    questions[16][1] = "Coordenada";
	    questions[16][2] = "Subordinada adverbial concessiva";
	    questions[16][3] = "Subordinada substantiva";
	    questions[16][4] = "Principal";
	
	    questions[17][0] = "Qual palavra da frase 'Os livros na estante são antigos' é um adjetivo?";
	    questions[17][1] = "livros";
	    questions[17][2] = "estante";
	    questions[17][3] = "antigos";
	    questions[17][4] = "são";
	
	    questions[18][0] = "Na palavra 'coração', qual é o tipo de acento utilizado?";
	    questions[18][1] = "Grave";
	    questions[18][2] = "Agudo";
	    questions[18][3] = "Circunflexo";
	    questions[18][4] = "Nenhum";
	
	    questions[19][0] = "Qual alternativa possui uma oração subordinada adjetiva?";
	    questions[19][1] = "Comprei um carro novo";
	    questions[19][2] = "O carro que comprei é novo";
	    questions[19][3] = "Eles saíram cedo para trabalhar";
	    questions[19][4] = "A decisão foi rápida";
	    
	    // ---------------------Answers------------------------
	
	    answers[0][3]  = "32";
	    answers[1][1]  = "2";
	    answers[2][2]  = "25cm²";
	    answers[3][2]  = "12";
	    answers[4][1]  = "Um número que só é divisível por 1 e ele mesmo";
	    answers[5][2]  = "180°";
	    answers[6][3]  = "R$30,00";
	    answers[7][4]  = "6";
	    answers[8][4]  = "-7 e 7";
	    answers[9][2]  = "32cm";
	    // -------------português
	    answers[10][1] = "Os alunos";
	    answers[11][2] = "Coragem";
	    answers[12][1] = "Conserto";
	    answers[13][2] = "Uma preposição";
	    answers[14][3] = "Triste";
	    answers[15][1] = "Pronome relativo";
	    answers[16][2] = "Subordinada adverbial concessiva";
	    answers[17][3] = "antigos";
	    answers[18][4] = "Nenhum";
	    answers[19][2] = "O carro que comprei é novo";
    
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

	public static void main(String[] args) {
		new QuizApp();
	}
}