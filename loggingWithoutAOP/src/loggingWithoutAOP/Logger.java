package loggingWithoutAOP;
import java.io.*; 

public class Logger {


	private static final boolean DEBUG = false; 
	private static BufferedWriter out = null; 
	private static final String logfile = "log.txt"; 
	public Logger() {  } 

	public static void entry(String func) { 
		try { 
			if (null == out) { 
				out = new BufferedWriter (new FileWriter(logfile)); 
			} 
			out.write("N:"+ func); 
			out.newLine(); 
			out.flush(); 
		} catch (Exception exc) { 
			exc.printStackTrace(); 
		} finally { 
			if (DEBUG) System.out.println("N:"+ func); 
		} 
	} 

	public static void exit(String func) { 
		try { 
			if (null == out) { 
				out = new BufferedWriter (new FileWriter(logfile)); 
			} 
			out.write("X:"+ func); 
			out.newLine(); 
			out.flush(); 
		} catch (Exception exc) { 
			exc.printStackTrace(); 
		} finally {             
			if (DEBUG) System.out.println("X:"+ func); 
		} 
	} 

}
