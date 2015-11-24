package app;

import java.net.MalformedURLException;
import java.net.URL;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Group;
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

	public static void main(String[] args) throws FacebookException, MalformedURLException {
		System.out.println("START");
		Facebook fb = configurateFB();
		String groupID = "600339749991037";
		Group grup = fb.getGroup(groupID); // 423235984489653 // 198200520224963  // machete 600339749991037
		System.out.println(grup.getDescription());
		System.out.println(fb.getGroups());
		URL url = new URL("http://www.emag.ro/welly-lamborghini-gallardo-lp560-4-1-24-wel-2446-lamborghinigallardo/pd/D3S9QBBBM/");
		fb.postGroupLink(groupID, url);
		
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
