package dao;

import model.Lms;

public interface Lmsdao {

	
	public void Signup(Lms l);
	public void ForgotPwd(int userid , String email);
	public void Signin(int userid , String password);
	public void ListAllUsers();
	
}
