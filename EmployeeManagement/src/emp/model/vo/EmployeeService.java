package emp.model.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
				e.setDepartmentTitle(dep);
				e.setJobName(job);
				e.setSalary(sal);
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
	
	/** 6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 * @param dep
	 * @return resultList
	 */
	public List<Employee> searchDeparment(String dep) { 
		List<Employee> resultList = new ArrayList<Employee>();
		
		for(Employee e : empList) {
			if(dep.equals(e.getDepartmentTitle())) {
				resultList.add(e);
			}
		} return resultList;
	}
		
	/** 7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 * @param dep
	 * @return
	 */
	public List<Employee> searchSalary(int sal) { 
		List<Employee> resultList = new ArrayList<Employee>();
		
		for(Employee e : empList) {
			if(sal <= e.getSalary()) {
				resultList.add(e);
			}
		} return resultList;
	}
	
	
	/**
	 * 8. 부서별 급여 합 전체 조회
	 */
	public Map<String, Integer> departmentSalary() {
		
		Map<String, Integer> map = new HashMap<>();
		
		for(Employee e : empList) {
			
			String dep = e.getDepartmentTitle();
			int value =  map.get(dep) == null ? 0 : map.get(dep); // 삼항 연산자
			// map에서 일치하는 dep가 없으면 0, 있으면 해당 value 반환
			// map.get(dep) == 주어진 dep의 값 == salary의 합
			// map에서는 Integer 값도 null을 가질 수가 있다
			
			// 일치하는 부서가 없으면 최초 값이니까 0 + 현재 salary 값
			// 일치하는 부서가 있으면 기존에 있던 값을 map.get(dep)으로 불러오고
			// 현재 salary를 더해준다는 뜻
			
			map.put(dep, value + e.getSalary());
			// map에서는 중복되는 dep 값은 알아서 걸러준다
		}
		
		return map;
	}
	
}
