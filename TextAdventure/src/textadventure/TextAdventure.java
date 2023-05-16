package textadventure;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextAdventure extends JFrame{

	private JPanel imgPanel, textPanel, buttonPanel;
	private JLabel image, textContent;
	private JButton buttonOne, buttonTwo, buttonThree, buttonFour;
	private boolean rope = false;
	
	class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("beach")) {
				Beach();
			}
			if(e.getActionCommand().equals("exploreBeach")) {
				ExploreBeach();
			}
			if(e.getActionCommand().equals("shells")) {
				Shells();
			}
			if(e.getActionCommand().equals("raft")) {
				Raft();
			}
			if(e.getActionCommand().equals("hammock")) {
				Hammock();
			}
			if(e.getActionCommand().equals("mountain")) {
				Mountains();
			}
			if(e.getActionCommand().equals("climb")) {
				Climb();
			}
			if(e.getActionCommand().equals("jungle")) {
				Jungle();
			}
			if(e.getActionCommand().equals("rope")) {
				Rope();
			}
			if(e.getActionCommand().equals("end")) {
				End();
			}
			
		}
		
	}
	
	public TextAdventure(String title) {
		super(title);
		
		setLayout(new GridLayout(3,1));	
		
		initGUI();
					
		
		setSize(800, 600);
		setResizable(false);
		this.getContentPane().setBackground(new Color(91, 152, 223));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public void initGUI() {
		
		Listener listener = new Listener();
		
		imgPanel = new JPanel();
		imgPanel.setBackground(new Color(49, 117, 67));
		
		image = new JLabel();
		image.setIcon( new ImageIcon(new ImageIcon("icons/maha.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		imgPanel.add(image);
		
		textPanel = new JPanel();
		textPanel.setBackground(new Color(49, 117, 67));
		
		textContent = new JLabel();
		textContent.setText("Your Adenture begins. Where do you want to start?");
		textContent.setFont(new Font("Arial", Font.PLAIN, 22));
		textContent.setForeground(Color.white);
		
		textPanel.add(textContent);
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(49, 117, 67));
		
		buttonOne = new JButton("Beach");
		buttonOne.addActionListener(listener);
		buttonOne.setActionCommand("beach");
		buttonOne.setForeground(new Color(49, 117, 67));
		buttonOne.setBackground(Color.white);
		buttonOne.setBorderPainted(false);
		buttonOne.setFocusPainted(false);
		
		buttonTwo = new JButton("Mountains");
		buttonTwo.addActionListener(listener);
		buttonTwo.setActionCommand("mountain");
		buttonTwo.setForeground(new Color(49, 117, 67));
		buttonTwo.setBackground(Color.white);
		buttonTwo.setBorderPainted(false);
		buttonTwo.setFocusPainted(false);
		
		buttonThree = new JButton("Jungle");
		buttonThree.addActionListener(listener);
		buttonThree.setActionCommand("jungle");
		buttonThree.setForeground(new Color(49, 117, 67));
		buttonThree.setBackground(Color.white);
		buttonThree.setBorderPainted(false);
		buttonThree.setFocusPainted(false);
		
		buttonFour = new JButton("Home");
		buttonFour.addActionListener(listener);
		buttonFour.setActionCommand("end");
		buttonFour.setForeground(new Color(49, 117, 67));
		buttonFour.setBackground(Color.white);
		buttonFour.setBorderPainted(false);
		buttonFour.setFocusPainted(false);
		
		buttonPanel.add(buttonOne);
		buttonPanel.add(buttonTwo);
		buttonPanel.add(buttonThree);
		buttonPanel.add(buttonFour);
		
		
		add(imgPanel);
		add(textPanel);
		add(buttonPanel);
		
	}
	public void Beach() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/beach.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		textContent.setText("you are at the beach. What do you do?");
		buttonOne.setText("Go to the Mountains");
		buttonOne.setActionCommand("mountain");
		
		buttonTwo.setText("Go inside the jungle");
		buttonTwo.setActionCommand("jungle");
		
		buttonThree.setText("Explore the beach");
		buttonThree.setActionCommand("exploreBeach");
		
		buttonFour.setText("leave");
		buttonFour.setActionCommand("end");
	}
	public void ExploreBeach() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/beach.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		textContent.setText("You are exploring the beach. What did you find?");
		buttonOne.setText("Shells");
		buttonOne.setActionCommand("shells");
		
		buttonTwo.setText("a raft");
		buttonTwo.setActionCommand("raft");
		
		buttonThree.setText("a hammock");
		buttonThree.setActionCommand("hammock");
		
		buttonFour.setText("leave");
		buttonFour.setActionCommand("end");
	}
	public void Shells() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/beach.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		textContent.setText("You found some shells. What do you do?");
		buttonOne.setText("collect them");
		buttonOne.setActionCommand("beach");
		
		buttonTwo.setText("leave them and head to the mountains");
		buttonTwo.setActionCommand("mountain");
		
		buttonThree.setText("leave them and head to the jungle");
		buttonThree.setActionCommand("jungle");
		
		buttonFour.setText("leave");
		buttonFour.setActionCommand("end");
	}
	public void Raft() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/ocean.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		textContent.setText("You found a raft. Do you leave the island on the raft or explore...");
		buttonOne.setText("the Mountains");
		buttonOne.setActionCommand("mountain");
		
		buttonTwo.setText("the jungle");
		buttonTwo.setActionCommand("jungle");
		
		buttonThree.setText("more of the beach");
		buttonThree.setActionCommand("beach");
		
		buttonFour.setText("leave");
		buttonFour.setActionCommand("end");
	}
	public void Hammock() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/beach.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		textContent.setText("You take a nap. When you wake up you decide to explore...");
		buttonOne.setText("the Mountains");
		buttonOne.setActionCommand("mountain");
		
		buttonTwo.setText("the jungle");
		buttonTwo.setActionCommand("jungle");
		
		buttonThree.setText("more of the beach");
		buttonThree.setActionCommand("exploreBeach");
		
		buttonFour.setText("nothing");
		buttonFour.setActionCommand("end");
	}
	public void Mountains() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/climb.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
		
		textContent.setText("you are at the mountains. What do you do?");
		buttonOne.setText("climb");
		buttonOne.setActionCommand("climb");
		
		buttonTwo.setText("go to the beach");
		buttonTwo.setActionCommand("beach");
		
		buttonThree.setText("go to the jungle");
		buttonThree.setActionCommand("jungle");
		
		buttonFour.setText("leave");
		buttonFour.setActionCommand("end");
	}
	public void Climb() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/climb.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		if(rope == true) {
			image.setIcon( new ImageIcon(new ImageIcon("icons/ausbeach.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

			textContent.setText("you climb up the mountain and reach the top. Adventure continues...");
			buttonOne.setVisible(false);
			buttonTwo.setVisible(false);
			buttonThree.setVisible(false);
			buttonFour.setVisible(false);
		}else {
			textContent.setText("you need a rope");
			
			buttonOne.setText("go to the beach");
			buttonOne.setActionCommand("beach");
			
			buttonTwo.setText("go to the jungle");
			buttonTwo.setActionCommand("jungle");
			
			buttonThree.setText("leave");
			buttonThree.setActionCommand("end");
			
			buttonFour.setVisible(false);
		}
	}
	public void Jungle() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/jungle.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		textContent.setText("you are inside the jungle");
		buttonOne.setText("you explore and find a rope");
		buttonOne.setActionCommand("rope");
		
		buttonTwo.setText("go to the beach");
		buttonTwo.setActionCommand("beach");
		
		buttonThree.setText("go to the mountains");
		buttonThree.setActionCommand("mountain");
		
		buttonFour.setText("leave");
		buttonFour.setActionCommand("end");
	}
	public void Rope() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/jungle.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		rope = true;
		textContent.setText("you found a rope. what do you do next?");
		buttonOne.setText("go to the mountains");
		buttonOne.setActionCommand("mountain");
		
		buttonTwo.setText("go to the beach");
		buttonTwo.setActionCommand("beach");
		
		buttonThree.setText("stay inside the jungle");
		buttonThree.setActionCommand("jungle");
		
		buttonFour.setText("leave");
		buttonFour.setActionCommand("end");
	}
	public void End() {
		image.setIcon( new ImageIcon(new ImageIcon("icons/maha.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));

		textContent.setText("You are back home. See you at the next Adventure");
		buttonOne.setVisible(false);
		buttonTwo.setVisible(false);
		buttonThree.setVisible(false);
		buttonFour.setVisible(false);
	}
}
