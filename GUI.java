/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;

public class GUI {

	JFrame frame;
	static JPanel pnl_body = new JPanel();
	static CardLayout cardLayout = new CardLayout();
	static JLabel Saldo = new JLabel("U saldo is 300 euro");
	static JLabel lblBedrag = new JLabel("Bedrag");
	JLabel lblpinX = new JLabel("pinX");
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Dialog", Font.PLAIN, 18));
		frame.setBounds(200, 200, 821, 744);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.getContentPane().add(pnl_body, BorderLayout.CENTER);
		pnl_body.setLayout(cardLayout);
		
		JPanel Beginscherm = new JPanel();
		Beginscherm.setForeground(new Color(0, 0, 0));
		Beginscherm.setBackground(new Color(255, 127, 80));
		pnl_body.add(Beginscherm, "beginScherm");
		
		JLabel Baco = new JLabel("Baco Cocaine");
		Baco.setToolTipText("");
		Baco.setLabelFor(frame);
		Baco.setHorizontalAlignment(SwingConstants.CENTER);
		Baco.setVerticalAlignment(SwingConstants.TOP);
		Baco.setForeground(new Color(0, 0, 0));
		Baco.setFont(new Font("Tahoma", Font.PLAIN, 60));
		Baco.setBackground(Color.BLACK);
		
