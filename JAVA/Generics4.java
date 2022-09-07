package week2day3;

class Test1<T>{
	T obj;
	Test1 (T obj)
	{
		this.obj=obj;
	}
	public T getObject()
	{
		return this.obj;
	}
}

public class Generics4 {
	public static void main(String args[])
	{
		Test1<Integer>iObj=new Test1<Integer>(15);
		System.out.println(iObj.getObject());
		
		Test1<String>sObj=new Test1<String>("GeeksforGeeks");
		
		System.out.println(sObj.getObject());
		//iObj=sObj;
	}

}
