package com.sw.re1.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class BankBookDAO {
	
	public List<BankBookDTO> getList() throws Exception{
		List<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);

		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from bankbook";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			
			st.setLong(1, bankBookDTO.getBookNumber());
			st.setString(2, bankBookDTO.getBookName());
			st.setDouble(3,bankBookDTO.getBookRate());
			st.setString(4, bankBookDTO.getBookSale());
			ar.add(bankBookDTO);
		}
		
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
	}
	
	
	
	
	
	public int setWrite(BankBookDTO bankBookDTO) throws Exception {
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);

		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "insert into bankbook values (bank_seq.nextval,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankBookDTO.getBookName());
		st.setDouble(2, bankBookDTO.getBookRate());
		st.setString(3, bankBookDTO.getBookSale());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
		
	}
	
	
	
	
	
	
	public BankBookDTO getSelect(BankBookDTO bankbookDTO) throws Exception{
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);

		Connection con = DriverManager.getConnection(url, user, password);
		String sql = "select * from bankbook where booknumber=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, bankbookDTO.getBookNumber());
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			bankbookDTO.setBookName(rs.getString("bookName"));
			bankbookDTO.setBookRate(rs.getDouble("bookRate"));
			bankbookDTO.setBookSale(rs.getString("bookSale"));
		}
		
		rs.close();
		st.close();
		con.close();
		
		return bankbookDTO;		
		}
	
	
	
	

}
