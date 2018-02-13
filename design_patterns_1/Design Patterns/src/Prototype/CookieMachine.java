package Prototype;

public class CookieMachine {
	private Cookie cookie; // aurait pu �tre "private Cloneable cookie;"

	public CookieMachine(Cookie cookie) {
		this.cookie = cookie;
	}

	public Cookie makeCookie() {
		return cookie.clone();
	}

	public static void main(String args[]) {
		Cookie tempCookie = null;
		Cookie prot = new CoconutCookie();
		CookieMachine cm = new CookieMachine(prot);
		for (int i = 0; i < 100; i++) {
			tempCookie = cm.makeCookie();
		}
	}
}
