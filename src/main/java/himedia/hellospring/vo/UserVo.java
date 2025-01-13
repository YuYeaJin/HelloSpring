package himedia.hellospring.vo;

public class UserVo {
	private Long no;
	private String nema;
	private String email;
	private String password;
	private String gender;
	
	public UserVo() {
		
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getNema() {
		return nema;
	}

	public void setNema(String nema) {
		this.nema = nema;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserVo [no=" + no + ", nema=" + nema + ", email=" + email + ", password=" + password + ", gender="
				+ gender + "]";
	}

}
