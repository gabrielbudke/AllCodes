package exemplo08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */

public class ExemploJCheckBox01  implements JFrameBaseInterface{
    
   
    private JFrame jFrame;
    private JCheckBox jCheckBoxEuAcheiOsTermos,
            jCheckBoxEuLiOsTermos;
    private JButton jButtonSalvar, jButtonLimpar;
    
    
    
    
    public ExemploJCheckBox01(){
        instanciarComponentes();
        gerarTela();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoLimpar();
        acaoBotaoSalvar();
        
        jFrame.setVisible(true);
        
        
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButtonLimpar);
        jFrame.add(jButtonSalvar);
        jFrame.add(jCheckBoxEuAcheiOsTermos);
        jFrame.add(jCheckBoxEuLiOsTermos);
    }

    @Override
    public void instanciarComponentes() {
        jButtonLimpar = new JButton("Limpar");
        jButtonSalvar = new JButton("Salvar");
        jCheckBoxEuAcheiOsTermos = new JCheckBox("Eu aceito os termos");
        jCheckBoxEuLiOsTermos = new JCheckBox("Eu li os termos");
    }

    @Override
    public void gerarLocalizacoes() {
        jButtonLimpar.setLocation(10, 60);
        jButtonSalvar.setLocation(115, 60);
        jCheckBoxEuAcheiOsTermos.setLocation(10, 10);
        jCheckBoxEuLiOsTermos.setLocation(10, 35);
    
    }

    @Override
    public void gerarDimensoes() {
        jButtonLimpar.setSize(100,20);
        jButtonSalvar.setSize(100, 20);
        jCheckBoxEuAcheiOsTermos.setSize(250, 20);
        jCheckBoxEuLiOsTermos.setSize(250, 20);
    
    
    }
    
    public void acaoBotaoLimpar(){
        jButtonLimpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jCheckBoxEuLiOsTermos.setSelected(false);
                jCheckBoxEuAcheiOsTermos.setSelected(false);
            }
        });
    }
    
    public void acaoBotaoSalvar(){
        jButtonSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(!jCheckBoxEuLiOsTermos.isSelected()){
                    JOptionPane.showMessageDialog(null, "Leia os termos");
                    return;
                }
                
                JOptionPane.showMessageDialog(null, "Você acaba de vender livros");
            }
        });
    }
        
    
}
