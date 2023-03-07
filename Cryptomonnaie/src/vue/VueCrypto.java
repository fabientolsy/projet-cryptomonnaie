package vue;
import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurMirador;
public class VueCrypto extends Vue {

	protected ControleurMirador controleur;
	protected static VueCrypto instance = null; 
	public static VueCrypto getInstance() {if(null==instance)instance = new VueCrypto();return VueCrypto.instance;}; 
	
	private VueCrypto() 
	{
		super("crypto.fxml");
		super.controleur = this.controleur = new ControleurMirador();
		Logger.logMsg(Logger.INFO, "new VueMirador()");
	}
		
	public void activerControles()
	{
		super.activerControles();
	}
	
	public void afficherValeurs() {
		System.out.println("VueCrypto.afficherValeurs()");
	}
}
