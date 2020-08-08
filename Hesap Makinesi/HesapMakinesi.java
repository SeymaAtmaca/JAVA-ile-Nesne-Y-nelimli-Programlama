package yeni;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HesapMakinesi {

	private JFrame frame;
	private JTextField txtIkinciSay;
	private JTextField SonucBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi window = new HesapMakinesi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HesapMakinesi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Hesap Makinesi");
		frame.setBounds(100, 100, 867, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JTextPane txtpnIlkSay = new JTextPane();
		txtpnIlkSay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnIlkSay.setBounds(711, 104, 102, 33);
		frame.getContentPane().add(txtpnIlkSay);
		
		txtIkinciSay = new JTextField();
		txtIkinciSay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtIkinciSay.setBounds(711, 143, 102, 33);
		frame.getContentPane().add(txtIkinciSay);
		
		SonucBar = new JTextField();
		SonucBar.setBounds(159, 406, 126, 39);
		
		JTextPane txtpnSayi = new JTextPane();
		txtpnSayi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnSayi.setBounds(711, 248, 102, 33);
		
		JButton BTopla = new JButton("Topla");
		BTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int sayi1=Integer.parseInt(txtpnIlkSay.getText());
					int sayi2=Integer.parseInt(txtIkinciSay.getText());
					int toplam=sayi1+sayi2;
					SonucBar.setText(Integer.toString(toplam));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Hata..Tekrar deneyin");
				}
				
				
			}
		});
		BTopla.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BTopla.setBounds(25, 104, 110, 52);
		frame.getContentPane().add(BTopla);
		
		
		
		JButton BCikart = new JButton("\u00C7\u0131kart");
		BCikart.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BCikart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try{
					int cikartma;
					int sayi1=Integer.parseInt(txtpnIlkSay.getText());
					int sayi2=Integer.parseInt(txtIkinciSay.getText());
					cikartma=sayi1-sayi2;
					
					SonucBar.setText(Integer.toString(cikartma));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Hata..Tekrar deneyin");
				}
				
			}
		});
		BCikart.setBounds(169, 104, 102, 52);
		frame.getContentPane().add(BCikart);
		
		JButton BCarpma = new JButton("\u00C7arp");
		BCarpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					int sayi1=Integer.parseInt(txtpnIlkSay.getText());
					int sayi2=Integer.parseInt(txtIkinciSay.getText());
					int carpma=sayi1*sayi2;
					SonucBar.setText(Integer.toString(carpma));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Hata..Tekrar deneyin");
				}
			}
		});
		BCarpma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BCarpma.setBounds(303, 104, 110, 52);
		frame.getContentPane().add(BCarpma);
		
		JButton BBolme = new JButton("B\u00F6l");
		BBolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double bolme;
					double sayi1=Double.parseDouble(txtpnIlkSay.getText());
					double sayi2=Double.parseDouble(txtIkinciSay.getText());
					if(sayi1<sayi2) {
						 bolme=sayi2/sayi1;
					}
					else if(sayi1==sayi2) {
						bolme=0;
					}
					else {
						bolme=sayi1/sayi2;
					}
					SonucBar.setText(Double.toString(bolme));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Hata..Tekrar deneyin");
				}
				
			}
		});
		BBolme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BBolme.setBounds(440, 106, 110, 48);
		frame.getContentPane().add(BBolme);
		
		JButton BSin = new JButton("Sin");
		BSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double sayi=Double.parseDouble(txtpnSayi.getText());
					double rderece2 = Math.toRadians(sayi);
					double sin=Math.sin(rderece2);
					SonucBar.setText(Double.toString(sin));
				}
				catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Hata..Tekrar deneyin");
				}
				
				
				
			}
		});
		BSin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BSin.setBounds(25, 248, 110, 52);
		frame.getContentPane().add(BSin);
		
		JButton BCos = new JButton("Cos");
		BCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double cos=Double.parseDouble(txtpnSayi.getText());
					double derece=Math.toRadians(cos);
					double cossonuc=Math.cos(derece);
					SonucBar.setText(Double.toString( cossonuc ));
					
				}
				catch(Exception e3) {
					JOptionPane.showMessageDialog(null, "Hata..Lutfen tekrar deneyin");
				}
				
			}
		});
		BCos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BCos.setBounds(169, 248, 102, 52);
		frame.getContentPane().add(BCos);
		
		JButton BTan = new JButton("Tan");
		BTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Double sayi=Double.parseDouble(txtpnSayi.getText());
					Double derece=Math.toRadians(sayi);
					Double tansonuc=Math.tan(derece);
					SonucBar.setText(Double.toString(tansonuc));
					
				}
				catch(Exception e4){
					JOptionPane.showMessageDialog(null, "Hata..Lutfen tekrar deneyin");
				}
				
			}
		});
		BTan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BTan.setBounds(303, 249, 110, 50);
		frame.getContentPane().add(BTan);
		
		JButton BCot = new JButton("Cot");
		BCot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double sayi=Double.parseDouble(txtpnSayi.getText());
					double derece=Math.toRadians(sayi);
					 //Math kütüphanesinde tan deger hesaplanýp , bu degerin -1 ussu alinmistir
					double tandeg=Math.tan(derece);
					double cotsonuc=Math.pow(tandeg, -1);
					SonucBar.setText(Double.toString(cotsonuc));
				}
				catch(Exception e5){
					JOptionPane.showMessageDialog(null, "Hata..Lutfen tekrar deneyin");
					
				}
				
				
				
			}
		});
		BCot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BCot.setBounds(440, 248, 110, 52);
		frame.getContentPane().add(BCot);
		
		
		frame.getContentPane().add(txtpnSayi);
		
		JLabel lblNewLabel = new JLabel("Sonuc");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(60, 406, 70, 39);
		frame.getContentPane().add(lblNewLabel);
		
		
		frame.getContentPane().add(SonucBar);
		SonucBar.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Birinci Sayi");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(613, 104, 88, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0130kinci Sayi");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(613, 143, 75, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hesap Makinesi");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(343, 33, 201, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Trigo. Derece");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(613, 248, 96, 32);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
