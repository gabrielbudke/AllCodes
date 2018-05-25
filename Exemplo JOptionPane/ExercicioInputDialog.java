import javax.swing.JOptionPane;

   public class ExercicioInputDialog{

      public static void main(String[] args){

   // Nome Completo
      String nome = JOptionPane.showInputDialog("Digite seu Nome");
      String sobrenome = JOptionPane.showInputDialog("Digite seu Sobrenome");
      String nomeCompleto = nome + sobrenome;
   
   //Idade
      int idade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite sua Idade"));
     
   //Peso   
      double peso = Double.parseDouble(
                JOptionPane.showInputDialog("Digite seu Peso"));

   // Altura
      double altura = Double.parseDouble(
                JOptionPane.showInputDialog("Digite sua Altura"));

   // Bairro
      String bairro = JOptionPane.showInputDialog("Digite seu Bairro");

   // Numero
      String numero = JOptionPane.showInputDialog("Número da Casa");

   // Cidade
      String cidade = JOptionPane.showInputDialog("Cidade");

   // Telefone
      String telefone = JOptionPane.showInputDialog("Telefone");

   // CEP
      String cep = JOptionPane.showInputDialog("CEP");

   // Estado
      String estado = JOptionPane.showInputDialog("Estado");

         JOptionPane.showMessageDialog(null,
                   "Nome Completo: " + nome + " " + sobrenome
                   + "\nIdade: " + idade
                   + "\nPeso: " + peso
                   + "\nAltura: " + altura
                   + "\nBairro: " + bairro
                   + "\nNúmero: " + numero
                   + "\nCidade: " + cidade
                   + "\nTelefone: " + telefone
                   + "\nCEP: " + cep
                   + "\nEstado: " + estado);

                   
 
   }

}
 