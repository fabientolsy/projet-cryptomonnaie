package controleur;

import donnee.CryptoDAO;
import modele.Crypto;
import vue.VueCrypto;
import vue.VueMirador;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;

public class ControleurMirador extends Controleur{

	public ControleurMirador()
	{
		Logger.logMsg(Logger.INFO, "new ControleurMirador()");
	}
	
	public void initialiser() {
		System.out.println("ControleurMirador.initialiser()");
		CryptoDAO crypto = new CryptoDAO();
		List<Float> valeursCrypto = crypto.listerCrypto();
		VueMirador.getInstance().afficherValeurs(valeursCrypto);
	}

}
