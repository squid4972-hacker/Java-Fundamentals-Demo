package CreateProcess;
import java.io.IOException;
/**
 * @author enayalaborn
 * @Version 1.1.1
 * @Date 31 May 2026
 * */
 

public class ProcessExample {
	public static void main(String[] args) throws IOException {
		
// Create a new OS process to run "notepad.exe"
	Process p = Runtime.getRuntime().exec("notepad.exe");

// The Java program continues here
// The new process runs separately


	System.out.println("Notepad launched as separate process!");
// Wait for the process to finish


/* The code below is typical to throw an exception
 * */
	try {
	p.waitFor(); // Blocks until notepad closes
	System.out.println("Notepad closed");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}}
}


