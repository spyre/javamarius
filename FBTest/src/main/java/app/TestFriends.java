package app;

import java.util.Iterator;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Friend;
import facebook4j.Friendlist;
import facebook4j.ResponseList;
import facebook4j.conf.ConfigurationBuilder;

public class TestFriends {


	public static Facebook configurateFB() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
				// .setOAuthAppId("130450263976037")
				.setOAuthAppId(ConfiguratieGlobala.APPID)
				
				// .setOAuthAppSecret("cd6c24949f40e6048d7e50b5a5bb44a8")
				.setOAuthAppSecret(ConfiguratieGlobala.MY_APP_SECRET)
				.setOAuthAccessToken(ConfiguratieGlobala.MY_ACCESS_TOKEN)
				.setOAuthPermissions("publish_actions");
		FacebookFactory ff = new FacebookFactory(cb.build());
		Facebook facebook = ff.getInstance();
		return facebook;
	}
	
	public static void main(String[] args) throws FacebookException {
		
		System.out.println("START");
		Facebook fb = configurateFB();
		ResponseList<Friend> friends = fb.getFriends();
		// fb.getFriends("");
		System.out.println(friends.size());
		System.out.println(friends);
		Iterator<Friend> i = friends.iterator();
		while(i.hasNext()){
			Friend prieten = i.next();
			
			System.out.println("NUME PRIETEN: " + prieten.getName());
		}
		
//		ResponseList<Friendlist> friends2 = fb.getFriendlists();
//		Iterator<Friendlist> i2 = friends2.iterator();
//		while(i2.hasNext()){
//			Friendlist listaPrieteni = i2.next();
//			System.out.println("LISTA PRIETENI: "+ listaPrieteni);
//			
//		}
		
		
		System.out.println("END");
	}
}
