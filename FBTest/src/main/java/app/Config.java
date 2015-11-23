package app;

import java.net.MalformedURLException;
import java.util.Iterator;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Group;
import facebook4j.ResponseList;
import facebook4j.conf.ConfigurationBuilder;

public class Config {

	public static Facebook configurateFB() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthAppId("130450263976037").setOAuthAppSecret("cd6c24949f40e6048d7e50b5a5bb44a8")
				.setOAuthAccessToken(
						"CAACEdEose0cBAGUuYiAvh9ZCKYzVHGYLRdqoEZBtsm7hmJrYnNnlGortasGJtmlNwcagWyCol69vZAHOdBgTuK0g15tZCcZCZALfQwuGPWUE0WVYYIzPkjrUMSQAu3DpKAV0seJLJ0ZCd98y2ZA6GFoERKxaRMDNDgpo0jIlxZB3PPBn5JFtaEi2RE9IvijOdnp20eBRr7IyppwZDZD")
				.setOAuthPermissions("publish_actions");
		FacebookFactory ff = new FacebookFactory(cb.build());
		Facebook facebook = ff.getInstance();
		return facebook;
	}

	public static void main(String[] args) throws FacebookException, MalformedURLException {
		System.out.println("START");
		Facebook fb = configurateFB();
//		Group grup = fb.getGroup("198200520224963");
//		System.out.println(grup.getDescription());
//		System.out.println(fb.getGroups());
//		URL url = new URL("http://www.google.com");
//		fb.postGroupLink("198200520224963", url);
		System.out.println("TESTARE GRUPURI");
		ResponseList<Group> grupuri = fb.getGroups();
		System.out.println("GRUPURI: "+ grupuri);
		Iterator<Group> iterator = grupuri.iterator();
		while(iterator.hasNext()){
			Group grupCurent = iterator.next();
			System.out.println("GRUP: " + grupCurent.getDescription());
		}
		System.out.println(fb);
	}
}
