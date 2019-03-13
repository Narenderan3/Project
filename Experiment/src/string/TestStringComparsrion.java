//Program to implement string comparsion
package string;

class TestStringComparsrion{  
	 public static void main(String args[]){  
	   String s1="Sachin";  
	   String s2="Sachin";  
	   String s3=new String("Sachin");  
	   String s4="SACHIN"; 
	   String s5="Ratan";  
	   System.out.println(s1.equals(s2));//true  
	   System.out.println(s1.equalsIgnoreCase(s3));//true  
	   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
	   System.out.println(s1.equalsIgnoreCase(s4));//true ignore the case sensitive 
	   System.out.println(s1.compareTo(s2));//0 (because equals)
	   System.out.println(s1.compareTo(s5));//1(because s1>s3)  
	   System.out.println(s5.compareTo(s1));//-1(because s3 < s1 )  
	 }  
	}
