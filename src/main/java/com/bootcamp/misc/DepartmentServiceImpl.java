package com.bootcamp.misc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;

	@Override
	@Transactional
	public void addDepartment(Department department) {
		departmentDAO.addDepartment(department);
	}

	@Override
	@Transactional
	public List<Department> getAllDepartments() {
		return departmentDAO.getAllDepartments();
	}

	@Override
	@Transactional
	public void deleteDepartment(Integer departmentId) {
		departmentDAO.deleteDepartment(departmentId);
	}

	public Department getDepartment(int empid) {
		return departmentDAO.getDepartment(empid);
	}

	public Department updateDepartment(Department department) {
		return departmentDAO.updateDepartment(department);
	}

	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

}
