//Program to find the default value of the given data types.
class DefaultValueOfDatatypes {
	int i;
	double d;
	float f;
	boolean b1;
	String s;
	byte b2;
	long l;
	short s2;
	
	public void printValue()
	{
		System.out.println("int default value= "+i);
		System.out.println("double default value= "+d);
		System.out.println("float default value= "+f);
		System.out.println("boolean default value= "+b1);
		System.out.println("String default value= "+s);
		System.out.println("byte default value= "+b2);
		System.out.println("long default value= "+l);
		System.out.println("short default value= "+s2);
	}	

}
 class Test{
	 public static void main(String args[])
	 {
		 DefaultValueOfDatatypes value = new DefaultValueOfDatatypes();
		 value.printValue();
	 }
	
}
