import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class Panel_operadores extends JPanel {
	private JTextField txtOperadoresLogicos;
	private JTextArea txtLosOperadoresLgicos;
	private JTextField txtClickealosYConoce;
	private JTextField txtSiDeseasConocer;
	
	 
	public Panel_operadores() {
		setBackground(new Color(0, 0, 0));
		this.setSize(943,640);//Establecemos_el_tamaño_de_la_ventana
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 255, 640);
		add(panel);
		
		txtOperadoresLogicos = new JTextField();
		txtOperadoresLogicos.setEditable(false);
		txtOperadoresLogicos.setBackground(new Color(0, 0, 0));
		txtOperadoresLogicos.setForeground(new Color(65, 105, 225));
		txtOperadoresLogicos.setFont(new Font("Tahoma", Font.BOLD, 21));
		txtOperadoresLogicos.setHorizontalAlignment(SwingConstants.CENTER);
		txtOperadoresLogicos.setText("Operadores Logicos\r\n");
		txtOperadoresLogicos.setBounds(265, 11, 255, 156);
		add(txtOperadoresLogicos);
		txtOperadoresLogicos.setColumns(10);
		
		txtLosOperadoresLgicos = new JTextArea();
		txtLosOperadoresLgicos.setLineWrap(true);
		txtLosOperadoresLgicos.setWrapStyleWord(true);
		txtLosOperadoresLgicos.setText("Los operadores l\u00F3gicos pueden crear condiciones compuestas en una f\u00F3rmula, como que se deben cumplir dos o m\u00E1s condiciones para elegir un determinado m\u00E9todo de c\u00E1lculo. Con los operadores l\u00F3gicos, puede describir estas combinaciones de condiciones.");
		txtLosOperadoresLgicos.setForeground(new Color(65, 105, 225));
		txtLosOperadoresLgicos.setFont(new Font("Tahoma", Font.BOLD, 21));
		txtLosOperadoresLgicos.setEditable(false);
		txtLosOperadoresLgicos.setColumns(10);
		txtLosOperadoresLgicos.setBackground(Color.BLACK);
		txtLosOperadoresLgicos.setBounds(542, 11, 391, 221);
		add(txtLosOperadoresLgicos);
		
		txtClickealosYConoce = new JTextField();
		txtClickealosYConoce.setText("Clickealos y conoce m\u00E1s de ellos\r\n");
		txtClickealosYConoce.setHorizontalAlignment(SwingConstants.CENTER);
		txtClickealosYConoce.setForeground(new Color(65, 105, 225));
		txtClickealosYConoce.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtClickealosYConoce.setEditable(false);
		txtClickealosYConoce.setColumns(10);
		txtClickealosYConoce.setBackground(Color.BLACK);
		txtClickealosYConoce.setBounds(265, 263, 255, 71);
		add(txtClickealosYConoce);
		
		JButton btnNewButton = new JButton(" ^");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "La conjunción es un operador que actúa sobre dos valores de verdad,\n típicamente los valores de verdad de dos proposiciones, \n devolviendo el valor de verdad verdadero cuando ambas proposiciones son verdaderas,\n y falso en cualquier caso, es decir es verdadera cuando ambas son verdaderas, \n en caso contrario es falsa. ");
			}
		});
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setForeground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(265, 361, 89, 53);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("v");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "La disyunción es un operador que ejecuta sobre dos valores de verdad,\n devolviendo el valor de verdad Verdadero cuando una de las proporciones es verdadera o cuando ambas \n lo son y falso cuando ambas son falsas. p v q (se lee: p o q). \n si ambas proporciones son falsas, la proporción compuesta es falsa");
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setForeground(new Color(65, 105, 225));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(398, 361, 89, 53);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u00AC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "NEGACIÓN\r\n" + 
						"Es un operador que se ejecuta sobre un único valor de verdad,\n devolviendo el valor contradictorio de la proposición considerada. \n Nos dice que sea p una proposición, la negación de p se representa \n por ¬p. Se lee: \"ni p\". Solo hay dos posibilidades \n y no cuatro como en los casos anteriores. \n Se puede negar usando \"no\", \"es falso \n \", \"no es cierto que\", \"no es verdad que\". ");
			}
		});
		btnNewButton_2.setForeground(new Color(65, 105, 225));
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.setBounds(529, 361, 89, 53);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u2192");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " Condicional \n El condicional es la unión de dos o más proporciones por NO. \n Sean p y q proposiciones, la conjunción negativa entre p y q se representa por \n p no q a lo cual se lee: ni y ni. si las dos \n proporciones son falsas dichas proposición compuesta \n es verdadera, en caso contrario es falsa. ");
			}
		});
		btnNewButton_3.setBackground(new Color(128, 0, 0));
		btnNewButton_3.setForeground(new Color(65, 105, 225));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_3.setBounds(663, 361, 89, 53);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u2194");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " El bicondicional \n O doble implicación es un operador que funciona sobre dos valores de verdad,\n y representa por p <-> q. Se lee: p si y solo si q, \n p si y solamente si q. El bicondicional de dos proposiciones es verdadero \n si las dos proposiciones son verdaderas o las dos son falsas.");
			}
		});
		btnNewButton_4.setForeground(new Color(65, 105, 225));
		btnNewButton_4.setBackground(new Color(128, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_4.setBounds(804, 361, 89, 53);
		add(btnNewButton_4);
		
		JButton btnNewButton_9 = new JButton("Mas Informaci\u00F3n");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_9.setForeground(new Color(65, 105, 225));
		btnNewButton_9.setBackground(new Color(128, 0, 0));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*hacemos_la_busqueda_de_la_paguina_web*/
				
				if(java.awt.Desktop.isDesktopSupported()) {
					
					java.awt.Desktop desktop = java.awt.Desktop.getDesktop(); 
					
					if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
						
						try {
								java.net.URI uri = new java.net .URI("http://logicasmatematicasdiana.blogspot.com/2014/09/logicas-matematicas.html");
								desktop.browse(uri);
						}catch (URISyntaxException | IOException ex) {}
						
					}//final_del_if
					
				}//final_del_if
				
			}
		});
		btnNewButton_9.setBounds(731, 500, 162, 71);
		add(btnNewButton_9);
		
		txtSiDeseasConocer = new JTextField();
		txtSiDeseasConocer.setText("Si deseas conocer mas informaci\u00F3n del tema clickea aca ->\r\n\r\n");
		txtSiDeseasConocer.setHorizontalAlignment(SwingConstants.CENTER);
		txtSiDeseasConocer.setForeground(new Color(65, 105, 225));
		txtSiDeseasConocer.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSiDeseasConocer.setEditable(false);
		txtSiDeseasConocer.setColumns(10);
		txtSiDeseasConocer.setBackground(Color.BLACK);
		txtSiDeseasConocer.setBounds(265, 500, 445, 71);
		add(txtSiDeseasConocer);
		
		//this.setOpacity(0.5f); 
		 
				 
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
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(65, 105, 225));
		panel_1.setBounds(0, 0, 255, 611);
		
		
	}
	
	
	
	
	//Main_del_programa
	public static void main(String args[]) {
		Panel_operadores Panel_operadores = new  Panel_operadores();
		Panel_operadores.setVisible(true);//Hacemos_visible_la_ventana_que_estamos_usando
	}//Final_del_main
}//Final_del_todo
