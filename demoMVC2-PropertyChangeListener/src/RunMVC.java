//RunMVC.java
//(C) Joseph Mack 2011, jmack (at) wm7d (dot) net, released under GPL v3 (or any later version)

public class RunMVC {
	// a order de instanciacao dos objetos abaixo vai ser importante para alguns pares de comandos
	// isso nao foi explorado em nenhum detalhe, mas a ordem abaixo funciona

	private int start_value = 10;	//para incializar o modelo

	public RunMVC() {

		//cria o Modelo e a Visao
		Model myModel 	= new Model();
		View myView 	= new View();
		//View outraView 	= new View();
		OutraView outraView 	= new OutraView();

		//avisa o modelo que a visao existe 
		myModel.addPropertyChangeListener(myView);
		myModel.addPropertyChangeListener(outraView);

		Controller myController = new Controller();
		myController.addModel(myModel);
		//myController.addView(myView);
		//myController.addView(outraView);
		myController.initModel(start_value);

		//tell View about Controller 
		myView.addController(myController);
		outraView.addController(myController);
		

	} //RunMVC()

} //RunMVC
