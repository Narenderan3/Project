package testdriven;

class Intern {
	private int edp_Rating;

	int get_Rating(int edp_Rating) {
		this.edp_Rating = edp_Rating;
		return edp_Rating;
	}

	String typingSkills(int typing_Mark) {
		if (typing_Mark >= 0) {
			if (typing_Mark == 0 || typing_Mark <= 10)
				return ("Need lot of improvement");
			else if (typing_Mark > 10 && typing_Mark <= 20)
				return ("Need improvement");
			else if (typing_Mark > 20 && typing_Mark <= 30)
				return ("Average");
			else if (typing_Mark < 30 && typing_Mark >= 40)
				return ("Fast");
			else
				return ("Fluent");
		} else
			return ("Invalid Mark");
	}

	String edpFeedback(int edp_Rating) {
		if (edp_Rating >= 0 && edp_Rating <= 5) {
			if (edp_Rating == 0 || edp_Rating <= 2)
				return ("Need improvement");
			else if (edp_Rating > 2 && edp_Rating <= 4)
				return ("Good");
			else
				return ("Awesome");
		} else
			return ("Wrong Rating");
	}
}

public class MyClass {

}
