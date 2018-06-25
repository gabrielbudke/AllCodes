package exemplo09;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class ExemploJTable01 {

    private JFrame jFrame;
    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private JScrollPane jScrollPane;
    
    
    
    public ExemploJTable01(){
        instanciaComponentes();
        gerarTela();
        gerarDimensoes();
        gerarLocalizacao();
        adicionarComponentes();
        configurarTableModel();
        
        jFrame.setVisible(true);
    }
    public void gerarTela(){
        jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void instanciaComponentes(){
        jTable = new JTable();
        Object[] colunas = new Object[]
            {"Nome", "Idade", "Altura"};            
        
        jScrollPane = new JScrollPane(jTable);
        defaultTableModel = new DefaultTableModel(colunas,0){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
           
        
    }
    
    private void configurarTableModel(){
        
        defaultTableModel.addRow(new Object[]{
            "Gustavo", 22, 1.68
        });
        defaultTableModel.addRow(new Object[]{
            "Leonardo", 21, 1.76
        });
        defaultTableModel.addRow(new Object[]{
            "Crispim", 20, 175
        });
     
        jTable.setModel(defaultTableModel);
    }
    
    
    
    public void adicionarComponentes(){
        jFrame.add(jScrollPane);
    }
    
    public void gerarLocalizacao(){
        jScrollPane.setLocation(10,10);
    }
    
    public void gerarDimensoes(){
        jScrollPane.setSize(400,400);
    }
    

    
}
