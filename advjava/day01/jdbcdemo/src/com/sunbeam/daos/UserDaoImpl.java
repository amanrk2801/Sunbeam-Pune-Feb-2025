package com.sunbeam.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sunbeam.entities.User;
import com.sunbeam.utils.DbUtil;

public class UserDaoImpl implements UserDao {
	private Connection con;
	private PreparedStatement pstmtFindByEmail;
	
	public UserDaoImpl() throws Exception {
		// create connection
		con = DbUtil.getConnection();
		// create statements
		pstmtFindByEmail = con.prepareStatement("SELECT * FROM users WHERE email = ?");
	}
	
	@Override
	public void close() throws Exception {
		// close statements
		if(pstmtFindByEmail != null)
			pstmtFindByEmail.close();
		// close connection
		if(con != null)
			con.close();
	}
	
	@Override
	public User findByEmail(String email) throws Exception {
		pstmtFindByEmail.setString(1, email);
		try(ResultSet rs = pstmtFindByEmail.executeQuery()) {
			if(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email2 = rs.getString("email");
				String password = rs.getString("password");;
				Date date = rs.getDate("dob");
				boolean status = rs.getBoolean("status");
				String role = rs.getString("role");;
				User u = new User(id, firstName, lastName, email2, password, date, status, role);
				return u;
			}
		} // rs.close();
		return null;
	}	
}
