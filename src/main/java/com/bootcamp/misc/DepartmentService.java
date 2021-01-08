package com.bootcamp.misc;

import java.util.List;

public interface DepartmentService {
	
	void addDepartment(Department department);

	List<Department> getAllDepartments();

	void deleteDepartment(Integer departmentId);

	Department getDepartment(int departmentid);

	Department updateDepartment(Department department);
}
