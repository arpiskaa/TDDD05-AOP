
import java.io.*; 

public class Logger {

	/** Logger usually be accessed using Factory + Singleton pattern */ 

	private static final boolean DEBUG = false; 
	private static BufferedWriter out = null; 
	private static final String logfile = "logAOP.txt"; 
	public Logger() {  } 
	/** Write to the log a record about entering a function */ 
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
	/** Write to the log a record about exiting a function */ 
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
