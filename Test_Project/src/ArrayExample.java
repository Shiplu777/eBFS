import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		
		String Student[] = new String[1];
		ArrayList<student> st = new ArrayList<student>();
		

		
	
		
		Object Students[] = new Object[3];
		Students[0] = "Test";
		Students[1] = 1234;
		Students[2] = 43.144;
		
		for(int i=0;i<Students.length;i++){
			System.out.println(Students[i]);
		}
	}

	
	public class student{
		int studentID;
		String studentName;
		
	}
}
