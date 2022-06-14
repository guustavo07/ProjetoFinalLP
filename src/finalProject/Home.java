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
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.List;
import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JTextArea;

public class Home extends JFrame {

	private JPanel contentPane;
	public JTextField titulo;
	private JTextField objetivo;
	private JTextField endereco;
	private JTextField dataInicio;
	private JTextField status;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
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
		
		Panel panel = new Panel();
		tabbedPane.addTab("Cadastrar Projeto", null, panel, null);
		panel.setLayout(null);
		
		titulo = new JTextField();
		titulo.setColumns(10);
		titulo.setBounds(10, 29, 198, 20);
		panel.add(titulo);
		
		JLabel labeltitulo = new JLabel("T\u00EDtulo");
		labeltitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		labeltitulo.setBounds(10, 14, 37, 14);
		panel.add(labeltitulo);
		
		JLabel lblNewLabel_1 = new JLabel("Objetivo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(221, 14, 54, 14);
		panel.add(lblNewLabel_1);
		
		objetivo = new JTextField();
		objetivo.setColumns(10);
		objetivo.setBounds(221, 29, 198, 20);
		panel.add(objetivo);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 60, 56, 14);
		panel.add(lblNewLabel_2);
		
		endereco = new JTextField();
		endereco.setColumns(10);
		endereco.setBounds(10, 77, 198, 20);
		panel.add(endereco);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Inicio");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(221, 60, 92, 14);
		panel.add(lblNewLabel_3);
		
		dataInicio = new JTextField();
		dataInicio.setColumns(10);
		dataInicio.setBounds(221, 76, 92, 20);
		panel.add(dataInicio);
		
		JLabel lblNewLabel_4 = new JLabel("Status");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(327, 60, 54, 14);
		panel.add(lblNewLabel_4);
		
		status = new JTextField();
		status.setColumns(10);
		status.setBounds(327, 77, 92, 20);
		panel.add(status);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			ArrayList<String> ProjetoSocial = new ArrayList();
			public void actionPerformed(ActionEvent e) {
				titulo.getText();
				try {
					BufferedWriter escrever = new BufferedWriter(new FileWriter(titulo.getText()));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				objetivo.getText();
				endereco.getText();
				dataInicio.getText();
				status.getText();
				ProjetoSocial.add("Titulo do projeto: "+titulo+" \nObjetivo: "+objetivo+" \nEndereço: "+endereco+" \nData de inicio: "+dataInicio+"\nStatus"+status);
	            Writer escrever = null;
				try {
					escrever.append(ProjetoSocial.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	     		 try {
					escrever.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(163, 149, 102, 30);
		panel.add(btnNewButton);
		
		Panel panel_1 = new Panel();
		tabbedPane.addTab("Cadastrar Agenda", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Data");
		lblNewLabel_5.setBounds(23, 25, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_6.setBounds(23, 81, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Hora");
		lblNewLabel_7.setBounds(23, 50, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(54, 22, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(54, 50, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(75, 78, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		Panel panel_2 = new Panel();
		tabbedPane.addTab("Carregar Arquivo", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(33, 42, 367, 166);
		panel_2.add(textArea);
		
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
	                    textArea.setText(texto);
	                    in.close();
	                 } 
	                 catch (IOException ioe){
	                    // possiveis erros são tratatos aqui
	                 }
	              }
			}
		});
		btnNewButton_1.setBounds(213, 8, 97, 23);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Selecione o seu arquivo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(33, 11, 159, 14);
		panel_2.add(lblNewLabel);
		
		
	}
}
