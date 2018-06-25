package exemplo10;

import exemplo08.JFrameBaseInterface;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Gabriel Budke
 */
public class ExemploHospitalJFrame implements JFrameBaseInterface {

    private JFrame jFrame;
    private JTextField jTextFieldNome;
    private JFormattedTextField jFormattedTextField;
    private JComboBox jComboBoxCategoria;
    private JCheckBox jCheckBoxPrivado;
    private JTextField jTextFieldRendaAnual, jTextFieldAno;
    private JLabel jLabelAno, jLabelNome, jLabelRendaAnual,
            jLabelCategoria, jLabelCnpj;
    private JButton jButtonEditar, jButtonAdicionar, jButtonExcluir;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public ExemploHospitalJFrame() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurarJComboBox();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Hospital para o seu momento");
        jFrame.setSize(600, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jTextFieldAno);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldRendaAnual);
        jFrame.add(jComboBoxCategoria);
        jFrame.add(jCheckBoxPrivado);
        jFrame.add(jLabelAno);
        jFrame.add(jLabelCategoria);
        jFrame.add(jLabelRendaAnual);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelCnpj);
        jFrame.add(jButtonAdicionar);
        jFrame.add(jButtonEditar);
        jFrame.add(jButtonExcluir);
        jFrame.add(jFormattedTextField);
        jFrame.add(jScrollPane);
        

    }

    @Override
    public void instanciarComponentes() {
        
        jTable = new JTable();
        configurarJTable();
        jScrollPane = new JScrollPane(jTable);

        jLabelAno = new JLabel("Ano");
        jLabelCategoria = new JLabel("Categoria");
        jLabelRendaAnual = new JLabel("Renda Anual");
        jLabelCnpj = new JLabel("CNPJ");
        jLabelNome = new JLabel("Nome");
        jTextFieldNome = new JTextField();
        jTextFieldAno = new JTextField();
        jTextFieldRendaAnual = new JTextField();
        jCheckBoxPrivado = new JCheckBox("Privado");
        jComboBoxCategoria = new JComboBox();
        jFormattedTextField = new JFormattedTextField();
        jButtonAdicionar = new JButton("Adicionar");
        jButtonEditar = new JButton("Editar");
        jButtonExcluir = new JButton("Excluir");
        configurarJComboBox();
    }
    
    private void configurarJComboBox(){
       
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("Cardiologia");
        modelo.addElement("Endocrinologia");
        modelo.addElement("Emergência");
        modelo.addElement("Oncologia");
        modelo.addElement("Pronto Socorro");
        modelo.addElement("Reumatologia");
        jComboBoxCategoria.setModel(modelo);
        
        
    }
    
    private void configurarJFormattedTextField(){
        try{
        MaskFormatter maskFormatter = new 
            MaskFormatter("##.###.###/####-##");
        maskFormatter.install(jFormattedTextField);
            
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Chame o prog");
        
    }
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10,10);
        jTextFieldNome.setLocation(10,35);
        
        jLabelAno.setLocation(10,60);
        jTextFieldAno.setLocation(10,85);
                
        jLabelCnpj.setLocation(10,110);
        jFormattedTextField.setLocation(10,135);
        
        jLabelCategoria.setLocation(10,160);
        jComboBoxCategoria.setLocation(10,185);
        
        jLabelRendaAnual.setLocation(10,210);
        jTextFieldRendaAnual.setLocation(10,235);
        
        jCheckBoxPrivado.setLocation(10,260);
        
        jButtonAdicionar.setLocation(10,285);
        jButtonEditar.setLocation(150,20);
        jButtonAdicionar.setLocation(150,20);
 
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(150,20);
        jTextFieldNome.setSize(150,20);
        
        jLabelAno.setSize(150,20);
        jTextFieldAno.setSize(150,20);
                
        jLabelCnpj.setSize(150,20);
        jFormattedTextField.setSize(150,20);
        
        jLabelCategoria.setSize(150,20);
        jComboBoxCategoria.setSize(150,20);
        
        jLabelRendaAnual.setSize(150,20);
        jTextFieldRendaAnual.setSize(150,20);
        
        jCheckBoxPrivado.setSize(150,20);
        
        jButtonAdicionar.setSize(150,20);
        jButtonEditar.setSize(150,20);
        jButtonAdicionar.setSize(150,20);
        
    }

}
