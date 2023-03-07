package vue;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurMirador;
import javafx.scene.control.Label;
public class VueMirador extends Vue {

	protected ControleurMirador controleur;
	protected static VueMirador instance = null; 
	public static VueMirador getInstance() {if(null==instance)instance = new VueMirador();return VueMirador.instance;}; 
	
	private VueMirador() 
	{
		super("crypto.fxml");
		super.controleur = this.controleur = new ControleurMirador();
		Logger.logMsg(Logger.INFO, "new VueMirador()");
	}
		
	public void activerControles()
	{
		super.activerControles();

	}
	
	public void afficherValeurs(List<Float> valeursCrypto) {
		List <Float> valeurs = valeursCrypto;
		System.out.println("VueMirador.afficherValeurs()");
		Label vueValeurBitcoin = (Label) lookup("#valeur-bitcoin");
		Label vueValeurTether = (Label) lookup("#valeur-tether");
		Label vueValeurRipple = (Label) lookup("#valeur-ripple");
		Label vueValeurMonero = (Label) lookup("#valeur-monero");
		
		vueValeurBitcoin.setText( valeurs.get(0) + " $CAD");
		vueValeurTether.setText( valeurs.get(1) + " $CAD");
		vueValeurRipple.setText( valeurs.get(2) + " $CAD");
		vueValeurMonero.setText( valeurs.get(3) + " $CAD");
		

	}
}
