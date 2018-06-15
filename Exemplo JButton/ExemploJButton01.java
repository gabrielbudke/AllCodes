import javax.swing.JFrame;
import javax.swing.JButton;


public class ExemploJButton01{
	public static void main(String[] args){

		JFrame tela = new JFrame("Meu primeiro botão");
		tela.setSize(300,400);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton botao01 = new JButton();
		botao01.setText("Não clique aqui!");
		botao01.setSize(200,20);
		botao01.setLocation(10,20);
		tela.add(botao01);

		tela.setVisible(true);


	}
}