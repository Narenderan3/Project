//Program to show the working of oops concepts.
interface Daily {
	void food();
}

class WeekDays implements Daily {
	public void food() {
		System.out.println("Normal food like meals ate by me");
	}
}

class Weekand implements Daily {
	public void food() {
		System.out.println("Heavy food like briyani ate by me");
	}
}

class Project implements Daily {
	private String projectName;
	private int projectMark; // Private member accessed within this class
	String guideName = "Ram";

	void setProjectName(String projectName) { // setter method for projectname
		this.projectName = projectName;
	}

	void setProjectMark(int projectMark) { // setter method for projectmark
		this.projectMark = projectMark;
	}

	String getProjectName() { // getter method for projectname
		return projectName;
	}

	int getProjectMark() { // setter method for projectmark
		return projectMark;
	}

	void show() { // method to show guidename
		System.out.println("GuideName:" + guideName);
	}

	public void food() {// method to show food ate by my guide
		System.out.println("College Special food ate by my guide");
	}

}

class LeaveForReview extends Project implements Daily {
	private String reviewerName;

	public void food() { // method to show food ate by me
		super.food();
		System.out.println("College Special food ate by me");
	}

	void setReviewerName(String Name) { // setter method for reviewername
		this.reviewerName = Name;
	}

	String getReviewerName() { // getter method for reviewername
		return reviewerName;
	}
}

public class OopsConcepts {
	public static void main(String args[]) {
		WeekDays week = new WeekDays(); // object creation for WeekDays class
		week.food(); // invoking food method
		LeaveForReview leave = new LeaveForReview();// object creation for LeaveForReview class
		leave.show();
		leave.setReviewerName("Lalitha");
		System.out.println("Name of the Reviewer:" + leave.getReviewerName());
		leave.setProjectName("Converters");
		System.out.println("Name of our project:" + leave.getProjectName());
		leave.setProjectMark(45);
		System.out.println("Mark obtained for the project:" + leave.getProjectMark());
		leave.food();// invoking food method
		Weekand weekand = new Weekand(); // object creation for Weekand class
		weekand.food();
	}

}
