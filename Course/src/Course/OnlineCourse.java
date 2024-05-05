package Course;

import java.util.ArrayList;

public class OnlineCourse extends Course implements Comparable<OnlineCourse>,Payable{
	private double price;
	private String coursePlatform;
	private boolean financialAid;
	

	OnlineCourse(String name,String courseId, String descrription, ArrayList<String> quizes, ArrayList<String> instructors,ArrayList<String> students,
			ArrayList<String> content, ArrayList<String> weeklyDate, ArrayList<String> coursePeriods,double price,String coursePlatform) {
		super(name,courseId,descrription, quizes, instructors,students, content, weeklyDate, coursePeriods);
		// TODO Auto-generated constructor stub
		
		
	}
	
	OnlineCourse(String name,String courseId,String descrription, ArrayList<String> quizes, ArrayList<String> instructors,
			ArrayList<String> content, ArrayList<String> weeklyDate, ArrayList<String> coursePeriods,ArrayList<String> students,double price,String coursePlatform, boolean financialAid) {
		super(name,courseId,descrription, quizes, instructors,students, content, weeklyDate, coursePeriods);
		setFinancialAid(financialAid);
		// TODO Auto-generated constructor stub
		
		
	}


	public boolean isFinancialAid() {
	    return financialAid;
	}

	public void setFinancialAid(boolean financialAid) {
	    this.financialAid = financialAid;
	}

	String getCoursePlatform() {
		return coursePlatform;
	}
	double getPrice() {
		return price;
	}
	void setCoursePlatform(String coursePlatform) {
	    if (coursePlatform == null || coursePlatform.isEmpty()) {
	        throw new IllegalArgumentException("Course platform cannot be null or empty.");
	    }
	    this.coursePlatform = coursePlatform;
	}

	void setPrice(double price) {
	    if (price < 0) {
	        throw new IllegalArgumentException("Price cannot be negative.");
	    }
	    this.price = price;
	}


    @Override
    public String toString() {
        return "OnlineCourse{" +
                "name='" + name + '\'' +
                ", course id='"+courseId+'\''+
                ", description='" + descrription + '\'' +
                ", quizzes=" + quizes +
                ", instructors=" + instructors +
                ", content=" + content +
                ", weeklyData=" + weeklyDate +
                ", coursePeriod=" + coursePeriods +
                ", price=" + price +
                ", coursePlatform='" + coursePlatform + '\'' +
                '}';
    }

	@Override
	public int compareTo(OnlineCourse o) {
		// TODO Auto-generated method stub
		if (this.price==o.getPrice())
			return 0;
		else if(this.price>=o.getPrice())
			return 1;
		else 
			return -1;
		
	}
	public String getPaymentMethod() {
	    if (financialAid) {
	        return "Financial Aid";
	    } else {
	        return "Paid";
	    }
	}

	
}
