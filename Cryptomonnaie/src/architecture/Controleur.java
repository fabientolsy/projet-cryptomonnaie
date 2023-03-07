package architecture;

import vue.VueMirador;

public class Controleur {

	public static Vue selectionnerVuePrincipale()
	{
		return VueMirador.getInstance();
	}

	public void initialiser()
	{
	}

	public enum ActionNavigation { RETOUR };

	// le controleur decide de l'action selon evenement
	public void notifierEvenement(ActionNavigation action)
	{
		switch(action)
		{
			case RETOUR:
				Navigateur.getInstance().afficherVue(VueMirador.getInstance());
			break;
		}		
	}

}


