package exemplo10;

import exemplo08.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Gabriel Budke
 */
public class ExemploHospitalJFrame implements JFrameBaseInterface {

    private int linhaSelecionada = -1;
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
    private DefaultTableModel dtm;

    private ArrayList<Hospital> hospitais = new ArrayList<>();

    public ExemploHospitalJFrame() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurarJComboBox();
        configurarJFormattedTextField();
        configurarJTable();
        acaoBotaoAdicionar();
        acaoEditar();
        acaoExcluir();
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

    private void configurarJComboBox() {

        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("Cardiologia");
        modelo.addElement("Endocrinologia");
        modelo.addElement("Emergência");
        modelo.addElement("Oncologia");
        modelo.addElement("Pronto Socorro");
        modelo.addElement("Reumatologia");
        jComboBoxCategoria.setModel(modelo);
        jComboBoxCategoria.setSelectedIndex(-1);

    }

    private void configurarJFormattedTextField() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##.###.###/####-##");
            maskFormatter.install(jFormattedTextField);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Chame o prog");

        }
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jTextFieldNome.setLocation(10, 35);

        jLabelAno.setLocation(10, 60);
        jTextFieldAno.setLocation(10, 85);

        jLabelCnpj.setLocation(10, 110);
        jFormattedTextField.setLocation(10, 135);

        jLabelCategoria.setLocation(10, 160);
        jComboBoxCategoria.setLocation(10, 185);

        jLabelRendaAnual.setLocation(10, 210);
        jTextFieldRendaAnual.setLocation(10, 235);

        jCheckBoxPrivado.setLocation(10, 260);

        jButtonAdicionar.setLocation(35, 285);
        jButtonEditar.setLocation(265, 10);
        jButtonExcluir.setLocation(370, 10);

        jScrollPane.setLocation(170, 35);

    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(150, 20);
        jTextFieldNome.setSize(150, 20);

        jLabelAno.setSize(150, 20);
        jTextFieldAno.setSize(150, 20);

        jLabelCnpj.setSize(150, 20);
        jFormattedTextField.setSize(150, 20);

        jLabelCategoria.setSize(150, 20);
        jComboBoxCategoria.setSize(150, 20);

        jLabelRendaAnual.setSize(150, 20);
        jTextFieldRendaAnual.setSize(150, 20);

        jCheckBoxPrivado.setSize(150, 20);

        jButtonAdicionar.setSize(100, 20);
        jButtonEditar.setSize(100, 20);
        jButtonExcluir.setSize(100, 20);
        jScrollPane.setSize(400, 400);
    }

    private void configurarJTable() {

        dtm = new DefaultTableModel();
        dtm.addColumn("Nome");
        dtm.addColumn("CNPJ");
        dtm.addColumn("Renda Atual");
        jTable.setModel(dtm);
        ;
    }

    private void acaoBotaoAdicionar() {
        jButtonAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //validaçao do campo nome
                if (jTextFieldNome.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nome deve ser preenchido");
                    jTextFieldNome.requestFocus(); //o requestFocus faz o cursor ir para o campo designado 
                    return;
                }

                if (jTextFieldNome.getText().trim().length() < 3) {
                    JOptionPane.showMessageDialog(null, "Nome deve conter 3 caracteres");
                    jTextFieldNome.requestFocus();
                    return;
                }

                //validação do campo ano
                if (jTextFieldAno.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ano deve ser preenchido");
                    jTextFieldAno.requestFocus();
                    return;
                }

                short ano = 0;
                try {
                    ano = Short.parseShort(jTextFieldAno.getText().trim());
                    if (ano < 1500) {
                        JOptionPane.showMessageDialog(null, "Ano não pode ser menor que 1500");
                        jTextFieldAno.requestFocus();
                        return;
                    }
                    int anoAtual = LocalDate.now().getYear();
                    if (ano > anoAtual) {
                        JOptionPane.showMessageDialog(null, "Ano não deve ser maior que o ano " + anoAtual);
                        jTextFieldAno.requestFocus();
                        return;

                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ano deve conter somente números");
                    jTextFieldAno.requestFocus();
                    return;

                }

                //validação CNPJ
                String cnpj = jFormattedTextField.getText()
                        .replace(".", "")
                        .replace("/", "")
                        .replace("-", "");

                if (cnpj.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "CNPJ deve ser preenchido");
                    jFormattedTextField.requestFocus();
                    return;
                }
                if (cnpj.length() < 14) {
                    JOptionPane.showMessageDialog(null, "CNPJ deve conter 14 digitos");
                    jFormattedTextField.requestFocus();
                    return;
                }

                //validar Combobox
                if (jComboBoxCategoria.getSelectedItem() == null) { 
                    JOptionPane.showMessageDialog(null, "Categoria deve ser selecionada");
                    jComboBoxCategoria.showPopup();
                    return;

                }

                //validar renda Atual
                String rendaAnualTexto = jTextFieldRendaAnual
                        .getText().trim().toUpperCase()
                        .replace("R", "").replace("$", "")
                        .replace(".", "").replace(",", ".")
                        .replace(" ", "");
                if (rendaAnualTexto.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Renda Anual deve ser preenchida");
                    jTextFieldRendaAnual.requestFocus();
                    return;

                }

                double rendaAnual = 0;
                try {
                    rendaAnual = Double.parseDouble(rendaAnualTexto);
                    if (rendaAnual < 0) {
                        JOptionPane.showMessageDialog(null, "Renda Anual deve ser positiva");
                        jTextFieldRendaAnual.requestFocus();
                        return;
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Renda Anual deve conter somente números");
                    jTextFieldRendaAnual.requestFocus();
                    return;
                }

                //ano
                //
                Hospital hospital = new Hospital();
                hospital.setNome(jTextFieldNome.getText());
                hospital.setCnpj(cnpj);
                hospital.setRendaAnual(rendaAnual);
                hospital.setAno(ano);
                hospital.setPrivado(jCheckBoxPrivado.isSelected());
                hospital.setCategoria(jComboBoxCategoria.getSelectedItem().toString());

                if (linhaSelecionada == -1) {
                    hospitais.add(hospital);  //add na ArrayList
                    dtm.addRow(new Object[]{
                        hospital.getNome(),
                        hospital.getCnpj(),
                        hospital.getRendaAnual()
                    });

                } else {
                    hospitais.set(linhaSelecionada, hospital);
                    dtm.setValueAt(hospital.getNome(), linhaSelecionada, 0);
                    dtm.setValueAt(hospital.getCnpj(), linhaSelecionada, 1);
                    dtm.setValueAt(hospital.getRendaAnual(), linhaSelecionada, 2);
                };

                limparCampos();
            }

        });
    }

    private void limparCampos() {
        jTextFieldAno.setText("");
        jTextFieldNome.setText("");
        jTextFieldRendaAnual.setText("");
        jCheckBoxPrivado.setSelected(false);
        jComboBoxCategoria.setSelectedIndex(-1);
        jFormattedTextField.setText("");
        jTextFieldNome.requestFocus();
        linhaSelecionada = -1;

    }

    private void acaoEditar() {
        jButtonEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                linhaSelecionada = jTable.getSelectedRow();
                Hospital hospital = hospitais.get(linhaSelecionada);
                preencherCampos(hospital);
            }

        });

    }

    private void preencherCampos(Hospital hospital) {
        jTextFieldNome.setText(hospital.getNome());
        jTextFieldAno.setText(String.valueOf(hospital.getAno()));
        jTextFieldRendaAnual.setText(String.valueOf(hospital.getRendaAnual()));
        jComboBoxCategoria.setSelectedItem(hospital.getCategoria());
        jCheckBoxPrivado.setSelected(hospital.isPrivado());
        jFormattedTextField.setText(hospital.getCnpj());
    }

    private void acaoExcluir() {
        jButtonExcluir.addActionListener(new ActionListener() {
            public void actionperformed(ActionEvent e) {

                if (jTable.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(null, "Seleciona um registro filho");
                    return;
                }

                int escolha = JOptionPane.showConfirmDialog(null,
                        "Deseja realmente apagar?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (escolha == JOptionPane.YES_OPTION) {
                    linhaSelecionada = jTable.getSelectedRow();
                    dtm.removeRow(linhaSelecionada);
                    hospitais.remove(linhaSelecionada);
                    limparCampos();
                }
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

}
