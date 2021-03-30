
public class Main {

	public static void main(String[] args) {
		
		IDandPasswords idandPasswords = new IDandPasswords();  // IDandPasswords객체 생성
		
		
		
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());  // LoginPage 객체 생성
	}

}
