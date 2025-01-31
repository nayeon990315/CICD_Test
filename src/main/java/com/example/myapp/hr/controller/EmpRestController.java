package com.example.myapp.hr.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.hr.model.Emp;
import com.example.myapp.hr.service.IEmpService;

@RestController
@RequestMapping("/api/emp")
public class EmpRestController {
	
	@Autowired
	IEmpService empService;
	
	// 전체 사원 수 출력
	@GetMapping("/count")
    public int empCount() {
        return empService.getEmpCount(); 
    }
	
	// 전체 사원 정보 출력
	@GetMapping("/list")
	public List<Emp> getAllEmps() {
		return empService.getEmpList();
	}

	// 특정 사원 정보 출력
    @GetMapping("/{employeeId}")
    public Map<String, Object> getEmpInfo(@PathVariable int employeeId) {
        return empService.getEmpInfo(employeeId); 
    }
    
    // 새로운 사원 정보 입력
    @PostMapping("/insert")
	public Emp insertEmp(@RequestBody Emp emp) {
		empService.insertEmp(emp);
		return emp;
	}
    
    // 사원 정보 수정
    @PutMapping("/update")
    public Emp updateEmp(@RequestBody Emp emp) {
    	empService.updateEmp(emp);
    	return emp;
    }
   
    // 사원 정보 삭제
    @DeleteMapping("/delete")
    public void deleteEmp(@RequestParam int employeeId, @RequestParam String email) {
        empService.deleteEmp(employeeId, email);
    }
}
