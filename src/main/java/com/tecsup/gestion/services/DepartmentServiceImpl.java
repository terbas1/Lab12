package com.tecsup.gestion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;
import com.tecsup.gestion.repository.DepartmentDAO;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO DepartmentDAO;

	@Override
	public Department find(int department_id) throws DAOException, EmptyResultException {
		
		Department dep = DepartmentDAO.findDepartment(department_id);

		return dep;
	}

}
