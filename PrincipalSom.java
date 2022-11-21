package View;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.text.AttributeSet.ColorAttribute;
public class PrincipalSom extends JanelaSom{
	private JMenuBar menuBar;
	private JMenu menu;
	private JDesktopPane painel;
	private JMenuItem menuItem;
	public PrincipalSom (int altura, int largura, String titulo) {
		this.setaltura(altura);
		this.setlargura(largura);
		this.setTitle(titulo);
		this.setLayout(null);
		this.setinicializador();
		this.setVisible(true);
	}
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = PrincipalSom.class.getResource(path);
	if(imgURL != null) {
		return new ImageIcon(imgURL);
	}else{
		System.out.println("Arquivo não encontrado: "+path);
		return null;
		}
	}
	public void gerarMenu() {
		menuBar= new JMenuBar();
		menu = new JMenu("Usuarios");
		menu.setMnemonic(KeyEvent.VK_U);
		menu.getAccessibleContext().setAccessibleDescription("Gerenciar");
		menuBar.add(menu);
		menuItem = new JMenuItem("Cadastro",KeyEvent.VK_C);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menu.getAccessibleContext().setAccessibleDescription("Cadastrar Usuários");
		menuItem.setActionCommand("Adicionar");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menu.addSeparator();
		ImageIcon icone = createImageIcon("./assets/som.png");
		menuItem = new JMenuItem("Buscar" , icone);
		menu.setMnemonic(KeyEvent.VK_B);
		menuItem.getAccessibleContext().setAccessibleDescription("Buscar Usuários");
		menu.add(menuItem);
		this.setJMenuBar(menuBar);
		
	}
	
	private void setinicializador() {
		painel = new JDesktopPane();
		painel.setBackground(Color.LIGHT_GRAY);
		setContentPane(painel);
		this.gerarMenu();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Adicionar") {
			AdicionarFuncionario AdicionarFuncionario = new AdicionarFuncionario(640, 480,"Cadastrar Funcionario");
			painel.add(AdicionarFuncionario);
			AdicionarFuncionario.setVisible(true);
		}
		
	}

}
