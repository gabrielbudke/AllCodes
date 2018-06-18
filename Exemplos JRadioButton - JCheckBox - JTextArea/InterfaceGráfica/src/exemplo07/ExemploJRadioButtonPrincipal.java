package exemplo07;

import java.awt.EventQueue;

/**
 *
 * @author Gabriel
 */
public class ExemploJRadioButtonPrincipal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new ExemploJRadioButton01();
            }
        });
    }
}

