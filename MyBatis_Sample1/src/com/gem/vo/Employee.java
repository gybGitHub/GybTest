package com.gem.vo;


/**
 * 员工类
 * 
 * @author ybgong
 *
 */
public class Employee {
	private String empId;
	private String empPassword;
	private String empName;
	private String gender;
	private String birthDate;
	private String empPic;
	private int deptId;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmpPic() {
		return empPic;
	}

	public void setEmpPic(String empPic) {
		this.empPic = empPic;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Employee() {
	}


	public Employee(String empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public Employee(String empId, String empName, String gender, String birthDate, String empPic,
			int deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.empPic = empPic;
		this.deptId = deptId;
	}

	public Employee(String empId, String empPassword, String empName, String gender, String birthDate, String empPic,
			int deptId) {
		super();
		this.empId = empId;
		this.empPassword = empPassword;
		this.empName = empName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.empPic = empPic;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empPassword=" + empPassword + ", empName=" + empName + ", gender="
				+ gender + ", birthDate=" + birthDate + ", empPic=" + empPic + ", deptId=" + deptId + "]";
	}

}
