import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Color;

public class ExemploJButton04{
	public static void main(String[] args){

		JFrame tela = new JFrame("HOVER");
		tela.setSize(500, 500);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton botao = new JButton("Não venha aqui");
		botao.setSize(400, 300);
		botao.setLocation(45, 140);

		//remove borda ao redor do texto
		botao.setFocusPainted(false);

		//remove borda ao redor do botão
		botao.setBorderPainted(false);


		botao.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseEntered(MouseEvent e){
				botao.setBackground(Color.decode("#ffe105"));
			}

			@Override
			public void mouseExited(MouseEvent e){
				botao.setBackground(Color.decode("#23dd3f"));
			}
		});

		tela.add(botao);
		tela.setVisible(true);







	}
}