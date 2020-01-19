package InterviewPrograms;

import java.io.IOException;

public class Notepad {

	
	
	public static void main(String[] args) {
		Runtime rs=Runtime.getRuntime();
		try {
			rs.exec("Calendar");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
