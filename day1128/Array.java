package day1128;

public class Array {
	int[][] arr = new int[6][9];
	
	public void setArray() {
		System.out.println("set Array 입니다");
		for(int i=0; i<arr.length; i++) {//행
			for(int j=0; j<arr[i].length; j++) {//열
				if(i ==0 || i==5|| j==0|| j==8)
					arr[i][j] =1;
				else
					arr[i][j] = 0;
			}
		}
	}
	
	int[][] a=new int[15][15];
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			a[i][j] = i=0 ||i==a.length-1||
					j=0||j==a[i].length-1 ?1:0;
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
	
	
	public void printArray() {
		System.out.println("print Array 입니다");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.print(arr[i][j]);
			}
				System.out.println();
		}
	}
	
	
}//class
