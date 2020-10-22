//Esta_clase_se_encargara_de_controlar_todo_el_apartado_grafico_de_mi_programa 

//VISTA_DE_VENTANA_PRINCIPAL
//Esta_clase_controla_la_ventana_principal_y_asignacion_de_función_de_las_secundaria

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import rojeru_san.RSLabelHora;
import rojeru_san.RSLabelFecha;

public class Clase_Principal extends JFrame {
	
	Panel_MatematicasDis panelOwO = new Panel_MatematicasDis();
	Panel_operadores panelUwU = new Panel_operadores();
	Panel_practica panelawa = new Panel_practica();
	Panel_acercade panel7w7 = new Panel_acercade();
	 
	public Clase_Principal() {
		setResizable(false); 
		this.setSize(949,640);//Establecemos_el_tamaño_de_la_ventana
		this.setUndecorated(false);
		//this.setOpacity(0.5f); 
		 
		 setLocationRelativeTo(null);//Ubicamos_la_ventana_directamente_en_el_centro_de_la_pantalla
		 
		 //setLocation(360,180);//Le_establecemos_una_pocisión_a_la_ventana
		 
		 //Para_el_setLocation_se_pasan_los_parametros_en_x_e_Y
		 
		 setDefaultCloseOperation(EXIT_ON_CLOSE);//Se_añade_para_cerrar_la_ventana_totalmente_y_no_este_ejecutandose
		 
		 setTitle("Proyecto de Matematicas Discretas");//Establecemos_un_titulo
		 
		 //Añadimos_los_colores_de_fondo
		 //this.getContentPane().setBackground(Color.blue);//metodo_que_le_da_color_de_fonfo_al_metodo
		 iniciarcomponentes(); //Llamamos_al_metodo
		 
	 }//final_del_public_ventana

	//Creamos_un_panel
	//Podemos_modificar_la_ventana_directamente_sin_el_panel
	//Pero_se_recomienda_trabajar_todo_el_contenido_grafico_sobre_un_panel
	
	private void iniciarcomponentes() {
		JPanel panel = new JPanel();//Creación_del_panel
		panel.setLayout(null);//Desactivamos_el_layaou_de_base
		
		//Se_tiene_que_desactivar_el_layout_de_base_para_poder_modificar
		//.... la_ubicación_de_las_etiquetas
		
		panel.setBackground(new Color(255, 255, 255));
		this.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(65, 105, 225));
		panel_1.setBounds(0, 0, 255, 611);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Introducción a las Matematicas Discretas");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(Color.GREEN);	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(0, 0, 0));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(65, 105, 225));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel7w7.setVisible(false);
				panelawa.setVisible(false);
				panelUwU.setVisible(false);
				panelOwO.setVisible(true);
				panel.add(panelOwO);
				panel.validate();
				
			}
		});
		btnNewButton.setBounds(10, 183, 235, 57);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Operadores logicos");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(0, 0, 0));
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(65, 105, 225));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 Primero_apagamos_el_panel_visible_anteriormente
				 Luego_hacemos_visible_el_nuevo_panel_
				 añadimos_el_panel 
				 */
				panel7w7.setVisible(false);
				panelawa.setVisible(false);
				panelOwO.setVisible(false);
				panelUwU.setVisible(true);
				panel.add(panelUwU);
				panel.validate();
			}
		});
		btnNewButton_1.setBounds(10, 278, 235, 57);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Practica unos ejercisios");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_2.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBackground(new Color(0, 0, 0));
			}
		});
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(65, 105, 225));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel7w7.setVisible(false);
				panelawa.setVisible(true);
				panelOwO.setVisible(false);
				panelUwU.setVisible(false);
				panel.add(panelawa);
				panel.validate();
			}
		});
		btnNewButton_2.setBounds(10, 372, 235, 57);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Acerca del programa");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_2_1.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2_1.setBackground(new Color(0, 0, 0));
			}
		});
		btnNewButton_2_1.setBackground(new Color(0, 0, 0));
		btnNewButton_2_1.setForeground(new Color(65, 105, 225));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel7w7.setVisible(true);
				panelawa.setVisible(false);
				panelOwO.setVisible(false);
				panelUwU.setVisible(false);
				panel.add(panel7w7);
				panel.validate();
			}
		});
		btnNewButton_2_1.setBounds(10, 563, 235, 37);
		panel_1.add(btnNewButton_2_1);
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setForeground(Color.BLACK);
		labelHora.setFont(new Font("Dialog", Font.BOLD, 18));
		labelHora.setBackground(Color.BLACK);
		labelHora.setBounds(10, 24, 235, 57);
		panel_1.add(labelHora);
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setForeground(Color.BLACK);
		labelFecha.setFont(new Font("Dialog", Font.BOLD, 18));
		labelFecha.setBackground(Color.BLACK);
		labelFecha.setBounds(20, 82, 200, 40);
		panel_1.add(labelFecha);
		panelOwO.setSize(947, 640);
		panelOwO.setLocation(0, 0);
		panelUwU.setBounds(0, 0, 943, 640);
		panel7w7.setBounds(0, 0, 943, 640);
		panelawa.setBounds(0, 0, 943, 640);
		
		panel.add(panelOwO);
		
	}
	
	
	
	
	//Main_del_programa
	public static void main(String args[]) {
		Clase_Principal v1= new  Clase_Principal();
		v1.setVisible(true);//Hacemos_visible_la_ventana_que_estamos_usando
	}//Final_del_main
}//Final_del_todo
