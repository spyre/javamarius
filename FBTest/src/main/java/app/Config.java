package app;

import java.net.MalformedURLException;
import java.net.URL;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Group;
import facebook4j.PostUpdate;
import facebook4j.PrivacyBuilder;
import facebook4j.PrivacyParameter;
import facebook4j.PrivacyType;
import facebook4j.conf.ConfigurationBuilder;

public class Config {

	public static Facebook configurateFB() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
				// .setOAuthAppId("130450263976037")
				.setOAuthAppId(ConfigREST.APPID)
				
				// .setOAuthAppSecret("cd6c24949f40e6048d7e50b5a5bb44a8")
				.setOAuthAppSecret(ConfigREST.MY_APP_SECRET)
				.setOAuthAccessToken(ConfigREST.MY_ACCESS_TOKEN)
				.setOAuthPermissions("publish_actions");
		FacebookFactory ff = new FacebookFactory(cb.build());
		Facebook facebook = ff.getInstance();
		return facebook;
	}
	
	public static String generateScript(){
		
		String script = "<script>"
				+ "var msg = 'test';"
				+ "alert(msg);"
				+ "</script>";
		return script;
	}

	public static void main(String[] args) throws FacebookException, MalformedURLException {
		System.out.println("START");
		Facebook fb = configurateFB();
//		String groupID = "600339749991037";
//		Group grup = fb.getGroup(groupID); // 423235984489653 // 198200520224963  // machete 600339749991037
//		System.out.println(grup.getDescription());
//		System.out.println(fb.getGroups());
//		URL url = new URL("http://www.emag.ro/welly-lamborghini-gallardo-lp560-4-1-24-wel-2446-lamborghinigallardo/pd/D3S9QBBBM/");


		
		PrivacyParameter privacy = new PrivacyBuilder().setValue(PrivacyType.ALL_FRIENDS).build();
		PostUpdate postUpdate = new PostUpdate(new URL("http://facebook4j.org"))
		    .picture(new URL("http://facebook4j.org/images/hero.png"))
		    .name("Facebook4J - A Java library for the Facebook Graph API")
		    .caption("facebook4j.org")
		    .description("Facebook4J is an unofficial library.")
		    .privacy(privacy);
		String postId = fb.postFeed(postUpdate);
		System.out.println("POST ID: " + postId);
		System.out.println(postUpdate);
		
		
		
		System.out.println("END");
		
		
//		System.out.println("TESTARE GRUPURI");
//		ResponseList<Group> grupuri = fb.getGroups();
//		System.out.println("GRUPURI: "+ grupuri);
//		Iterator<Group> iterator = grupuri.iterator();
//		while(iterator.hasNext()){
//			Group grupCurent = iterator.next();
//			System.out.println("GRUP: " + grupCurent.getDescription());
//		}
//		System.out.println(fb);
	}
}
