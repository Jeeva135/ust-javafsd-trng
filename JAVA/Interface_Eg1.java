package week2day2;
interface Language{
	void getName(String name);
}

class ProgrammingLanguage implements Language
{
	public void getName(String name) {
		System.out.println("Programming language:"+name);
	}
}

public class Interface_Eg1 {
	public static void main(String args[]) {
		ProgrammingLanguage language=new ProgrammingLanguage();
		language.getName("Java");
	}

}
