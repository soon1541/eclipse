package java08_mysql_jdbc;

import java.util.Scanner;

/*
 사원번호를 입력받아 해당사원의 업무, 급여, 보너스, 부서코드를 수정하라. 
 
 */



public class UpdateTest extends DBConnection{
	Scanner scan = new Scanner(System.in);
	
private void updateStart() {
		
		
	}
	
	public UpdateTest() {
		// 1. 데이터준비
		System.out.println("수정할 사원번호=");
		int empno = Integer.parseInt(scan.nextLine());
		
		System.out.println("담당업무=");
		String job = scan.nextLine();
		
		System.out.println("급여=");
		int sal = Integer.parseInt(scan.nextLine());
		
		System.out.println("보너스=");
		int comm = Integer.parseInt(scan.nextLine());
		
		System.out.println("부서코드");
		int deptno = Integer.parseInt(scan.nextLine());
		
		try {
			//1. DB연결
			dbConnection();
			
			//2. PreparedStement객체 생성
			String sql = "update emp set job=?, sal=?, comm=?, deptno=? where empno=? ";
			pstmt = con.prepareStatement(sql);
			// 값 세팅
			pstmt.setString(1,job);
			pstmt.setInt(2,sal);
			pstmt.setInt(3,comm);
			pstmt.setInt(4,deptno);
			pstmt.setInt(5,empno);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println(result + "개의 레코드가 수정되었습니다.");
			}else {
				System.out.println("사원정보 수정을 실패하였습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		
	}

	public static void main(String[] args) {
		new UpdateTest().updateStart();

	}

	

}
