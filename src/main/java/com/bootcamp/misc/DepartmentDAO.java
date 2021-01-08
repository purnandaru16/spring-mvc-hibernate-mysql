package com.bootcamp.misc;

import java.util.List;

/**
 * The Class DepartmentDAO
 *
 * @author Kris Sunu Purnandaru
 */
public interface DepartmentDAO {

    public void addDepartment(Department department);

    public List<Department> getAllDepartments();

    public void deleteDepartment(Integer departmentId);

    public Department updateDepartment(Department department);

    public Department getDepartment(int departmentId);
}
