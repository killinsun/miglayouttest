import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;


public class Main extends JFrame implements MouseListener {
	private JTextField nameField = new JTextField();
	private JTextField addressField = new JTextField();

	private String[] columnNames = {"Name","Address"};
	private DefaultTableModel dModel = new DefaultTableModel(columnNames,0);
	
	public Main(){
		JPanel panel = new JPanel();
		MigLayout layout = new MigLayout("","[grow]","[grow]");
		panel.setLayout(layout);
		
		panel.add(new JLabel("名前:"),"c,r");
		panel.add(nameField,"grow,wrap");
		panel.add(new JLabel("アドレス:"),"c,r");
		panel.add(addressField,"grow,wrap");
		
		JButton send = new JButton("送信");
		send.addMouseListener(this);
		panel.add(send,"span,grow");
		
		
		JTable table = new JTable(dModel);	
		JScrollPane sp = new JScrollPane(table);
		sp.setPreferredSize(new Dimension(250, 70));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.add(sp,"span,grow,h 200");
		this.add(panel);
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new Main();
		frame.setBounds(100,100,480,360);
		frame.setVisible(true);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(nameField.getText().equals("") || addressField.getText().equals("")){
			JFrame errorFrame = new JFrame();
			errorFrame.setTitle("error!");
			JOptionPane.showMessageDialog(errorFrame,"Please input text field.");
		}
		String[] Data = {nameField.getText(),addressField.getText()};
		int rowCount = dModel.getRowCount();
		dModel.insertRow(rowCount,Data);
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
