package memento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestMemento extends JFrame {
	private CareTaker careTaker = new CareTaker();
	private Originator originator = new Originator();
	
	private JButton saveButton, undoButton, redoButton;
	private JTextArea theArticle = new JTextArea(15, 30);

	private int savedFiles = 0;
	private int currentArticle = 0;
	
	public TestMemento() {
		this.setSize(360, 350);
		this.setTitle("Memento design pattern");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("Article"));
		panel1.add(theArticle);
		
		ButtonListener saveListener = new ButtonListener();
		ButtonListener undoListener = new ButtonListener();
		ButtonListener redoListener = new ButtonListener();
		
		saveButton = new JButton("Save");
		saveButton.addActionListener(saveListener);
		
		undoButton = new JButton("Undo");
		undoButton.addActionListener(saveListener);
		
		redoButton = new JButton("Redo");
		redoButton.addActionListener(saveListener);
		
		panel1.add(saveButton);
		panel1.add(undoButton);
		panel1.add(redoButton);
		
		this.add(panel1);
		this.setVisible(true);
	}

	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == saveButton) {
				String textInTextArea = theArticle.getText();
				originator.setArticle(textInTextArea);
				careTaker.addMemento(originator.storeInMemento(textInTextArea));
				
				savedFiles++;
				currentArticle++;
				
				undoButton.setEnabled(true);
			} else {
				if (e.getSource() == undoButton) {
					if (currentArticle >= 1) {
						currentArticle--;
						String textBoxString = careTaker.getMemento(currentArticle).getArticle();
						theArticle.setText(textBoxString);
						redoButton.setEnabled(true);
					} else {
						undoButton.setEnabled(false);
					}
				} else if (e.getSource() == redoButton) {
					if ((savedFiles - 1) > currentArticle) {
						currentArticle++;
						String textBoxString = careTaker.getMemento(currentArticle).getArticle();
						theArticle.setText(textBoxString);
						undoButton.setEnabled(true);
					} else {
						redoButton.setEnabled(false);
					}
				}
			}

		}
		
	}
	
}
