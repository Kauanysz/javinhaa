package View;
import javax.swing.JInternalFrame;
public abstract class InternaSom extends JInternalFrame{
	private int altura;
	private int largura;
	private int titulo;
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
	public int gettitulo() {
		return titulo;
	}
	public void settitulo(int titulo) {
		this.titulo = titulo;
	}
	public void inicializa() {
		this.setaltura(altura);
		this.setlargura(largura);
		this.setIconifiable(true);
		this.setClosable(true);
		this.setResizable(true);
		this.setSize(this.getaltura(), this.getlargura());
		this.setLayout(null);
	}
}
