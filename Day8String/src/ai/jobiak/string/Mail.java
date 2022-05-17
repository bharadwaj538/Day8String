package ai.jobiak.string;

public class Mail {
	String id="create@gmail.com";
	String password="password@mail123";
	int idlength=id.length();
	int pwdlength=password.length();
	
	public void check() {
		if(idlength==pwdlength)
		{
			System.out.println("Login success");
		}
		else
		{
			System.out.println("login fail");
		}
	}
}
