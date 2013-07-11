import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;


public class Main extends JFrame {

	private Object[][] data = {
			{"aaa","aaa"}
	};
	private String[] columnNames = {"Name","Address"};
	
	public Main(){
		JPanel panel = new JPanel();
		MigLayout layout = new MigLayout("","[grow]","[grow]");
		panel.setLayout(layout);
		
		panel.add(new JLabel("名前:"));
		panel.add(new JTextField(10),"wrap");
		panel.add(new JLabel("アドレス:"));
		panel.add(new JTextField(10),"wrap");
		
		panel.add(new JButton("送信"),"span,grow");

		JTable table = new JTable(data, columnNames);	
		panel.add(table,"span,grow");
		this.add(panel);

		

	}
	public static void main(String[] args) {
		JFrame frame = new Main();
		frame.setBounds(100,100,480,360);
		frame.setVisible(true);
	}
	

}
