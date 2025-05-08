package calculadora;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InterfaceCalc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCalc frame = new InterfaceCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	 
	
	// Criação da interface gráfica
	public InterfaceCalc() {
		
		// Configuração da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 533);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 216, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Botões
		
		JButton C = new JButton("C");
		C.setFont(new Font("Arial", Font.PLAIN, 30));
		C.setBackground(new Color(192, 192, 192));
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		C.setBounds(10, 115, 82, 65);
		contentPane.add(C);
		
		JButton parenteses = new JButton("()");
		parenteses.setFont(new Font("Arial", Font.PLAIN, 30));
		parenteses.setBackground(new Color(192, 192, 192));
		parenteses.setBounds(102, 115, 82, 65);
		contentPane.add(parenteses);
		
		JButton excluir = new JButton("<html>&#9003<html>");
		excluir.setFont(new Font("Arial", Font.PLAIN, 30));
		excluir.setBackground(new Color(192, 192, 192));
		excluir.setBounds(192, 115, 82, 65);
		contentPane.add(excluir);
		
		JButton divisao = new JButton("÷");
		divisao.setFont(new Font("Arial", Font.PLAIN, 30));
		divisao.setBackground(new Color(192, 192, 192));
		divisao.setBounds(284, 115, 82, 65);
		contentPane.add(divisao);
		
		JButton sete = new JButton("7");
		sete.setFont(new Font("Arial", Font.PLAIN, 30));
		sete.setBackground(new Color(192, 192, 192));
		sete.setBounds(10, 191, 82, 65);
		contentPane.add(sete);
		
		JButton oito = new JButton("8");
		oito.setFont(new Font("Arial", Font.PLAIN, 30));
		oito.setBackground(new Color(192, 192, 192));
		oito.setBounds(102, 191, 82, 65);
		contentPane.add(oito);
		
		JButton nove = new JButton("9");
		nove.setFont(new Font("Arial", Font.PLAIN, 30));
		nove.setBackground(new Color(192, 192, 192));
		nove.setBounds(192, 191, 82, 65);
		contentPane.add(nove);
		
		JButton multiplicacao = new JButton("×");
		multiplicacao.setFont(new Font("Arial", Font.PLAIN, 30));
		multiplicacao.setBackground(new Color(192, 192, 192));
		multiplicacao.setBounds(284, 191, 82, 65);
		contentPane.add(multiplicacao);
		
		JButton quatro = new JButton("4");
		quatro.setFont(new Font("Arial", Font.PLAIN, 30));
		quatro.setBackground(new Color(192, 192, 192));
		quatro.setBounds(10, 267, 82, 65);
		contentPane.add(quatro);
		
		JButton cinco = new JButton("5");
		cinco.setFont(new Font("Arial", Font.PLAIN, 30));
		cinco.setBackground(new Color(192, 192, 192));
		cinco.setBounds(102, 267, 82, 65);
		contentPane.add(cinco);
		
		JButton seis = new JButton("6");
		seis.setFont(new Font("Arial", Font.PLAIN, 30));
		seis.setBackground(new Color(192, 192, 192));
		seis.setBounds(192, 267, 82, 65);
		contentPane.add(seis);
		
		JButton subtracao = new JButton("-");
		subtracao.setFont(new Font("Arial", Font.PLAIN, 30));
		subtracao.setBackground(new Color(192, 192, 192));
		subtracao.setBounds(284, 267, 82, 65);
		contentPane.add(subtracao);
		
		JButton um = new JButton("1");
		um.setFont(new Font("Arial", Font.PLAIN, 30));
		um.setBackground(new Color(192, 192, 192));
		um.setBounds(10, 343, 82, 65);
		contentPane.add(um);
		
		JButton dois = new JButton("2");
		dois.setFont(new Font("Arial", Font.PLAIN, 30));
		dois.setBackground(new Color(192, 192, 192));
		dois.setBounds(102, 343, 82, 65);
		contentPane.add(dois);
		
		JButton tres = new JButton("3");
		tres.setFont(new Font("Arial", Font.PLAIN, 30));
		tres.setBackground(new Color(192, 192, 192));
		tres.setBounds(192, 343, 82, 65);
		contentPane.add(tres);
		
		JButton soma = new JButton("+");
		soma.setFont(new Font("Arial", Font.PLAIN, 30));
		soma.setBackground(new Color(192, 192, 192));
		soma.setBounds(284, 343, 82, 65);
		contentPane.add(soma);
		
		JButton potenciacao = new JButton("<html>x<sup>y</sup></html>");
		potenciacao.setFont(new Font("Arial", Font.PLAIN, 30));
		potenciacao.setBackground(new Color(192, 192, 192));
		potenciacao.setBounds(10, 418, 82, 65);
		contentPane.add(potenciacao);
		
		JButton zero = new JButton("0");
		zero.setFont(new Font("Arial", Font.PLAIN, 30));
		zero.setBackground(new Color(192, 192, 192));
		zero.setBounds(102, 419, 82, 65);
		contentPane.add(zero);
		
		JButton virgula = new JButton(",");
		virgula.setFont(new Font("Arial", Font.PLAIN, 30));
		virgula.setBackground(new Color(192, 192, 192));
		virgula.setBounds(192, 419, 82, 65);
		contentPane.add(virgula);
		
		JButton igual = new JButton("=");
		igual.setFont(new Font("Tahoma", Font.BOLD, 30));
		igual.setForeground(new Color(229, 229, 229));
		igual.setBackground(new Color(133, 133, 133));
		igual.setBounds(284, 419, 82, 65);
		contentPane.add(igual);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(200, 225, 240));
		panel.setBounds(10, 11, 354, 82);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Arial", Font.BOLD, 55));
		label.setBounds(10, 13, 334, 58);
		panel.add(label);
	}
}