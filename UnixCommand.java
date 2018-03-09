import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnixCommand {
	public static void main(String[] args) throws IOException, InterruptedException {
		//String cmd = "ls -l";
		String cmd2 = "pwd";
		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(cmd2);
		pr.waitFor();
		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
		while ((line=buf.readLine())!=null) {
		System.out.println(line);
		}
	}
	}