		JLabel scanPoort = new JLabel("Scan hier u pas ");
		scanPoort.setBackground(Color.BLACK);
		scanPoort.setFont(new Font("Tahoma", Font.PLAIN, 40));
		scanPoort.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblBacoCocaine_1 = new JLabel("Baco cocaine");
		lblBacoCocaine_1.setBackground(Color.BLACK);
		lblBacoCocaine_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		GroupLayout gl_Beginscherm = new GroupLayout(Beginscherm);
		gl_Beginscherm.setHorizontalGroup(
			gl_Beginscherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Beginscherm.createSequentialGroup()
					.addGap(166)
					.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(334, Short.MAX_VALUE))
				.addGroup(gl_Beginscherm.createSequentialGroup()
					.addGap(205)
					.addGroup(gl_Beginscherm.createParallelGroup(Alignment.LEADING)
						.addComponent(scanPoort, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
						.addComponent(Baco, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(444, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_Beginscherm.createSequentialGroup()
					.addGap(686)
					.addComponent(lblBacoCocaine_1)
					.addContainerGap(267, Short.MAX_VALUE))
		);
		gl_Beginscherm.setVerticalGroup(
			gl_Beginscherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Beginscherm.createSequentialGroup()
					.addGap(12)
					.addComponent(Baco, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scanPoort, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(lblBacoCocaine_1)
					.addContainerGap())
		);
		Beginscherm.setLayout(gl_Beginscherm);
		
		JPanel PincodeScherm = new JPanel();
		PincodeScherm.setBackground(new Color(255, 127, 80));
		pnl_body.add(PincodeScherm, "pincodeScherm");
		
		JLabel lblVoerUPincode = new JLabel("Voer u pincode in");

		lblVoerUPincode.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblBacoCocaine = new JLabel("Baco cocaine");
		lblBacoCocaine.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblBevestigen = new JLabel("Bevestigen  D");
		lblBevestigen.setBackground(new Color(0, 0, 0));
		lblBevestigen.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBevestigen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblPincodescherm = new JLabel("Pincodescherm");
		lblPincodescherm.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JLabel lblpinX = new JLabel("pinX");
		GroupLayout gl_PincodeScherm = new GroupLayout(PincodeScherm);
		gl_PincodeScherm.setHorizontalGroup(
			gl_PincodeScherm.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PincodeScherm.createSequentialGroup()
					.addContainerGap(631, Short.MAX_VALUE)
					.addComponent(lblBevestigen, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
				.addGroup(gl_PincodeScherm.createSequentialGroup()
					.addGroup(gl_PincodeScherm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PincodeScherm.createSequentialGroup()
							.addGap(202)
							.addComponent(lblPincodescherm)
							.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_PincodeScherm.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblVoerUPincode, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
							.addGap(36)))
					.addComponent(lblBacoCocaine)
					.addGap(46))
				.addGroup(Alignment.LEADING, gl_PincodeScherm.createSequentialGroup()
					.addGap(313)
					.addComponent(lblpinX)
					.addContainerGap(434, Short.MAX_VALUE))
		);
		gl_PincodeScherm.setVerticalGroup(
			gl_PincodeScherm.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PincodeScherm.createSequentialGroup()
					.addGap(29)
					.addComponent(lblPincodescherm)
					.addGroup(gl_PincodeScherm.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PincodeScherm.createSequentialGroup()
							.addGap(90)
							.addComponent(lblBevestigen)
							.addPreferredGap(ComponentPlacement.RELATED, 441, Short.MAX_VALUE)
							.addComponent(lblBacoCocaine))
						.addGroup(gl_PincodeScherm.createSequentialGroup()
							.addGap(56)
							.addComponent(lblpinX)
							.addGap(65)
							.addComponent(lblVoerUPincode, GroupLayout.PREFERRED_SIZE, 445, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		PincodeScherm.setLayout(gl_PincodeScherm);
		
		JPanel MenuScherm = new JPanel();
		MenuScherm.setPreferredSize(new Dimension(200, 200));
		MenuScherm.setFocusTraversalKeysEnabled(false);
		MenuScherm.setFocusCycleRoot(true);
		MenuScherm.setDoubleBuffered(false);
		MenuScherm.setAutoscrolls(true);
		MenuScherm.setBackground(new Color(255, 127, 80));
		pnl_body.add(MenuScherm, "menuScherm");
		
		JLabel lblMenuscherm = new JLabel("Menuscherm");
		lblMenuscherm.setBackground(Color.BLACK);
		lblMenuscherm.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JLabel lblBaco = new JLabel("Baco cocaine");
		lblBaco.setBackground(Color.BLACK);
		lblBaco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		
		JLabel lblSaldo = new JLabel("Saldo   (D)");
		lblSaldo.setBackground(new Color(0, 0, 0));
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSaldo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JLabel lbla = new JLabel("70 $   (A)");
		lbla.setBackground(new Color(0, 0, 0));
		lbla.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbla.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JLabel lblOpnemenb = new JLabel("Opnemen       (B)");
		lblOpnemenb.setBackground(new Color(0, 0, 0));
		lblOpnemenb.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblOpnemenb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblBeginscherm = new JLabel("Beginscherm  (C)");
		lblBeginscherm.setBackground(new Color(0, 0, 0));
		lblBeginscherm.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBeginscherm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_MenuScherm = new GroupLayout(MenuScherm);
		gl_MenuScherm.setHorizontalGroup(
			gl_MenuScherm.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_MenuScherm.createSequentialGroup()
					.addGroup(gl_MenuScherm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_MenuScherm.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_MenuScherm.createParallelGroup(Alignment.TRAILING)
								.addComponent(lbla, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSaldo))
							.addGap(23)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_MenuScherm.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBeginscherm, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_MenuScherm.createSequentialGroup()
									.addGap(18, 52, Short.MAX_VALUE)
									.addComponent(lblBaco)
									.addGap(55))
								.addComponent(lblOpnemenb)))
						.addGroup(gl_MenuScherm.createSequentialGroup()
							.addGap(220)
							.addComponent(lblMenuscherm)))
					.addContainerGap())
		);
		gl_MenuScherm.setVerticalGroup(
			gl_MenuScherm.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_MenuScherm.createSequentialGroup()
					.addGap(67)
					.addComponent(lblMenuscherm)
					.addGap(87)
					.addGroup(gl_MenuScherm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_MenuScherm.createSequentialGroup()
							.addGap(46)
							.addComponent(lblOpnemenb)
							.addGap(77)
							.addComponent(lblBeginscherm)
							.addGap(267)
							.addComponent(lblBaco))
						.addGroup(gl_MenuScherm.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_MenuScherm.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_MenuScherm.createSequentialGroup()
									.addGap(52)
									.addComponent(lblSaldo)
									.addGap(76)
									.addComponent(lbla)))))
					.addGap(273))
		);
		MenuScherm.setLayout(gl_MenuScherm);
		
		JPanel blokScherm = new JPanel();
		blokScherm.setForeground(Color.BLACK);
		blokScherm.setBackground(Color.RED);
		pnl_body.add(blokScherm, "blokScherm");
		
		JLabel lblBlokkeer = new JLabel("Blokkeerscherm");
		lblBlokkeer.setBackground(Color.BLACK);
		lblBlokkeer.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JLabel lblUHeeftTe = new JLabel("U heeft te vaak uw pincode verkeerd ingevoerd ");
		lblUHeeftTe.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblUHeeftTe.setBackground(Color.BLACK);
		lblUHeeftTe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblUPinpasIs = new JLabel("U pinpas is geblokkeerd");
		lblUPinpasIs.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblUPinpasIs.setBackground(Color.BLACK);
		lblUPinpasIs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Baco cocaine");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_blokScherm = new GroupLayout(blokScherm);
		gl_blokScherm.setHorizontalGroup(
			gl_blokScherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_blokScherm.createSequentialGroup()
					.addGroup(gl_blokScherm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_blokScherm.createSequentialGroup()
							.addGap(161)
							.addGroup(gl_blokScherm.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblUHeeftTe)
								.addComponent(lblBlokkeer, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_blokScherm.createSequentialGroup()
							.addGap(278)
							.addComponent(lblUPinpasIs)
							.addPreferredGap(ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2)))
					.addContainerGap())
		);
		gl_blokScherm.setVerticalGroup(
			gl_blokScherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_blokScherm.createSequentialGroup()
					.addGap(31)
					.addComponent(lblBlokkeer)
					.addGap(134)
					.addComponent(lblUHeeftTe)
					.addGap(47)
					.addComponent(lblUPinpasIs)
					.addPreferredGap(ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2)
					.addContainerGap())
		);
		blokScherm.setLayout(gl_blokScherm);
		
		JPanel opneemScherm = new JPanel();
		opneemScherm.setBackground(new Color(255, 127, 80));
		pnl_body.add(opneemScherm, "opneemScherm");
		
		JLabel lblOpneemscherm = new JLabel("Opneemscherm");
		lblOpneemscherm.setBackground(Color.BLACK);
		lblOpneemscherm.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JLabel lblNewLabel_3 = new JLabel("Bevestigen  (A)");
		lblNewLabel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("Menuscherm (B)");
		lblNewLabel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5 = new JLabel("Baco cocaine");
		lblNewLabel_5.setBackground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		
		JLabel lblPeso10 = new JLabel("10 peso (1)");
		lblPeso10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblPeso10.setBackground(new Color(0, 0, 0));
		lblPeso10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblPeso20 = new JLabel("20 peso (2)");
		lblPeso20.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblPeso20.setBackground(new Color(0, 0, 0));
		lblPeso20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblPeso30 = new JLabel("50 peso (3)");
		lblPeso30.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblPeso30.setBackground(new Color(0, 0, 0));
		lblPeso30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblVerwijderenc = new JLabel("Verwijderen  (C)");
		lblVerwijderenc.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblVerwijderenc.setBackground(new Color(0, 0, 0));
		lblVerwijderenc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		
		GroupLayout gl_opneemScherm = new GroupLayout(opneemScherm);
		gl_opneemScherm.setHorizontalGroup(
			gl_opneemScherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_opneemScherm.createSequentialGroup()
					.addContainerGap(214, Short.MAX_VALUE)
					.addComponent(lblOpneemscherm)
					.addGap(175))
				.addGroup(gl_opneemScherm.createSequentialGroup()
					.addContainerGap(689, Short.MAX_VALUE)
					.addComponent(lblNewLabel_5)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_opneemScherm.createSequentialGroup()
					.addGroup(gl_opneemScherm.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_opneemScherm.createSequentialGroup()
							.addGap(24)
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
							.addGap(49)
							.addComponent(lblPeso10)
							.addGap(47)
							.addGroup(gl_opneemScherm.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBedrag)
								.addGroup(gl_opneemScherm.createSequentialGroup()
									.addComponent(lblPeso20)
									.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
									.addComponent(lblPeso30))))
						.addGroup(gl_opneemScherm.createSequentialGroup()
							.addGap(47)
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
							.addGroup(gl_opneemScherm.createParallelGroup(Alignment.LEADING)
								.addComponent(lblVerwijderenc)
								.addComponent(lblNewLabel_4))))
					.addGap(53))
		);
		gl_opneemScherm.setVerticalGroup(
			gl_opneemScherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_opneemScherm.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOpneemscherm)
					.addGap(81)
					.addGroup(gl_opneemScherm.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_3))
					.addGap(28)
					.addComponent(lblVerwijderenc)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_opneemScherm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_opneemScherm.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_5))
						.addGroup(gl_opneemScherm.createSequentialGroup()
							.addGap(94)
							.addGroup(gl_opneemScherm.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPeso10)
								.addComponent(lblPeso20)
								.addComponent(lblPeso30))
							.addGap(99)
							.addComponent(lblBedrag)))
					.addGap(38))
		);
		lblBedrag.setBackground(new Color(0, 0, 0));
		lblBedrag.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBedrag.setFont(new Font("Tahoma", Font.PLAIN, 20));
		opneemScherm.setLayout(gl_opneemScherm);
		
		JPanel saldoScherm = new JPanel();
		saldoScherm.setBackground(new Color(255, 99, 71));
		pnl_body.add(saldoScherm, "saldoScherm");
		
		JLabel lblSaldoscherm = new JLabel("Saldoscherm");
		lblSaldoscherm.setBackground(Color.BLACK);
		lblSaldoscherm.setFont(new Font("Tahoma", Font.PLAIN, 60));
		Saldo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		
		Saldo.setBackground(Color.BLACK);
		Saldo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblMenuscherm_1 = new JLabel("Menuscherm  B");
		lblMenuscherm_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblMenuscherm_1.setBackground(Color.BLACK);
		lblMenuscherm_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblBeginschermA = new JLabel("Beginscherm  A");
		lblBeginschermA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBeginschermA.setBackground(Color.BLACK);
		lblBeginschermA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_6 = new JLabel("Baco cocaine");
		lblNewLabel_6.setBackground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_saldoScherm = new GroupLayout(saldoScherm);
		gl_saldoScherm.setHorizontalGroup(
			gl_saldoScherm.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_saldoScherm.createSequentialGroup()
					.addContainerGap(689, Short.MAX_VALUE)
					.addComponent(lblNewLabel_6)
					.addContainerGap())
				.addGroup(gl_saldoScherm.createSequentialGroup()
					.addContainerGap(228, Short.MAX_VALUE)
					.addComponent(Saldo)
					.addGap(211)
					.addGroup(gl_saldoScherm.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMenuscherm_1)
						.addComponent(lblBeginschermA))
					.addGap(55))
				.addGroup(Alignment.LEADING, gl_saldoScherm.createSequentialGroup()
					.addGap(188)
					.addComponent(lblSaldoscherm, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(246, Short.MAX_VALUE))
		);
		gl_saldoScherm.setVerticalGroup(
			gl_saldoScherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_saldoScherm.createSequentialGroup()
					.addGap(60)
					.addComponent(lblSaldoscherm)
					.addGap(56)
					.addComponent(lblBeginschermA)
					.addGap(49)
					.addGroup(gl_saldoScherm.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMenuscherm_1)
						.addComponent(Saldo))
					.addPreferredGap(ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
					.addComponent(lblNewLabel_6)
					.addContainerGap())
		);
		saldoScherm.setLayout(gl_saldoScherm);
		
		JPanel bonScherm = new JPanel();
		bonScherm.setBackground(new Color(255, 127, 80));
		pnl_body.add(bonScherm, "bonScherm");
		
		JLabel lblBonscherm = new JLabel("Bonscherm");
		lblBonscherm.setBackground(Color.BLACK);
		lblBonscherm.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JLabel lblWiltUEen = new JLabel("Wilt u een bon ?");
		lblWiltUEen.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblWiltUEen.setBackground(Color.BLACK);
		lblWiltUEen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblBevestigenA = new JLabel("Ja   (A)");
		lblBevestigenA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBevestigenA.setBackground(Color.BLACK);
		lblBevestigenA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNeeB = new JLabel("Nee (B)");
		lblNeeB.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNeeB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNeeB.setBackground(Color.BLACK);
		
		JLabel lblDonerenC = new JLabel("Doneren (D)");
		lblDonerenC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblDonerenC.setBackground(Color.BLACK);
		lblDonerenC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblBacoCocaine_3 = new JLabel("Baco cocaine");
		lblBacoCocaine_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_bonScherm = new GroupLayout(bonScherm);
		gl_bonScherm.setHorizontalGroup(
			gl_bonScherm.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_bonScherm.createSequentialGroup()
					.addContainerGap(613, Short.MAX_VALUE)
					.addComponent(lblDonerenC)
					.addGap(94))
				.addGroup(gl_bonScherm.createSequentialGroup()
					.addGap(138)
					.addComponent(lblWiltUEen)
					.addPreferredGap(ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
					.addGroup(gl_bonScherm.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBevestigenA)
						.addComponent(lblNeeB))
					.addGap(106))
				.addGroup(gl_bonScherm.createSequentialGroup()
					.addContainerGap(735, Short.MAX_VALUE)
					.addComponent(lblBacoCocaine_3)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_bonScherm.createSequentialGroup()
					.addGap(223)
					.addComponent(lblBonscherm)
					.addContainerGap(287, Short.MAX_VALUE))
		);
		gl_bonScherm.setVerticalGroup(
			gl_bonScherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bonScherm.createSequentialGroup()
					.addGroup(gl_bonScherm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bonScherm.createSequentialGroup()
							.addGap(103)
							.addGroup(gl_bonScherm.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_bonScherm.createSequentialGroup()
									.addGap(117)
									.addComponent(lblBevestigenA)
									.addGap(61)
									.addComponent(lblNeeB)
									.addGap(62)
									.addComponent(lblDonerenC))
								.addGroup(gl_bonScherm.createSequentialGroup()
									.addGap(100)
									.addComponent(lblWiltUEen)))
							.addPreferredGap(ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
							.addComponent(lblBacoCocaine_3))
						.addGroup(gl_bonScherm.createSequentialGroup()
							.addGap(38)
							.addComponent(lblBonscherm)))
					.addContainerGap())
		);
		bonScherm.setLayout(gl_bonScherm);
		
		JPanel doneerScherm = new JPanel();
		doneerScherm.setBackground(new Color(255, 127, 80));
		pnl_body.add(doneerScherm, "doneerScherm");
		
		JLabel lblNewLabel = new JLabel("Doneerscherm");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JLabel lblWiltUEen_1 = new JLabel("Wilt u \u00E9\u00E9n peso doneren aan hongerige kinderen in de wereld ?");
		lblWiltUEen_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblBevestigenA_1 = new JLabel("Bevestigen   (A)");
		lblBevestigenA_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBevestigenA_1.setBackground(new Color(0, 0, 0));
		lblBevestigenA_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Baco cocaine");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_doneerScherm = new GroupLayout(doneerScherm);
		gl_doneerScherm.setHorizontalGroup(
			gl_doneerScherm.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_doneerScherm.createSequentialGroup()
					.addContainerGap(689, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_doneerScherm.createSequentialGroup()
					.addGap(176)
					.addComponent(lblNewLabel)
					.addContainerGap(209, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_doneerScherm.createSequentialGroup()
					.addGap(110)
					.addComponent(lblWiltUEen_1)
					.addContainerGap(330, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_doneerScherm.createSequentialGroup()
					.addGap(37)
					.addComponent(lblBevestigenA_1)
					.addContainerGap(841, Short.MAX_VALUE))
		);
		gl_doneerScherm.setVerticalGroup(
			gl_doneerScherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_doneerScherm.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel)
					.addGap(82)
					.addComponent(lblBevestigenA_1)
					.addGap(76)
					.addComponent(lblWiltUEen_1)
					.addPreferredGap(ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addContainerGap())
		);
		doneerScherm.setLayout(gl_doneerScherm);
		
		JPanel eindScherm = new JPanel();
		eindScherm.setForeground(new Color(0, 0, 0));
		eindScherm.setBackground(new Color(255, 127, 80));
		pnl_body.add(eindScherm, "eindScherm");
		
		JLabel lblEindscherm = new JLabel("Eindscherm");
		lblEindscherm.setBackground(Color.BLACK);
		lblEindscherm.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JLabel lblEenFijneDag = new JLabel("Een fijne dag verder");
		lblEenFijneDag.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEenFijneDag.setBackground(Color.BLACK);
		
		JLabel lblDankUWel = new JLabel("Dank u wel voor het pinnen bij Baco cocaine");
		lblDankUWel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDankUWel.setBackground(Color.BLACK);
		
		JLabel lblBacoCocaine_2 = new JLabel("Baco cocaine");
		lblBacoCocaine_2.setBackground(Color.BLACK);
		lblBacoCocaine_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		GroupLayout gl_eindScherm = new GroupLayout(eindScherm);
		gl_eindScherm.setHorizontalGroup(
			gl_eindScherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_eindScherm.createSequentialGroup()
					.addGroup(gl_eindScherm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_eindScherm.createSequentialGroup()
							.addGap(242)
							.addComponent(lblEindscherm))
						.addGroup(gl_eindScherm.createSequentialGroup()
							.addGap(160)
							.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 447, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
							.addComponent(lblBacoCocaine_2))
						.addGroup(gl_eindScherm.createSequentialGroup()
							.addGap(184)
							.addComponent(lblDankUWel))
						.addGroup(gl_eindScherm.createSequentialGroup()
							.addGap(283)
							.addComponent(lblEenFijneDag)))
					.addContainerGap())
		);
		gl_eindScherm.setVerticalGroup(
			gl_eindScherm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_eindScherm.createSequentialGroup()
					.addComponent(lblEindscherm)
					.addGap(52)
					.addComponent(lblDankUWel)
					.addGap(31)
					.addComponent(lblEenFijneDag)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_eindScherm.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_eindScherm.createSequentialGroup()
							.addComponent(lblNewLabel_9)
							.addGap(25))
						.addGroup(gl_eindScherm.createSequentialGroup()
							.addComponent(lblBacoCocaine_2)
							.addContainerGap())))
		);
		eindScherm.setLayout(gl_eindScherm);
	}
}