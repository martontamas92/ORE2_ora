package Main;

import javax.naming.InitialContext;

import ejb_interface.First;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		First first = (First) InitialContext.doLookup("java:global/first-ear/first-ejbt/first!first.first");
		System.out.println(first.f(1));
	}

}
