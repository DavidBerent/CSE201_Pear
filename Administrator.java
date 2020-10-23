
public class Administrator extends Moderator {
		
	public Administrator(String username, String password, String email) {
		super(username,password,email);
		this.username = username;
		this.password = password;
		this.email = email;
		this.ID = 2;
	
	}
	
	/*
	* the user is approved to submit their app
	* param @r - the request that is used to make sure the person can post their app
	*/
	public boolean approveForm(Request r) {
		return false;
	}
	
	/*
	* the user is not authorized to post their app
	* param @r - the request that is used to make sure the person can post their app
	*/
	public boolean rejectForm(Request r) {
		return false;
		
	}
	

}
