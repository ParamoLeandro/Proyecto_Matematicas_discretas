import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel_acercade extends JPanel {
	private JTextField txtEsteProgramaFue;
	private JTextField txtProgramadoEnJava;
	
	 
	public Panel_acercade() {
		setBackground(new Color(0, 0, 0));
		this.setSize(943,640);//Establecemos_el_tamaño_de_la_ventana
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 255, 640);
		add(panel);
		
		txtEsteProgramaFue = new JTextField();
		txtEsteProgramaFue.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtEsteProgramaFue.setHorizontalAlignment(SwingConstants.CENTER);
		txtEsteProgramaFue.setBackground(new Color(128, 0, 0));
		txtEsteProgramaFue.setForeground(new Color(65, 105, 225));
		txtEsteProgramaFue.setText("Este programa fue creado para la clase de Matematicas Discretas\r\n\r\n");
		txtEsteProgramaFue.setBounds(261, 73, 682, 54);
		add(txtEsteProgramaFue);
		txtEsteProgramaFue.setColumns(10);
		
		txtProgramadoEnJava = new JTextField();
		txtProgramadoEnJava.setText("Programado en Java como lenguaje y Eclipse como IDE\r\n");
		txtProgramadoEnJava.setHorizontalAlignment(SwingConstants.CENTER);
		txtProgramadoEnJava.setForeground(new Color(65, 105, 225));
		txtProgramadoEnJava.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtProgramadoEnJava.setColumns(10);
		txtProgramadoEnJava.setBackground(new Color(128, 0, 0));
		txtProgramadoEnJava.setBounds(261, 159, 682, 54);
		add(txtProgramadoEnJava);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\leandroparamo\\Downloads\\rem.gif"));
		lblNewLabel.setBounds(280, 241, 366, 399);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\leandroparamo\\Downloads\\ram.gif"));
		lblNewLabel_1.setBounds(589, 241, 366, 399);
		add(lblNewLabel_1);
		
		
				 
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
		Panel_acercade Panel_acercade = new  Panel_acercade();
		Panel_acercade.setVisible(true);//Hacemos_visible_la_ventana_que_estamos_usando
	}//Final_del_main
}//Final_del_todo

