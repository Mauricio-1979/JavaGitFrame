package base;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EjemploGit extends JFrame{
	
	JLabel titulo, nombre, telefono;
	
	JTextField txt_nombre, txt_telefono; 
	
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
		
	}
	
	public static void main(String[] args) {
		EjemploGit g=new EjemploGit();
		g.setBounds(0, 0, 450, 400);
		g.setLocationRelativeTo(null);
		g.setTitle("ESTA VENTANA");
		g.setVisible(true);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
