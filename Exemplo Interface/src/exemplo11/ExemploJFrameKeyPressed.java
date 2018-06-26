
package exemplo11;

import com.sun.glass.events.KeyEvent;
import exemplo08.JFrameBaseInterface;
import java.awt.Color;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alunos
 */
public class ExemploJFrameKeyPressed implements JFrameBaseInterface{

    private JFrame jFrame;
    private JTextField jTextFieldNumero;
    
    
    public ExemploJFrameKeyPressed(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarKeyPressed();
    }
    
    
    
    
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jTextFieldNumero);
        
    }

    @Override
    public void instanciarComponentes() {
        jTextFieldNumero = new JTextField();
    
    }

    @Override
    public void gerarLocalizacoes() {
        jTextFieldNumero.setLocation(10,10);
    
    }

    @Override
    public void gerarDimensoes() {
        jTextFieldNumero.setSize(100,20);
    }
    
    private void adicionarKeyPressed(){
        jTextFieldNumero.addKeyListener new KeyListener(){
            
            public void keyTyped(KeyEvent e){
            }
            
            public void keyPressed(KeyEvent e){
                switch(e.getKeyCode()){
                    case KeyEvent.VK_ENTER:
                        JOptionPane.showMessageDialog(null, "VIVA");
                        break;
                    case KeyEvent.VK_UP:
                        JOptionPane.showMessageDialog(null, "CIMA");
                        break;
                    case KeyEvent.VK_DOWN:
                        JOptionPane.showMessageDialog(null, "BAIXO");
                        break;
                    case KeyEvent.VK_RIGHT:
                        JOptionPane.showMessageDialog(null, "DIREITA");
                        break;
                    case KeyEvent.VK_LEFT:
                        JOptionPane.showMessageDialog(null, "ESQUERDA");
                        break;
                    case KeyEvent.VK_F10:
                        jTextFieldNumero.setSelectedTextColor(Color.red); //troca a cor do texto selecionado
                        jTextFieldNumero.setSelectionStart(0); //seleciona onde o cursor deve começar
                        jTextFieldNumero.setSelectionEnd(
                                jTextFieldNumero.getText().length()); 
                        break;
                    case KeyEvent.VK_F11:
                        jTextFieldNumero.setCaretPosition(0); //joga o cursor pro inicio
                        break;
                    case KeyEvent.VK_F12:
                        jTextFieldNumero.setCaretPosition(jTextFieldNumero.getText().length());
                        break;

                        
                        
                }
            }
            
        });
    }
        
    
}
