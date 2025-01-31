package com.example.myapp.hr.service;

import java.util.List;
import java.util.Map;

import com.example.myapp.hr.model.Emp;

public interface IEmpService {
	int getEmpCount();
	Map<String, Object> getEmpInfo(int empid);
	List<Emp> getEmpList();
	void insertEmp(Emp emp);
	void updateEmp(Emp emp);
	void deleteEmp(int empid, String email);
}
