package InterviewPrograms;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class DisplayIP {

	
	public static void main(String[] args) throws UnknownHostException {
		
		
		System.out.println(Inet4Address.getLocalHost());
	}
}
