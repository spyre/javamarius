package app;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;

public class ConfigREST {
	
	public static final String MY_ACCESS_TOKEN = "CAACEdEose0cBAMM3CaJJALexbGVOMvANLT37sxlBEUjyrap3N6wAz0VrJSsxWcUY8KMuDI7MKEiZAvM5yRYGr6zrX6oL8Rpqs0wNK10fF9acDOQF4CZCRudOm9mbsW9VbZCI4MFcdG5KPrZAJXonEoBnXOjwRUfKDhrpYfylTJHGUfqWOnhSOONN4E1zvir3ZBF5Jknx7jQZDZD";
	public static final String MY_APP_SECRET = "c5e7b84fd6da01a7ae7a4853adaea728";
	public static final String APPID = "1675676639370710";
	
	public static String extendToken(String token){
			
		FacebookClient facebookClient = new DefaultFacebookClient(token);
		AccessToken extendedAccessToken = facebookClient.obtainExtendedAccessToken(APPID, MY_APP_SECRET, token);
		return extendedAccessToken.getAccessToken();
		
	}
	
	public static void main(String[] args) {

		String tokenNou = extendToken(MY_ACCESS_TOKEN);
		System.out.println("Token nou = " + tokenNou);
		
		FacebookClient facebookClient = new DefaultFacebookClient(MY_ACCESS_TOKEN, MY_APP_SECRET);
	}
}
