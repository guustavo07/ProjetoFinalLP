/*Integrantes do grupo: Gustavo, Eugenio, Pedro, Hiann.*/
package finalProject;

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
	private JTextField dataInicio_1;
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
		setBounds(100, 100, 560, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 544, 437);
		contentPane.add(tabbedPane);
		
		Panel panelProjeto = new Panel();
		tabbedPane.addTab("Cadastrar Projeto", null, panelProjeto, null);
		panelProjeto.setLayout(null);
		
		
		Panel panelAgenda = new Panel();
		tabbedPane.addTab("Cadastrar Agenda", null, panelAgenda, null);
		panelAgenda.setLayout(null);
		tabbedPane.setEnabledAt(1, false);
		
		Panel panelCarregar = new Panel();
		tabbedPane.addTab("Carregar Arquivo", null, panelCarregar, null);
		panelCarregar.setLayout(null);
		
		titulo = new JTextField();
		titulo.setColumns(10);
		titulo.setBounds(10, 48, 504, 20);
		panelProjeto.add(titulo);
		
		JLabel labeltitulo = new JLabel("T\u00EDtulo");
		labeltitulo.setFont(new Font("Tahoma", Font.BOLD, 13));
		labeltitulo.setBounds(10, 23, 56, 14);
		panelProjeto.add(labeltitulo);
		
		JLabel lblNewLabel_1 = new JLabel("Objetivo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 79, 62, 14);
		panelProjeto.add(lblNewLabel_1);
		
		objetivo = new JTextField();
		objetivo.setColumns(10);
		objetivo.setBounds(10, 104, 504, 20);
		panelProjeto.add(objetivo);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 135, 62, 14);
		panelProjeto.add(lblNewLabel_2);
		
		endereco = new JTextField();
		endereco.setColumns(10);
		endereco.setBounds(10, 160, 504, 20);
		panelProjeto.add(endereco);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Inicio");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 191, 92, 14);
		panelProjeto.add(lblNewLabel_3);
		


		dataInicio = new JTextField();
		try{
			javax.swing.text.MaskFormatter date= new javax.swing.text.MaskFormatter("##/##/####");
			dataInicio_1 = new javax.swing.JFormattedTextField(date);
			dataInicio_1.setHorizontalAlignment(SwingConstants.CENTER);
			}
			catch (Exception e){
			}
		dataInicio_1.setColumns(10);
		dataInicio_1.setBounds(10, 207, 92, 20);
		panelProjeto.add(dataInicio_1);
		
		
		JLabel lblNewLabel_4 = new JLabel("Status");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(445, 191, 54, 14);
		panelProjeto.add(lblNewLabel_4);
		
		status = new JTextField();
		status.setColumns(10);
		status.setBounds(422, 208, 92, 20);
		panelProjeto.add(status);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			ArrayList<String> ProjetoSocial = new ArrayList();
			public void actionPerformed(ActionEvent e) {			
				if("".equals(titulo.getText()) || "".equals(objetivo.getText()) || "".equals(endereco.getText()) || 
			            "".equals(dataInicio_1.getText()) || "".equals(status.getText())){
			        JOptionPane.showMessageDialog(null,"Preencha todos os campos!","Alert",JOptionPane.WARNING_MESSAGE);     
				}else				
				try {
					BufferedWriter escrever = new BufferedWriter(new FileWriter(titulo.getText(),true));
				ProjetoSocial.add("===========================PROJETO SOCIAL================================ "+
									"\n\r===============Nome:"+titulo.getText()+
							   "                                                                                           "+
									" \n\r===============Objetivo: "+objetivo.getText()+
							   "                                                                          "+
									" \n\r===============Endereço: "+endereco.getText()+
							   "                                                                                "+
									" \n\r===============Data de inicio: "+dataInicio_1.getText()+
							   "                                                                                      "+
									" \n\r===============Status: "+status.getText()+" "+"\n\r");
	            escrever.append(ProjetoSocial.toString().replaceAll("\\[|\\]", "").replaceAll(", ",", "));
				escrever.close();
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				tabbedPane.setEnabledAt(1, true);
				tabbedPane.setSelectedIndex(1);
				tabbedPane.setEnabledAt(0, false);
				
				}				
				catch (IOException e1) {
				e1.printStackTrace();				
				}				
				}			
		}
		);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(221, 318, 102, 30);
		panelProjeto.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Data");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(23, 82, 46, 14);
		panelAgenda.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(23, 194, 70, 14);
		panelAgenda.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Hora");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(23, 138, 46, 14);
		panelAgenda.add(lblNewLabel_7);
		
		data = new JTextField();
		try{
			javax.swing.text.MaskFormatter data1= new javax.swing.text.MaskFormatter("##/##/####");
			data_1 = new javax.swing.JFormattedTextField(data1);
			data_1.setHorizontalAlignment(SwingConstants.CENTER);
			}
			catch (Exception e){
			}
		data_1.setBounds(23, 107, 70, 20);
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
		hora_1.setBounds(23, 163, 46, 20);
		panelAgenda.add(hora_1);
		hora_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(23, 24, 57, 14);
		panelAgenda.add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Em execu\u00E7\u00E3o", "Paralisado", "Executado"}));
		
		comboBox.setBounds(23, 49, 214, 22);
		panelAgenda.add(comboBox);
		
		JTextArea descricao = new JTextArea();
		descricao.setWrapStyleWord(true);
		descricao.setLineWrap(true);
		descricao.setBounds(23, 219, 396, 179);
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
				
				Agendas.add("\n\r=========================================================================="+"\n\r==========================AGENDA DO PROJETO============================== "+
																		" \n\r===============Data: "+data_1.getText()+
																		"                                                                                                           "+
																		" \n\r===============Hora: "+hora_1.getText()+
																		"                                                                                                                     "+
																		" \n\r===============Situação: "+comboBox.getSelectedItem()+
																		"                                                                                                       "+
																		" \n\r===============Descrição: "+descricao.getText());
				escrever.append(Agendas.toString().replaceAll("\\[|\\]", "").replaceAll(", ",", "));

				
				JOptionPane.showMessageDialog(null, "Agenda salva com sucesso!");
				String option = JOptionPane.showInputDialog("Deseja cadastrar outra agenda? \n1-Sim 2-Não");
				if(option.equals("1")){
					comboBox.setSelectedIndex(0);
					data_1.setText("");
					hora_1.setText("");
					descricao.setText("");
					
				}else
				escrever.close();
				// deixando em branco todos os campos
				comboBox.setSelectedIndex(0);
				data_1.setText("");
				hora_1.setText("");
				descricao.setText("");
				
				}catch (IOException e1) {
					e1.printStackTrace();
					
				
				}
				
			}
			}
		);
		buttonSalvar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonSalvar.setBounds(429, 279, 100, 23);
		panelAgenda.add(buttonSalvar);
		
		JButton btnNewButton_2 = new JButton("Novo Projeto");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setEnabledAt(0, true);
				titulo.setText("");
				objetivo.setText("");
				endereco.setText("");
				dataInicio_1.setText("");
				status.setText("");
				tabbedPane.setSelectedIndex(0);
				tabbedPane.setEnabledAt(1, false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.setBounds(429, 313, 100, 23);
		panelAgenda.add(btnNewButton_2);
		
		
		
	
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 542, 410);
		panelCarregar.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecionar Arquivo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 30, 151, 14);
		panel.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(10, 64, 522, 335);
		panel.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Carregar");
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
	                    textArea.setText(" \n\r"+texto);
	                    in.close();
	                 } 
	                 catch (IOException ioe){
	                    // possiveis erros são tratatos aqui
	                 }
	              }
			}
			
		});
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(215, 27, 89, 23);
		panel.add(btnNewButton_1);
		
		
		
		
	}
}
