import javax.swing.JOptionPane;

public class ExemploJOptionPane{


   public static void main(String[] args){
 
      String nome = "Aula de Java";
      String professor = "Francisco";
      String texto = "Curso: " + nome + "\nProfesor: " 
                       + professor;
      

      JOptionPane.showMessageDialog(null, "Olá Mundo");
      JOptionPane.showMessageDialog(null, texto);

  );

   }

}