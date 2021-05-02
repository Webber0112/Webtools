package view;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame {
	private JFrame frame;
	private JButton btn, netflixBtn;
	
	public View() {
		init();
	}

	private void init() {
		frame = new JFrame();
		frame.setLayout(null);
		
		btn = new JButton("Youtube");
		btn.setBounds(58, 30, 80, 50);
		// btn.setPreferredSize(new Dimension(50, 80));
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://youtube.com"));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		
		netflixBtn = new JButton("NetFlix");
		netflixBtn.setBounds(145, 30, 80, 50);
		netflixBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://netflix.com"));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		
		frame.add(btn);
		frame.add(netflixBtn);
		frame.setTitle("Webtools");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
