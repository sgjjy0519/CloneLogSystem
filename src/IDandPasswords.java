import java.util.HashMap;

public class IDandPasswords {

	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPasswords(){
		
		logininfo.put("Jae", "water");
		logininfo.put("Jaeyeob", "PASSWORD");
		logininfo.put("Jeong", "abc123");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
