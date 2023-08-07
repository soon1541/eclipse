package java08_mysql_jdbc;

import java.util.Scanner;

public class DeleteTest extends DBConnection {

	public DeleteTest() {
		
	}
	public void deleteEmp() {
		// 사원번호를 입력받아 입력받은 사원을 삭제하라.
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할사원번호:");
		int empno = scan.nextInt();
		
		
		try {
			dbConnection();
			
			String sql = "delete from emp where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			int r = pstmt.executeUpdate();
			if(r>0) {
				System.out.println(r+"개의 레코드가 삭제되었습니다.");
			}else {
				System.out.println("삭제된 레코드가 없습니다.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	public static void main(String[] args) {
		new DeleteTest().deleteEmp();

	}

}
