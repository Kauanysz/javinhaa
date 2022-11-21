package View;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
public abstract class JanelaSom extends JFrame implements ActionListener{
	private int altura;
	private int largura;
	private String titulo;
	
	public int getaltura() {
		return altura;
	}
	public void setaltura(int altura) {
		this.altura = altura;
	}
	public int getlargura() {
		return largura;
	}
	public void setlargura(int largura) {
		this.largura = largura;
	}
	public String gettitulo() {
		return titulo;
	}
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void inicializar() {
		this.setSize(this.getaltura(),this.getlargura());
		this.setTitle(this.gettitulo());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.repaint();
	}
}
