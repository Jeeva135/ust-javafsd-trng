package week2day3;

public class Generics5 {
	public static void main (String args[]) {
		GenericsClass<Integer>intObj=new GenericsClass<>(5);
		System.out.println("Generic class returns:"+intObj.getData());
		
		GenericsClass<String>stringObj=new GenericsClass<>("Java Programming");
		System.out.println("Generic Class returns:"+stringObj.getData());
		
	}

}

class GenericsClass<T>{
	
	private T data;
	public GenericsClass(T data) {
		this.data=data;
	}
		
		public T getData() {
			return this.data;
		}
	
}
