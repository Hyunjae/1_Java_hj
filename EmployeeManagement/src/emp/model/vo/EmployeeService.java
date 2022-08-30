package emp.model.vo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	private List<Employee> empList = new ArrayList<Employee>();

	public EmployeeService() {
		
		empList.add(new Employee(1, "홍길동", "800101-1010100", "hkd@naver.com", "010-5050-4040", "총무부", "과장", 3000000));
		empList.add(new Employee(2, "김미자", "760215-2010100", "hmj@naver.com", "010-2222-3333", "마케팅부", "부장", 4000000));
		empList.add(new Employee(3, "이길원", "920701-1030303", "lkw@naver.com", "010-1414-5151", "개발부", "사원", 2000000));

	}

	
	/** 1. 새로운 사원 정보 추가
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return true : 사원 정보 추가
	 * 			false : 사원 정보 추가 못함
	 */
	public boolean addEmployee(int empId, String empName, String empNo, 
			String email, String phone, String departmentTitle,
			String jobName, int salary) {
		
		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
	
		empList.add(emp);
		
		return true;
	}
	
	/** 2. 전체 사원 정보 조회
	 * @return empList
	 */
	public List<Employee> getEmployeeList() {
		return empList;
	}
	
	
	/** 3. 사번이 일치하는 사원 정보 조회
	 * @param id
	 * @return
	 */
	public List<Employee> searchEmployee(int id) {
		
		List<Employee> resultList = new ArrayList<Employee>();
		
		for(Employee e : empList) {
			if(id == e.getEmpId()) {
				resultList.add(e);
			}
		}
		return resultList;
	}
	
	/** 4. 사번이 일치하는 사원 정보 수정
	 * @param id
	 * @param dep
	 * @param job
	 * @param sal
	 * @return
	 */
	public boolean editEmployee(int id, String dep, String job, int sal) {

		for(Employee e : empList) {
			if(id == e.getEmpId()) {
				empList.get(id).setDepartmentTitle(dep);
				empList.get(id).setJobName(job);
				empList.get(id).setSalary(sal);
			} else {
				return false;
			}
		}
		return true;
	}
	
	/** 5. 사번이 일치하는 사원 정보 삭제
	 * @param id
	 * @return
	 */
	public boolean deleteEmployee(int id) {

		for(Employee e : empList) {
			if(id == e.getEmpId()) {
				return empList.remove(e);
			}
		} return false;
	}
}
