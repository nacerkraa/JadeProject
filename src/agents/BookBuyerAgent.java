package agents;
import jade.core.Agent;
public class BookBuyerAgent extends Agent {
	
	private String livre;
	@Override
	protected void setup() {
	Object[]args=getArguments();
	if(args.length==1){ livre=(String) args[0];
	System.out.println("Salut l'acheteur :"
	+
	this.getAID().getName()+" est prêt \n je tente d'acheter le livre :"
	+livre);
	}
	
	else
	{
	System.out.println("il faut spécifier le livre comme argument");
	doDelete();
	} }
	
	@Override
	protected void takeDown() {
	System.out.println("Destruction de l'agent " + this.getAID().getName());
	}
}
