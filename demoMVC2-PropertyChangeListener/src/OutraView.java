import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

class OutraView implements PropertyChangeListener {

	//attributes as must be visible within class
	private TextField myTextField;
	private JLabel rotulo;
	private Button button; 

	OutraView() {
		System.out.println("View()");	
		
		//frame in constructor and not an attribute as doesn't need to be visible to whole class
		Frame frame 		= new Frame("MVC Simples");
		frame.add("North", new Label("contador"));

		rotulo=new JLabel();
        rotulo.setHorizontalAlignment(JLabel.CENTER);
		frame.add(rotulo);
		
		//myTextField 		= new TextField();
		//frame.add("Center", myTextField);

		//panel in constructor and not an attribute as doesn't need to be visible to whole class
		Panel panel 		= new Panel();
		button	 		= new Button("Me aperte!");
		panel.add(button);
		frame.add("South", panel);		

		frame.addWindowListener(new CloseListener());	
		frame.setSize(400,200);
		frame.setLocation(100,100);
		frame.setVisible(true);

	} 

	
	public void addController(ActionListener controller){
		System.out.println("View      : adding controller");
		button.addActionListener(controller);	//need instance of controller before can add it as a listener 
	} //addController()

	//to initialise TextField
	public void setValue(int v){
    	//myTextField.setText("" + v);
		rotulo.setText("" + v);
		
	} //setValue()
    	
	
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} //windowClosing()
	} //CloseListener

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		
		this.setValue((int) evt.getNewValue());
		
	}

} //View
