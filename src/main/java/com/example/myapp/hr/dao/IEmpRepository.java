package com.example.myapp.hr.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.myapp.hr.model.Emp;

@Mapper
@Repository
public interface IEmpRepository {
	int getEmpCount();
	Map<String, Object>	getEmpInfo(int empid);
	List<Emp> getEmpList();
	void insertEmp(Emp emp);
	void updateEmp(Emp emp);
	void deleteEmp(int empid, String email);
}
