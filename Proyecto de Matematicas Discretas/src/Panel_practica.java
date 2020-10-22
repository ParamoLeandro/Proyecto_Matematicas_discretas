import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panel_practica extends JPanel {
	private JTextField txtPractiquemosAlgunosEjercisios;
	private JTextField txtPruebaConLos;
	private JTextField txtAV;
	private JTextField txtB;
	private JTextField txtaVb;
	private JTextField txta;
	private JTextField txtbV;
	private JTextArea txtSiendoQueEn;
	private JTextField resu1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	 
	public Panel_practica() {
		setBackground(new Color(0, 0, 0));
		this.setSize(943,640);//Establecemos_el_tamaño_de_la_ventana
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 255, 640);
		add(panel);	//this.setOpacity(0.5f); 
		
		txtPractiquemosAlgunosEjercisios = new JTextField();
		txtPractiquemosAlgunosEjercisios.setEditable(false);
		txtPractiquemosAlgunosEjercisios.setForeground(new Color(65, 105, 225));
		txtPractiquemosAlgunosEjercisios.setBackground(Color.BLACK);
		txtPractiquemosAlgunosEjercisios.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPractiquemosAlgunosEjercisios.setHorizontalAlignment(SwingConstants.CENTER);
		txtPractiquemosAlgunosEjercisios.setText("Practiquemos algunos ejercisios");
		txtPractiquemosAlgunosEjercisios.setBounds(265, 11, 370, 36);
		add(txtPractiquemosAlgunosEjercisios);
		txtPractiquemosAlgunosEjercisios.setColumns(10);
		
		txtPruebaConLos = new JTextField();
		txtPruebaConLos.setEditable(false);
		txtPruebaConLos.setText("Prueba con los siguientes ejercisios\r\n");
		txtPruebaConLos.setHorizontalAlignment(SwingConstants.CENTER);
		txtPruebaConLos.setForeground(new Color(65, 105, 225));
		txtPruebaConLos.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPruebaConLos.setColumns(10);
		txtPruebaConLos.setBackground(Color.BLACK);
		txtPruebaConLos.setBounds(265, 73, 370, 36);
		add(txtPruebaConLos);
		
		txtAV = new JTextField();
		txtAV.setEditable(false);
		txtAV.setText("1) A v B =");
		txtAV.setHorizontalAlignment(SwingConstants.CENTER);
		txtAV.setForeground(new Color(65, 105, 225));
		txtAV.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtAV.setColumns(10);
		txtAV.setBackground(Color.BLACK);
		txtAV.setBounds(265, 275, 278, 36);
		add(txtAV);
		
		txtB = new JTextField();
		txtB.setEditable(false);
		txtB.setText("2) B \u028C A =\r\n");
		txtB.setHorizontalAlignment(SwingConstants.CENTER);
		txtB.setForeground(new Color(65, 105, 225));
		txtB.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtB.setColumns(10);
		txtB.setBackground(Color.BLACK);
		txtB.setBounds(265, 322, 278, 36);
		add(txtB);
		
		txtaVb = new JTextField();
		txtaVb.setEditable(false);
		txtaVb.setText("3) \u00ACA v \u00ACB =\r\n");
		txtaVb.setHorizontalAlignment(SwingConstants.CENTER);
		txtaVb.setForeground(new Color(65, 105, 225));
		txtaVb.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtaVb.setColumns(10);
		txtaVb.setBackground(Color.BLACK);
		txtaVb.setBounds(265, 369, 278, 36);
		add(txtaVb);
		
		txta = new JTextField();
		txta.setEditable(false);
		txta.setText("4) \u00ACA \u028C A =");
		txta.setHorizontalAlignment(SwingConstants.CENTER);
		txta.setForeground(new Color(65, 105, 225));
		txta.setFont(new Font("Tahoma", Font.BOLD, 20));
		txta.setColumns(10);
		txta.setBackground(Color.BLACK);
		txta.setBounds(265, 416, 278, 36);
		add(txta);
		
		txtbV = new JTextField();
		txtbV.setEditable(false);
		txtbV.setText("5) \u00ACB v \u00AC(\u00ACA) =");
		txtbV.setHorizontalAlignment(SwingConstants.CENTER);
		txtbV.setForeground(new Color(65, 105, 225));
		txtbV.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtbV.setColumns(10);
		txtbV.setBackground(Color.BLACK);
		txtbV.setBounds(265, 463, 278, 36);
		add(txtbV);
		
		txtSiendoQueEn = new JTextArea();
		txtSiendoQueEn.setWrapStyleWord(true);
		txtSiendoQueEn.setLineWrap(true);
		txtSiendoQueEn.setText("Siendo que en las siguientes preposiciones A es falsa y B es verdadero, determine el valor de verdad de las siguientes expresiones.\r\n");
		txtSiendoQueEn.setForeground(new Color(65, 105, 225));
		txtSiendoQueEn.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtSiendoQueEn.setColumns(10);
		txtSiendoQueEn.setBackground(Color.BLACK);
		txtSiendoQueEn.setBounds(265, 120, 370, 144);
		add(txtSiendoQueEn);
		
		resu1 = new JTextField();
		resu1.setHorizontalAlignment(SwingConstants.CENTER);
		resu1.setFont(new Font("Tahoma", Font.BOLD, 18));
		resu1.setBounds(563, 275, 103, 36);
		add(resu1);
		resu1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(563, 322, 103, 36);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(563, 369, 103, 36);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(563, 416, 103, 36);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(563, 463, 103, 36);
		add(textField_4);
		
		JButton btnNewButton = new JButton("Resultados");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(128, 0, 0));
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String resultado1 = "v";
				String resultado2 = "f";
				String resultado3 = "v";
				String resultado4 = "f";
				String resultado5 = "f";
				/********************************************************************/
				String resultado_1 = resu1.getText();
				String resultado_2 = textField_1.getText();
				String resultado_3 = textField_2.getText();
				String resultado_4 = textField_3.getText();
				String resultado_5 = textField_4.getText();
				/********************************************************************/
				if(resultado_1.equals(resultado1)) {
					JOptionPane.showMessageDialog(null,"El resultado del primer ejercisio es correcto");
				}else{
					JOptionPane.showMessageDialog(null,"El resultado del ejercisio es incorrecto, la respuesta correcta es v");
				}//final_del_if
				/********************************************************************/
				/********************************************************************/
				if(resultado_2.equals(resultado2)) {
					JOptionPane.showMessageDialog(null,"El resultado del segundo ejercisio es correcto");
				}else{
					JOptionPane.showMessageDialog(null,"El resultado del segundo ejercisio es incorrecto, la respuesta correcta es f");
				}//final_del_if
				/********************************************************************/
				/********************************************************************/
				if(resultado_3.equals(resultado3)) {
					JOptionPane.showMessageDialog(null,"El resultado del tercer ejercisio es correcto");
				}else{
					JOptionPane.showMessageDialog(null,"El resultado del tercer ejercisio es incorrecto, la respuesta correcta es v");
				}//final_del_if
				/********************************************************************/
				/********************************************************************/
				if(resultado_4.equals(resultado4)) {
					JOptionPane.showMessageDialog(null,"El resultado del cuarto ejercisio es correcto");
				}else{
					JOptionPane.showMessageDialog(null,"El resultado del cuarto ejercisio es incorrecto, la respuesta correcta es f");
				}//final_del_if
				/********************************************************************/
				/********************************************************************/
				if(resultado_5.equals(resultado5)) {
					JOptionPane.showMessageDialog(null,"El resultado del quinto ejercisio es correcto");
				}else{
					JOptionPane.showMessageDialog(null,"El resultado del quinto ejercisio es incorrecto, la respuesta correcta es f");
				}//final_del_if
				/********************************************************************/
				
				
				
			}
		});
		btnNewButton.setBounds(265, 536, 278, 50);
		add(btnNewButton);
		 
				 
		 //setLocation(360,180);//Le_establecemos_una_pocisión_a_la_ventana
		 
		 //Para_el_setLocation_se_pasan_los_parametros_en_x_e_Y
		 
		 		 
		 //Añadimos_los_colores_de_fondo
		 //this.getContentPane().setBackground(Color.blue);//metodo_que_le_da_color_de_fonfo_al_metodo
		 iniciarcomponentes(); //Llamamos_al_metodo
		 
	 }//final_del_public_ventana

	//Creamos_un_panel
	//Podemos_modificar_la_ventana_directamente_sin_el_panel
	//Pero_se_recomienda_trabajar_todo_el_contenido_grafico_sobre_un_panel
	
	private void iniciarcomponentes() {
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(253, 0, 255, 640);
		panel_2.setLayout(null);
		
	}
	
	
	
	
	//Main_del_programa
	public static void main(String args[]) {
		Panel_practica Panel_practica = new  Panel_practica();
		Panel_practica.setVisible(true);//Hacemos_visible_la_ventana_que_estamos_usando
	}//Final_del_main
}//Final_del_todo
