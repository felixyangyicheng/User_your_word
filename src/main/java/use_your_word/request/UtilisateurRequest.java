package use_your_word.request;

public class UtilisateurRequest {

	private int id;
	private String username;
	private DemoRequest demo;
	public DemoRequest getDemo() {
		return demo;
	}
	public void setDemo(DemoRequest demo) {
		this.demo = demo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
