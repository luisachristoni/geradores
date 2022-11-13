package geradores;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class main {
	public static JTextField numberText;
	public static JLabel label2;
	public static JTextField caractersText;

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame("Geradores");
		frame.setSize(380,255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		
		panel.setLayout(null);
		JButton gerarCPF = new JButton("Gerar CPF");
		gerarCPF.setBounds(10, 20, 135, 25);
		panel.add(gerarCPF);
		
		JButton gerarCNPJ = new JButton("Gerar CNPJ");
		gerarCNPJ.setBounds(10, 60, 135, 25);
		panel.add(gerarCNPJ);
		
		JButton gerarnumero = new JButton("Gerar Número");
		gerarnumero.setBounds(10, 100, 135, 25);
		panel.add(gerarnumero);
		
		JButton gerarCaracteres = new JButton("Gerar Caracteres");
		gerarCaracteres.setBounds(10, 140, 135, 25);
		panel.add(gerarCaracteres);
		
		numberText = new JTextField(20);
		numberText.setBounds(180, 100, 135, 25);
		panel.add(numberText);
		
		caractersText = new JTextField(20);
		caractersText.setBounds(180, 140, 135, 25);
		panel.add(caractersText);
		
		JLabel label = new JLabel("Seu gerador:");
		label.setBounds(10, 180, 135, 25);
		panel.add(label);
		
		gerarCPF.addActionListener(new cpf());
		gerarCNPJ.addActionListener(new cnpj());
		gerarnumero.addActionListener(new number());
		gerarCaracteres.addActionListener(new chars());

		label2 = new JLabel("");
		label2.setBounds(180, 180, 185, 25);
		panel.add(label2);
		frame.setVisible(true);
	}
}
