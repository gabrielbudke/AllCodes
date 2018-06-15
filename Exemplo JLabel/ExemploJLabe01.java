import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;


public class ExemploJLabe01{
	public static void main(String[] args){

	JFrame jFrame = new JFrame("Exemplo JLabel");
	jFrame.setSize(500, 300);
	jFrame.setLayout(null);
	jFrame.setLocationRelativeTo(null);
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel labelNome = new JLabel();
	labelNome.setText("Nome");
	labelNome.setSize(80, 20);
	labelNome.setLocation(50, 50);

	JButton botao = new JButton();
	botao.setText("Alterar");
	botao.setSize(100, 25);
	botao.setLocation(80, 50);

	botao.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			labelNome.setText("troquei");
		}
	})




	jFrame.add(labelNome);
	jFrame.add(botao);

	jFrame.setVisible(true);



	}
	
}