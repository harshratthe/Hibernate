package model;

public class Lms {

           int userid;
           String name ;
           String email;
           String password ;
		
           public Lms() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Lms(int userid, String name, String email, String password) {
			super();
			this.userid = userid;
			this.name = name;
			this.email = email;
			this.password = password;
		}

		public int getUserid() {
			return userid;
		}

		public void setUserid(int userid) {
			this.userid = userid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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
           
           
           
           
	
	
}
