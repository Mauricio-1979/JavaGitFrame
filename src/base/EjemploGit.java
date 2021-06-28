package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjemploGit extends JFrame implements ActionListener{
	
	JLabel titulo, nombre, telefono;
	
	JTextField txt_nombre, txt_telefono; 
	
	JButton btn_agregar;
	
	JTextArea txt_area;
	
	String texto;
	
	public EjemploGit() {
		setLayout(null);
		titulo = new JLabel("TITULO DE ESTE PROGRAMA");
		titulo.setBounds(100, 25, 250, 30);
		add(titulo);
		
		nombre = new JLabel("NOMBRE");
		nombre.setBounds(30, 60, 70, 25);
		add(nombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(105, 60, 200, 25);
		add(txt_nombre);
		
		telefono = new JLabel("TELEFONO");
		telefono.setBounds(30, 90, 70, 25);
		add(telefono);
		
		txt_telefono = new JTextField();
		txt_telefono.setBounds(105, 90, 200, 25);
		add(txt_telefono);
		
		btn_agregar = new JButton("AGREGAR");
		btn_agregar.setBounds(105, 120, 100, 25);
		btn_agregar.addActionListener(this);
		add(btn_agregar);
		
		txt_area = new JTextArea();
		txt_area.setBounds(30, 160, 390, 280);
		add(txt_area);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btn_agregar) {

			texto += txt_nombre.getText()+" "+txt_telefono.getText();
			txt_area.setText(texto);
		}
	}
	
	public static void main(String[] args) {
		EjemploGit g=new EjemploGit();
		g.setBounds(0, 0, 450, 500);
		g.setLocationRelativeTo(null);
		g.setTitle("ESTA VENTANA");
		g.setVisible(true);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
