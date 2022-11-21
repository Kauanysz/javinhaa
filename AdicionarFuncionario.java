package View;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
public class AdicionarFuncionario extends InternaSom{
	private JLabel lblTitulo;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JButton butSalvar;
	public void inicializa() {
		lblTitulo = new JLabel("Cadastro de Funcionários");
		lblTitulo.setBounds(10,10,400,60);
		lblNome = new JLabel("Nome");
		lblNome.setBounds(10,50,50,60);
		txtNome = new JTextField();
		txtNome.setBounds(60,70,200,20);
		lblCpf = new JLabel("Cpf");
		lblCpf.setBounds(10,80,50,50);
		txtCpf = new JTextField();
		txtCpf.setBounds(60,100,200,20);
		butSalvar = new JButton("Salvar");
		butSalvar.setBounds(150,200,100,20);
		this.add(lblTitulo);
		this.add(lblNome);
		this.add(txtNome);
		this.add(lblCpf);
		this.add(txtCpf);
		this.add(butSalvar);
	}
		public AdicionarFuncionario(int altura, int largura, String titulo) {
			this.setaltura(altura);
			this.setlargura(largura);
			this.setTitle(titulo);
			this.inicializa();
			
		}
		

}
