package test;

import java.util.*;

public class ImplementClass {
	ArrayList<SignupClass> ClassList = new ArrayList<>();

	public boolean add(String name, String mail, String password) {
		boolean flag = false;
		int length = ClassList.size();
		length++;
		for (SignupClass sc : ClassList) {
			if (sc.getEmail().equals(mail)) {
				if (!flag) {
					flag = true;
					break;
				}
			}
		}
		if (flag) {
			SignupClass sc = new SignupClass();
			sc.setEmail(mail);
			sc.setId(length);
			sc.setName(name);
			sc.setPassword(password);
			ClassList.add(sc);
			return true;
		} else {
			return false;
		}
	}

	// Set<SignupClass> set = new HashSet<>();
	//
	// int length = set.size();
	// length++;
	//
	// public boolean add(String name, String mail, String password) {
	// for (SignupClass sc : set) {
	//
	// if (sc.getEmail().equals(mail)) {
	// return false;
	// } else {
	// SignupClass signup = new SignupClass();
	// signup.setEmail(mail);
	// signup.setName(name);
	// signup.setId(length);
	// signup.setPassword(password);
	// set.add(signup);
	// }
	//
	// }
	// return true;
}
