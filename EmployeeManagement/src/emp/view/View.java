package emp.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import emp.model.vo.Employee;
import emp.model.vo.EmployeeService;

public class View {

	EmployeeService service = new EmployeeService();

	private Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		int input = 0;
		
		do {
			System.out.println("[메뉴 선택]");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.println();
			
			System.out.print("번호 입력 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : addEmployee(); break;
			case 2 : allEmployee(); break;
			case 3 : searchEmployee(); break;
			case 4 : editEmployee(); break;
			case 5 : deleteEmployee(); break;
			case 6 : searchDepartment(); break;
			case 7 : searchSalary(); break;
			case 8 : departmentSalary(); break;
			case 0 : break;
			}
			
			System.out.println();
			
		} while(input !=0);
	}

	/**
	 * 1. 새로운 사원 정보 추가
	 */
	public void addEmployee() {
		
		System.out.print("사원 번호(사번) : ");
		int id = sc.nextInt();

		System.out.print("사원 이름 : ");
		String name = sc.next();
		
		System.out.print("주민등록번호 : ");
		String no = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("부서명 : ");
		String dep = sc.next();

		System.out.print("직급명 : ");
		String job = sc.next();
		
		System.out.print("급여 : ");
		int sal = sc.nextInt();
		
		if(service.addEmployee(id, name, no, email, phone, dep, name, sal)) {
			System.out.println("[사원 정보 추가완료]");
		} else {
			System.out.println("사원 정보를 추가하지 못했습니다.");
		}
	}

	/**
	 * 2. 전체 사원 정보 조회
	 */
	public void allEmployee() {

		List<Employee> empList = service.getEmployeeList();
		for(Employee e : empList) System.out.println(e);
	}
	
	/**
	 * 3. 사번이 일치하는 사원 정보 조회
	 */
	public void searchEmployee() {
		
		System.out.print("사번을 입력하세요 >> ");
		int id = sc.nextInt();
		
		List<Employee> resultList = service.searchEmployee(id);
		
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Employee e : resultList) System.out.println(e);
		}
	}
	
	/**
	 * 4. 사번이 일치하는 사원 정보 수정
	 */
	public void editEmployee() {
		
		System.out.print("사번을 입력하세요 >> ");
		int id = sc.nextInt();

		System.out.print("부서명 : ");
		String dep = sc.next();

		System.out.print("직급명 : ");
		String job = sc.next();
		
		System.out.print("급여 : ");
		int sal = sc.nextInt();
		
		if(service.editEmployee(id, dep, job, sal) == true) {
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("일치하는 사번이 없습니다.");
		}
	}
	
	/**
	 * 5. 사번이 일치하는 사원 정보 삭제
	 */
	public void deleteEmployee() {
		
		System.out.print("사번을 입력하세요 >> ");
		int id = sc.nextInt();
		
		if(service.deleteEmployee(id) == false) {
			System.out.println("일치하는 사번이 없습니다.");
		} else {
			System.out.println("해당 사원의 정보가 삭제되었습니다.");
		}
	}
	
	/**
	 * 6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 */
	public void searchDepartment() {
	
		System.out.print("부서를 입력하세요 >> ");
		String dep = sc.next();
		sc.nextLine();
		
		List<Employee> resultList = service.searchDeparment(dep);
		
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Employee e : resultList) System.out.println(e);
		}
	}
	
	/**
	 * 7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 */
	public void searchSalary() {
		System.out.print("급여 입력하세요 >> ");
		int sal = sc.nextInt();
		
		List<Employee> resultList = service.searchSalary(sal);
		
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Employee e : resultList) System.out.println(e);
		}
	}
	
	/**
	 * 8. 부서별 급여 합 전체 조회
	 */
	public void departmentSalary() {
//		
//		Map<String, Object> map = service.departmentSalary();
//		
//		
//		
//		
	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
