package com.example.myapp.hr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.hr.dao.IEmpRepository;
import com.example.myapp.hr.model.Emp;

@Service
public class EmpService implements IEmpService {

	@Autowired
	IEmpRepository empRepository;
	
	@Override
	public int getEmpCount() {
		return empRepository.getEmpCount();
	}

	@Override
	public Map<String, Object> getEmpInfo(int empid) {
		return empRepository.getEmpInfo(empid);
	}

	@Override
	public List<Emp> getEmpList() {
		return empRepository.getEmpList();
	}
	
	@Override
	public void insertEmp(Emp emp) {
		empRepository.insertEmp(emp);
	}

	@Override
	public void updateEmp(Emp emp) {
		empRepository.updateEmp(emp);
		
	}

	@Override
	public void deleteEmp(int empid, String email) {
		empRepository.deleteEmp(empid, email);
	}

}
