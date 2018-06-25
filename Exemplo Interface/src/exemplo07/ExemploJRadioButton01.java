package exemplo07;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

/**
 *
 * @author Alunos
 */
public class ExemploJRadioButton01 {
    private JFrame jFrame;
    private JLabel jLabelCor;
    private JRadioButton
            jRadioButtonCorPreto,
            jRadioButtonCorBranco,
            jRadioButtonCorFushia,
            jRadioButtonCorRose;
    private ButtonGroup buttonGroupCor;
    private JButton jButtonSalvar, jButtonLimparSelecao;
    
    
    
    public ExemploJRadioButton01(){
    gerarTela();
    instanciarComponentes();
    gerarDimensoes();
    gerarLocalicoes();
    adicionarComponentes();
    adicionarAcao();
    definirRadioParaButtonGroup();
    estilizarRadioButton();
    jFrame.setVisible(true);
        
}

    private void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    private void instanciarComponentes() {
        jLabelCor = new JLabel("COR");
        jRadioButtonCorBranco = new JRadioButton();
        jRadioButtonCorBranco.setText("Branco");
        jRadioButtonCorFushia = new JRadioButton();
        jRadioButtonCorFushia.setText("Fushia");
        jRadioButtonCorPreto = new JRadioButton("Preto");
        jRadioButtonCorRose = new JRadioButton("Rose");
        buttonGroupCor = new ButtonGroup();
        jButtonSalvar = new JButton("Salvar");
        jButtonLimparSelecao = new JButton("Limpar");
        
        
    }
    
    private void definirRadioParaButtonGroup(){
        buttonGroupCor.add(jRadioButtonCorRose);
        buttonGroupCor.add(jRadioButtonCorPreto);
        buttonGroupCor.add(jRadioButtonCorBranco);
        buttonGroupCor.add(jRadioButtonCorFushia);
    }

    private void gerarDimensoes() {
        jLabelCor.setSize(40,20);
        jRadioButtonCorRose.setSize(100,20);
        jRadioButtonCorPreto.setSize(100,20);
        jRadioButtonCorFushia.setSize(100,20);
        jRadioButtonCorBranco.setSize(100,20);
        jButtonSalvar.setSize(120,20);
        jButtonLimparSelecao.setSize(120,20);
    }

    private void gerarLocalicoes() {
        jLabelCor.setLocation(10,10);
        jRadioButtonCorRose.setLocation(10,35);
        jRadioButtonCorPreto.setLocation(10,60);
        jRadioButtonCorFushia.setLocation(10,95);
        jRadioButtonCorBranco.setLocation(10,130);
        jButtonLimparSelecao.setLocation(10,160);
        jButtonSalvar.setLocation(135, 160);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelCor);
        jFrame.add(jRadioButtonCorBranco);
        jFrame.add(jRadioButtonCorFushia);
        jFrame.add(jRadioButtonCorPreto);
        jFrame.add(jRadioButtonCorRose);
        jFrame.add(jButtonLimparSelecao);
        jFrame.add(jButtonSalvar);
    }
    
    private void adicionarAcao(){
        jButtonLimparSelecao.addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                buttonGroupCor.clearSelection();
                definirCorDeTexto("#000000");
                jFrame.getContentPane().setBackground(
                        UIManager.getColor("Frame.background"));
            }
        });
        
        jButtonSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            if(jRadioButtonCorBranco.isSelected()){
                jFrame.getContentPane().setBackground(Color.WHITE);
                definirCorDeTexto("#000000");
            }else if(jRadioButtonCorFushia.isSelected()){
                jFrame.getContentPane().setBackground(Color.decode("#FF00FF"));
                definirCorDeTexto("#000000");
            }else if(jRadioButtonCorPreto.isSelected()){
                jFrame.getContentPane().setBackground(Color.decode("#000000"));
                definirCorDeTexto("#FFFFFF");
            }else if(jRadioButtonCorRose.isSelected()){
                jFrame.getContentPane().setBackground(Color.decode("#FF009D"));
                definirCorDeTexto("#000000");
            }
            }
        });
    }
    
    private void definirCorDeTexto(String cor){
        jRadioButtonCorBranco.setForeground(Color.decode(cor));
        jRadioButtonCorFushia.setForeground(Color.decode(cor));
        jRadioButtonCorPreto.setForeground(Color.decode(cor));
        jRadioButtonCorRose.setForeground(Color.decode(cor));
        
    }
       
    private void estilizarRadioButton(){
        jRadioButtonCorBranco.setContentAreaFilled(false);
        jRadioButtonCorFushia.setContentAreaFilled(false);
        jRadioButtonCorPreto.setContentAreaFilled(false);
        jRadioButtonCorRose.setContentAreaFilled(false);
        
    }
    
}
