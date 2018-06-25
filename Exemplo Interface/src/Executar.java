
import java.awt.EventQueue;

/**
 *
 * @author Gabriel
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          EventQueue.invokeLater(new Runnable (){
        @Override
        public void run (){
            new ExemploTudo();
            }
        });
    }
    
}
