package test02_basic;

public class Array2Ex {

	static int arr[][];
	static int row;
	static int col;
	
	// 초기값 설정
	static void setData(int row, int col) {
		Array2Ex.row = row;
		Array2Ex.col = col;
		
		arr = new int[row][col];
		
		int value = 1;
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;	
			}
		}
		
	}
	// 행 우선탐색
	static void searchByRow() {
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	// 열 우선탐색
	static void searchByCol() {
		for(int c = 0; c < col; c++) { // 열index
			for(int r = 0; r < row; r++) { // 행index
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	// 지그재크 탐색 : 행 index가 짝수이면 열 index는 0,1,2,3
	//             행 index가 홀수이면 열 index는 3,2,1,0	
	
	static void searchByZigzag() { 
		for(int r = 0; r < row; r++) { // 0,1,2
			if(r%2 == 0) {
				for(int c = 0; c < col; c++) {
					System.out.print(arr[r][c] + " ");
				}
			}else {
				for(int c = col-1; c >= 0; c--) {
					System.out.print(arr[r][c] + " ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		setData(5, 5);
		
		// 행 우선탐색
		searchByRow();
		
		// 열 우선탐색
		searchByCol();
		
		// 지그재그 탐색
		searchByZigzag();
		
	}

}
