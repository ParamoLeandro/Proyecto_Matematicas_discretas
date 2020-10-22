import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class Panel_MatematicasDis extends JPanel {
	private JTextArea txtquSonLas;
	
	 
	public Panel_MatematicasDis() {
		setBackground(new Color(0, 0, 0));
		this.setSize(943,640);//Establecemos_el_tamaño_de_la_ventana
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 255, 640);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\leandroparamo\\Downloads\\mate2.jpg"));
		lblNewLabel.setBounds(246, 0, 696, 239);
		add(lblNewLabel);
		
		txtquSonLas = new JTextArea();
		txtquSonLas.setFont(new Font("Monospaced", Font.BOLD, 17));
		txtquSonLas.setTabSize(14);
		txtquSonLas.setBackground(new Color(0, 0, 0));
		txtquSonLas.setForeground(new Color(65, 105, 225));
		txtquSonLas.setWrapStyleWord(true);
		txtquSonLas.setToolTipText("La matem\u00E1tica discreta es un \u00E1rea de las matem\u00E1ticas encargadas del estudio de los conjuntos discretos: finitos o infinitos numerables.\r\n\r\nEn oposici\u00F3n a las matem\u00E1ticas continuas, que se encargan del estudio de conceptos como la continuidad y el cambio continuo, la matem\u00E1ticas discretas estudian estructuras cuyos elementos pueden contarse uno por uno separadamente. Es decir, los procesos en matem\u00E1ticas discretas son contables, como por ejemplo, los n\u00FAmeros enteros, grafos y sentencias de l\u00F3gica.");
		txtquSonLas.setText("\u00BFQu\u00E9 son las matem\u00E1ticas discretas?\r\n\r\n\r\nLa matem\u00E1tica discreta es un \u00E1rea de las matem\u00E1ticas encargadas del estudio de los conjuntos discretos: finitos o infinitos numerables.\r\n\r\nEn oposici\u00F3n a las matem\u00E1ticas continuas, que se encargan del estudio de conceptos como la continuidad y el cambio continuo, la matem\u00E1ticas discretas estudian estructuras cuyos elementos pueden contarse uno por uno separadamente. Es decir, los procesos en matem\u00E1ticas discretas son contables, como por ejemplo, los n\u00FAmeros enteros, grafos y sentencias de l\u00F3gica.");
		txtquSonLas.setLineWrap(true);
		txtquSonLas.setBounds(266, 250, 676, 344);
		add(txtquSonLas);
		txtquSonLas.setColumns(12);
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
		panel_2.setBounds(253, 0, 591, 611);
		panel_2.setLayout(null);
		
	
		
	}
	
	
	
	
	//Main_del_programa
	public static void main(String args[]) {
		Panel_MatematicasDis Panel_MatematicasDis = new  Panel_MatematicasDis();
		Panel_MatematicasDis.setVisible(true);//Hacemos_visible_la_ventana_que_estamos_usando
	}//Final_del_main
}//Final_del_todo