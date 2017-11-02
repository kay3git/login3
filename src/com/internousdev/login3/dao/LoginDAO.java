package com.internousdev.login3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login3.util.DBConnector;

public class LoginDAO {
//////////ＤＴＯ使うときはこの２行は不要
	public String username;
	public String password;
////////////////////////////////////////
	public boolean select(String username, String password){
		DBConnector db =new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from users where username=? and password =?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
//////////ＤＴＯ使うときはこの２行を書き換える
					this.username =username;
					this.password =password;
////////////////////////////////////////
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
//////////ＤＴＯ使うときはこの１行を書き換える
		return true;
////////////////////////////////////////
	}
}
