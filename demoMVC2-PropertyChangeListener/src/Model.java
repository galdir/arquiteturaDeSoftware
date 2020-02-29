import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

//Model.java
//(C) Joseph Mack 2011, jmack (at) wm7d (dot) net, released under GPL v3 (or any later version)

//inspired by Joseph Bergin's MVC gui at http://csis.pace.edu/~bergin/mvc/mvcgui.html

//Model holds an int counter (that's all it is).
//Model is an Observable
//Model doesn't know about View or Controller

public class Model  {	
	
	private int counter;	//primitive, automatically initialised to 0
	private PropertyChangeSupport support;

	public Model(){

		System.out.println("Model()");
		support = new PropertyChangeSupport(this);	

	} //Model()

	
	public void setValue(int value) {

		support.firePropertyChange("counter", this.counter, value);
		this.counter = value;
		System.out.println("Model init: counter = " + counter);	

	} //setValue()
	
	public void incrementValue() {
		int c=counter+1;
		support.firePropertyChange("counter", this.counter, c);
		//++counter;
		counter=c;
		System.out.println("Model     : counter = " + counter);

	} //incrementValue()
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }
 
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
	
} //Model
