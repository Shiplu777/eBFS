package Module3Practice;

public class Array_practice {

	public static void main(String[] args) {
		
	String[][] Student = new String[2][2];
	Student[0][0] = "FirstA1";
	Student[0][1] = "FirstA2";	
	
	Student[1][0] = "SecondA1";
	Student[1][1] = "SecondA2";	
	
	for(int i=0;Student.length>i;i++){
		
		for(int j=0;Student.length>j;j++){
			System.out.println(Student[i][j]);
		}
	}
		
		

	}

}
