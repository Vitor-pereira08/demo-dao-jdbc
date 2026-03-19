package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department department = departmentDao.findById(3);

        System.out.println("=== TEST 1: department findByid ===");
        System.out.println(department);
    }
}
