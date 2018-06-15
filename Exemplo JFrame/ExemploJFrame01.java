import javax.swing.JFrame;
import java.awt.Color;

public class ExemploJFrame01{
	public static void main(String[] args){

		// criar uma tela
		JFrame tela = new JFrame();

		// define o tamanho da janela
		//         width↔,height↕
		tela.setSize(500,500);
		
		// diz que o layout é nulo
		tela.setLayout(null);
		
		// passando nulo ele centraliza a janela
		tela.setLocationRelativeTo(null);
		
		// diz que quando o usuario fechar a aplicação
		// irá encerrar o aplicativo
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//define o titulo da janela
		tela.setTitle("HELLO WORLD");

		//import java.awt.Color;
		tela.getContentPane().setBackground(Color.red);

		//apresenta cor com exdecimal
		tela.getContentPane().setBackground(Color.decode("4277f4"));

		//apresenta a janela
		tela.show();










	}
}