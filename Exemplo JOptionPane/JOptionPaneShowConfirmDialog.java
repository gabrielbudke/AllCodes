import javax.swing.JOptionPane;

public class JOptionPaneShowConfirmDialog{

    public static void main(String[] args){

      int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar", "Aviso", 
      JOptionPane.YES_NO_OPTION);

      if (opcao == JOptionPane.OK_OPTION){
          JOptionPane.showMessageDialog(null, "Registrado com Sucesso");

      }else if ( opcao == JOptionPane.NO_OPTION){
          JOptionPane.showMessageDialog(null, "Opção Invalidada");

      }else if (opcao == JOptionPane.CANCEL_OPTION){
          JOptionPane.showMessageDialog(null, "Cancelado com Sucesso");

      }else{
          JOptionPane.showMessageDialog(null, "Fechado com Sucesso");
      }



    }

}
    


