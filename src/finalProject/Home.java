package Home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.List;
import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class Home extends JFrame {

	private JPanel contentPane;
	public JTextField titulo;
	private JTextField objetivo;
	private JTextField endereco;
	private JTextField dataInicio;
	private JTextField status;
	private JTextField data;
	private JTextField data_1;
	private JTextField hora;
	private JTextField hora_1;
	private JTextArea descricao;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setTitle("Projetos Sociais");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		contentPane.add(tabbedPane);
		
		Panel panelProjeto = new Panel();
		tabbedPane.addTab("Cadastrar Projeto", null, panelProjeto, null);
		panelProjeto.setLayout(null);
		
		titulo = new JTextField();
		titulo.setColumns(10);
		titulo.setBounds(10, 29, 198, 20);
		panelProjeto.add(titulo);
		
		JLabel labeltitulo = new JLabel("T\u00EDtulo");
		labeltitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		labeltitulo.setBounds(10, 14, 37, 14);
		panelProjeto.add(labeltitulo);
		
		JLabel lblNewLabel_1 = new JLabel("Objetivo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(221, 14, 54, 14);
		panelProjeto.add(lblNewLabel_1);
		
		objetivo = new JTextField();
		objetivo.setColumns(10);
		objetivo.setBounds(221, 29, 198, 20);
		panelProjeto.add(objetivo);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 60, 56, 14);
		panelProjeto.add(lblNewLabel_2);
		
		endereco = new JTextField();
		endereco.setColumns(10);
		endereco.setBounds(10, 77, 198, 20);
		panelProjeto.add(endereco);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Inicio");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(221, 60, 92, 14);
		panelProjeto.add(lblNewLabel_3);
		


		dataInicio = new JTextField();
		try{
			javax.swing.text.MaskFormatter date= new javax.swing.text.MaskFormatter("##/##/####");
			dataInicio = new javax.swing.JFormattedTextField(date);
			}
			catch (Exception e){
			}
		dataInicio.setColumns(10);
		dataInicio.setBounds(221, 76, 92, 20);
		panelProjeto.add(dataInicio);
		
		
		JLabel lblNewLabel_4 = new JLabel("Status");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(327, 60, 54, 14);
		panelProjeto.add(lblNewLabel_4);
		
		status = new JTextField();
		status.setColumns(10);
		status.setBounds(327, 77, 92, 20);
		panelProjeto.add(status);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			ArrayList<String> ProjetoSocial = new ArrayList();
			public void actionPerformed(ActionEvent e) {			
				if("".equals(titulo.getText()) || "".equals(objetivo.getText()) || "".equals(endereco.getText()) || 
			            "".equals(dataInicio.getText()) || "".equals(status.getText())){
			        JOptionPane.showMessageDialog(null,"Preencha todos os campos!","Alert",JOptionPane.WARNING_MESSAGE);     
				}else				
				try {
					BufferedWriter escrever = new BufferedWriter(new FileWriter(titulo.getText(),true));
				ProjetoSocial.add("Titulo do projeto: "+titulo.getText()+" \r\nObjetivo: "+objetivo.getText()+" \r\nEndereço: "+endereco.getText()+" \r\nData de inicio: "+dataInicio.getText()+" \r\nStatus: "+status.getText());
	            escrever.append(ProjetoSocial.toString());
				escrever.close();
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				tabbedPane.setSelectedIndex(1);				
				}				
				catch (IOException e1) {
				e1.printStackTrace();				
				}				
				}			
		}
		);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(163, 149, 102, 30);
		panelProjeto.add(btnNewButton);
		
		Panel panelAgenda = new Panel();
		tabbedPane.addTab("Cadastrar Agenda", null, panelAgenda, null);
		panelAgenda.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Data");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(23, 14, 46, 14);
		panelAgenda.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(23, 106, 70, 14);
		panelAgenda.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Hora");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(23, 60, 46, 14);
		panelAgenda.add(lblNewLabel_7);
		
		data = new JTextField();
		try{
			javax.swing.text.MaskFormatter data1= new javax.swing.text.MaskFormatter("##/##/####");
			data_1 = new javax.swing.JFormattedTextField(data1);
			}
			catch (Exception e){
			}
		data_1.setBounds(23, 29, 70, 20);
		panelAgenda.add(data_1);
		data_1.setColumns(10);
		
		hora = new JTextField();
		try{
			javax.swing.text.MaskFormatter hour= new javax.swing.text.MaskFormatter("##:##");
			hora_1 = new javax.swing.JFormattedTextField(hour);
			hora_1.setHorizontalAlignment(SwingConstants.CENTER);
			}
			catch (Exception e){
			}
		hora_1.setBounds(23, 75, 37, 20);
	//	hora.setBounds(23, 75, 46, 20);
		panelAgenda.add(hora_1);
		hora_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(265, 32, 57, 14);
		panelAgenda.add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Em execu\u00E7\u00E3o", "Paralisado", "Executado"}));
		
		comboBox.setBounds(184, 56, 214, 22);
		panelAgenda.add(comboBox);
		
		JTextArea descricao = new JTextArea();
		descricao.setWrapStyleWord(true);
		descricao.setLineWrap(true);
		descricao.setBounds(23, 137, 230, 85);
		panelAgenda.add(descricao);

		
		JButton buttonSalvar = new JButton("Salvar");
		buttonSalvar.addActionListener(new ActionListener() {
			ArrayList<String> Agendas = new ArrayList();
			public void actionPerformed(ActionEvent e) {
				if("".equals(data_1.getText()) || "".equals(hora_1.getText()) || "".equals(descricao.getText())){
					 JOptionPane.showMessageDialog(null,"Preencha todos os campos!","Alert",JOptionPane.WARNING_MESSAGE);
				}else
				try {
					BufferedWriter escrever = new BufferedWriter(new FileWriter(titulo.getText(),true));
				
				Agendas.add("===============AGENDA DO PROJETO=============== \r\nData: "+data_1.getText()+" \r\nHora: "+hora_1.getText()+" \r\nDescrição: "+descricao.getText()+" \r\nSituação: "+comboBox.getSelectedItem());
				escrever.append(Agendas.toString());
				escrever.close();
				JOptionPane.showMessageDialog(null, "Agenda salva com sucesso!");
				
				// deixando em branco todos os campos
				titulo.setText("");
				objetivo.setText("");
				endereco.setText("");
				dataInicio.setText("");
				status.setText("");
				comboBox.removeAllItems();
				data_1.setText("");
				hora_1.setText("");
				descricao.setText("");
				
				}catch (IOException e1) {
					e1.printStackTrace();
					
				
				}
				
			}
			}
		);
		buttonSalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonSalvar.setBounds(332, 161, 89, 23);
		panelAgenda.add(buttonSalvar);
		
		
		
	
		
		Panel panelCarregar = new Panel();
		tabbedPane.addTab("Carregar Arquivo", null, panelCarregar, null);
		panelCarregar.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(10, 35, 409, 187);
		panelCarregar.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Pesquisar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
                
	              int res = fc.showOpenDialog(null);
	                     
	              if(res == JFileChooser.APPROVE_OPTION){
	                 File arquivo = fc.getSelectedFile();
	                 textArea.setText("");
	                  
	                 try {
	                    BufferedReader in = new BufferedReader(new FileReader(arquivo));
	                    String str, texto = "";
	                    while((str = in.readLine()) != null){
	                        texto += str;
	                    }
	                    textArea.setText("\r\n"+texto);
	                    in.close();
	                 } 
	                 catch (IOException ioe){
	                    // possiveis erros são tratatos aqui
	                 }
	              }
			}
		});
		btnNewButton_1.setBounds(213, 8, 97, 23);
		panelCarregar.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Selecione o seu arquivo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 159, 14);
		panelCarregar.add(lblNewLabel);
		
		
	}
}