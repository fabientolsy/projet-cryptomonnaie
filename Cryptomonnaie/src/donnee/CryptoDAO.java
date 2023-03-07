package donnee;


import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modele.Crypto;

public class CryptoDAO {

	public List<Float> listerCrypto() {
		List<Float> valeursCrypto = new ArrayList<Float>();
		
		String URL_BITCOIN = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=cad";
		String URL_TETHER= "https://api.coingecko.com/api/v3/simple/price?ids=tether&vs_currencies=cad";
		String URL_RIPPLE = "https://api.coingecko.com/api/v3/simple/price?ids=ripple&vs_currencies=cad";
		String URL_MONERO = "https://api.coingecko.com/api/v3/simple/price?ids=monero&vs_currencies=cad";

		String json = "";		

		
		try {
			
			// Telechargement donnees
			URL url = new URL( URL_BITCOIN );
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			json = new String(json.getBytes("UTF-8"), "ISO-8859-1");

			//Parsing
			JsonParser parseur = new JsonParser();
			JsonObject document = parseur.parse(json).getAsJsonObject();
			float valeurBitcoin = document.get("bitcoin").getAsJsonObject().get("cad").getAsFloat();
			System.out.println("bitcoin : " + valeurBitcoin);
			valeursCrypto.add(valeurBitcoin);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		try {
			
			// Telechargement donnees
			URL url = new URL( URL_TETHER );
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			json = new String(json.getBytes("UTF-8"), "ISO-8859-1");

			//Parsing
			JsonParser parseur = new JsonParser();
			JsonObject document = parseur.parse(json).getAsJsonObject();
			float valeurTether = document.get("tether").getAsJsonObject().get("cad").getAsFloat();
			System.out.println("tether : " + valeurTether);
			valeursCrypto.add(valeurTether);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			// Telechargement donnees
			URL url = new URL( URL_RIPPLE );
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			json = new String(json.getBytes("UTF-8"), "ISO-8859-1");
			
			//Parsing
			JsonParser parseur = new JsonParser();
			JsonObject document = parseur.parse(json).getAsJsonObject();
			float valeurRipple = document.get("ripple").getAsJsonObject().get("cad").getAsFloat();
			System.out.println("ripple : " + valeurRipple);
			valeursCrypto.add(valeurRipple);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			// Telechargement donnees
			URL url = new URL( URL_MONERO );
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			json = new String(json.getBytes("UTF-8"), "ISO-8859-1");
			
			//Parsing
			JsonParser parseur = new JsonParser();
			JsonObject document = parseur.parse(json).getAsJsonObject();
			float valeurMonero = document.get("monero").getAsJsonObject().get("cad").getAsFloat();
			System.out.println("monero : " + valeurMonero);
			valeursCrypto.add(valeurMonero);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		System.out.println(valeursCrypto);
		return valeursCrypto;
	}

	/*private String liensAPI.get(i)(int i) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
	
