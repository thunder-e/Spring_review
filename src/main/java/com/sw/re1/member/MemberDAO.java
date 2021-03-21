package com.sw.re1.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		
		//1. 로그인 
		String user = "user01";
		String password =  "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
	
		//2. 클래스 로딩
		Class.forName(driver);
		
		//3. 로그인 connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		//4. sql문 작성
		String sql = "insert into member values (?,?,?,?,?)";
		
		//5. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//6. ? 처리
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		st.setString(3, memberDTO.getName());
		st.setString(4, memberDTO.getPhone());
		st.setString(5, memberDTO.getEmail());
		
		//7. 최종전송 및 처리
		int result = st.executeUpdate();
		
	
		//8. 연결 해제 
		st.close();
		con.close();
		
		return result;
	}
	
	
	
	public MemberDTO login(MemberDTO memberDTO) throws Exception{
		
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from member where id = ? and pw =?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			memberDTO.setName(rs.getString("name"));
			memberDTO.setPhone(rs.getString("phone"));
			memberDTO.setEmail(rs.getString("email"));
		} else {
			memberDTO = null;
		}
		
		rs.close();
		st.close();
		con.close();
		
		
		return memberDTO;
	}
	
	
	
	
	
	
	
	
	

}
