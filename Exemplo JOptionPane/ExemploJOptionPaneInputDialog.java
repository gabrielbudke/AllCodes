import javax.swing.JOptionPane;

public class ExemploJOptionPaneInputDialog{	


   public static void main(String[] args){
      //Permitir o usuário digitar seu nome
      String nome = JOptionPane.showInputDialog("Nome");
      String sobrenome = JOptionPane.showInputDialog("Sobrenome");
      String nomeCompleto = nome + " " + sobrenome;
      JOptionPane.showMessageDialog(null, 
                "Nome Completo: " + nomeCompleto);

      int idade = Integer.parseInt(
                JOptionPane.showInputDialog("Idade");
      
      JOptionPane.showMessageDialog(null,
                  "Nome Completo: " + nomeCompleto
                  + "\n Idade: " + idade);


   }
}