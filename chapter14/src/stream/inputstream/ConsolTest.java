package stream.inputstream;

import java.io.Console;

public class ConsolTest {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("�̸�:");
		String name = console.readLine();
		System.out.println("��й�ȣ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}

}
