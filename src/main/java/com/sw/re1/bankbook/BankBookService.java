package com.sw.re1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public List<BankBookDTO> getList() throws Exception {
		List<BankBookDTO> dto = bankBookDAO.getList();
		return dto;
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) throws Exception {
		bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
		return bankBookDTO;
	}
	
	public int setAdd(BankBookDTO bankBookDTO) throws Exception {
		int result = bankBookDAO.setAdd(bankBookDTO);
		return result;
	}
	
	
	

}
