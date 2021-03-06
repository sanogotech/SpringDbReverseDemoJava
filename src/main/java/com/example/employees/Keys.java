/**
 * This class is generated by jOOQ
 */
package com.example.employees;


import com.example.employees.tables.Departments;
import com.example.employees.tables.DeptEmp;
import com.example.employees.tables.DeptManager;
import com.example.employees.tables.Employees;
import com.example.employees.tables.Salaries;
import com.example.employees.tables.Titles;
import com.example.employees.tables.records.DepartmentsRecord;
import com.example.employees.tables.records.DeptEmpRecord;
import com.example.employees.tables.records.DeptManagerRecord;
import com.example.employees.tables.records.EmployeesRecord;
import com.example.employees.tables.records.SalariesRecord;
import com.example.employees.tables.records.TitlesRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>employees</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<DepartmentsRecord> KEY_DEPARTMENTS_PRIMARY = UniqueKeys0.KEY_DEPARTMENTS_PRIMARY;
	public static final UniqueKey<DepartmentsRecord> KEY_DEPARTMENTS_DEPT_NAME = UniqueKeys0.KEY_DEPARTMENTS_DEPT_NAME;
	public static final UniqueKey<DeptEmpRecord> KEY_DEPT_EMP_PRIMARY = UniqueKeys0.KEY_DEPT_EMP_PRIMARY;
	public static final UniqueKey<DeptManagerRecord> KEY_DEPT_MANAGER_PRIMARY = UniqueKeys0.KEY_DEPT_MANAGER_PRIMARY;
	public static final UniqueKey<EmployeesRecord> KEY_EMPLOYEES_PRIMARY = UniqueKeys0.KEY_EMPLOYEES_PRIMARY;
	public static final UniqueKey<SalariesRecord> KEY_SALARIES_PRIMARY = UniqueKeys0.KEY_SALARIES_PRIMARY;
	public static final UniqueKey<TitlesRecord> KEY_TITLES_PRIMARY = UniqueKeys0.KEY_TITLES_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<DeptEmpRecord, EmployeesRecord> DEPT_EMP_IBFK_1 = ForeignKeys0.DEPT_EMP_IBFK_1;
	public static final ForeignKey<DeptEmpRecord, DepartmentsRecord> DEPT_EMP_IBFK_2 = ForeignKeys0.DEPT_EMP_IBFK_2;
	public static final ForeignKey<DeptManagerRecord, DepartmentsRecord> DEPT_MANAGER_IBFK_2 = ForeignKeys0.DEPT_MANAGER_IBFK_2;
	public static final ForeignKey<DeptManagerRecord, EmployeesRecord> DEPT_MANAGER_IBFK_1 = ForeignKeys0.DEPT_MANAGER_IBFK_1;
	public static final ForeignKey<SalariesRecord, EmployeesRecord> SALARIES_IBFK_1 = ForeignKeys0.SALARIES_IBFK_1;
	public static final ForeignKey<TitlesRecord, EmployeesRecord> TITLES_IBFK_1 = ForeignKeys0.TITLES_IBFK_1;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<DepartmentsRecord> KEY_DEPARTMENTS_PRIMARY = createUniqueKey(Departments.DEPARTMENTS, Departments.DEPARTMENTS.DEPT_NO);
		public static final UniqueKey<DepartmentsRecord> KEY_DEPARTMENTS_DEPT_NAME = createUniqueKey(Departments.DEPARTMENTS, Departments.DEPARTMENTS.DEPT_NAME);
		public static final UniqueKey<DeptEmpRecord> KEY_DEPT_EMP_PRIMARY = createUniqueKey(DeptEmp.DEPT_EMP, DeptEmp.DEPT_EMP.EMP_NO, DeptEmp.DEPT_EMP.DEPT_NO);
		public static final UniqueKey<DeptManagerRecord> KEY_DEPT_MANAGER_PRIMARY = createUniqueKey(DeptManager.DEPT_MANAGER, DeptManager.DEPT_MANAGER.EMP_NO, DeptManager.DEPT_MANAGER.DEPT_NO);
		public static final UniqueKey<EmployeesRecord> KEY_EMPLOYEES_PRIMARY = createUniqueKey(Employees.EMPLOYEES, Employees.EMPLOYEES.EMP_NO);
		public static final UniqueKey<SalariesRecord> KEY_SALARIES_PRIMARY = createUniqueKey(Salaries.SALARIES, Salaries.SALARIES.EMP_NO, Salaries.SALARIES.FROM_DATE);
		public static final UniqueKey<TitlesRecord> KEY_TITLES_PRIMARY = createUniqueKey(Titles.TITLES, Titles.TITLES.EMP_NO, Titles.TITLES.TITLE, Titles.TITLES.FROM_DATE);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<DeptEmpRecord, EmployeesRecord> DEPT_EMP_IBFK_1 = createForeignKey(com.example.employees.Keys.KEY_EMPLOYEES_PRIMARY, DeptEmp.DEPT_EMP, DeptEmp.DEPT_EMP.EMP_NO);
		public static final ForeignKey<DeptEmpRecord, DepartmentsRecord> DEPT_EMP_IBFK_2 = createForeignKey(com.example.employees.Keys.KEY_DEPARTMENTS_PRIMARY, DeptEmp.DEPT_EMP, DeptEmp.DEPT_EMP.DEPT_NO);
		public static final ForeignKey<DeptManagerRecord, DepartmentsRecord> DEPT_MANAGER_IBFK_2 = createForeignKey(com.example.employees.Keys.KEY_DEPARTMENTS_PRIMARY, DeptManager.DEPT_MANAGER, DeptManager.DEPT_MANAGER.DEPT_NO);
		public static final ForeignKey<DeptManagerRecord, EmployeesRecord> DEPT_MANAGER_IBFK_1 = createForeignKey(com.example.employees.Keys.KEY_EMPLOYEES_PRIMARY, DeptManager.DEPT_MANAGER, DeptManager.DEPT_MANAGER.EMP_NO);
		public static final ForeignKey<SalariesRecord, EmployeesRecord> SALARIES_IBFK_1 = createForeignKey(com.example.employees.Keys.KEY_EMPLOYEES_PRIMARY, Salaries.SALARIES, Salaries.SALARIES.EMP_NO);
		public static final ForeignKey<TitlesRecord, EmployeesRecord> TITLES_IBFK_1 = createForeignKey(com.example.employees.Keys.KEY_EMPLOYEES_PRIMARY, Titles.TITLES, Titles.TITLES.EMP_NO);
	}
}
