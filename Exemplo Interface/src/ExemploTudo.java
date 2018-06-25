
import exemplo07.ExemploJRadioButton01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Gabriel
 */
public class ExemploTudo implements ExemploBaseTudoInterface {

    private JFrame jFrame;
    private JButton jButton00,
            jButton01,
            jButton02,
            jButton03,
            jButton04,
            jButton05,
            jButton06,
            jButton07,
            jButton08,
            jButton09;

    
    public ExemploTudo(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarlocalizacao();
        acaoButton00();
        
        jFrame.setVisible(true);
    }
    
    
    
    
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButton00);
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);

    }

    @Override
    public void instanciarComponentes() {

        jButton00 = new JButton("Exemplo00");
        jButton01 = new JButton("Exemplo01");
        jButton02 = new JButton("Exemplo02");
        jButton03 = new JButton("Exemplo03");
        jButton04 = new JButton("Exemplo04");
        jButton05 = new JButton("Exemplo05");
        jButton06 = new JButton("Exemplo06");
        jButton07 = new JButton("Exemplo07");
        jButton08 = new JButton("Exemplo08");
        jButton09 = new JButton("Exemplo09");

    }

    @Override
    public void gerarDimensoes() {

        jButton00.setSize(100, 100);

    }

    @Override
    public void gerarlocalizacao() {

        jButton00.setLocation(10, 10);

    }
    
    public void acaoButton00(){
        jButton00.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new ExemploJRadioButton01();
            }
        });
    }
        
    

}
