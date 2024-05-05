package Course;

import java.util.ArrayList;

public class InteractiveCourse extends Course implements Comparable<OnlineCourse>,Payable{
	private double price;
	private String Place;
	private int seatsAvailable;
	private ArrayList<String> toolsNeeded;
	private boolean financialAid;



	

	InteractiveCourse(String name,String courseId, String descrription, ArrayList<String> quizes, ArrayList<String> instructors,ArrayList<String> students
		,	ArrayList<String> content, ArrayList<String> weeklyDate, ArrayList<String> coursePeriods,String Place,int seatsAvailable,ArrayList<String> toolsNeeded) {
		super(name,courseId, descrription, quizes, instructors,students, content, weeklyDate, coursePeriods);
		// TODO Auto-generated constructor stub
		
		
	}
	





	String getPlace() {
		return Place;
	}
	double getPrice() {
		return price;
	}
	public int getSeatsAvailable() {
	    return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
	    if (seatsAvailable < 0) {
	        throw new IllegalArgumentException("Price cannot be negative.");
	    }
	    this.seatsAvailable = seatsAvailable;
	}

	public ArrayList<String> getToolsNeeded() {
	    return toolsNeeded;
	}

	public void setToolsNeeded(ArrayList<String> toolsNeeded) {
	    if (toolsNeeded == null) {
	        throw new IllegalArgumentException("Quizzes ArrayList cannot be null.");
	    }
	    this.quizes = new ArrayList<>(toolsNeeded);
	}
	void setPlace(String Place) {
	    if (Place == null || Place.isEmpty()) {
	        throw new IllegalArgumentException("Course platform cannot be null or empty.");
	    }
	    this.Place = Place;
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
                ", description='" + descrription + '\'' +
                ", quizzes=" + quizes +
                ", instructors=" + instructors +
                ", content=" + content +
                ", weeklyData=" + weeklyDate +
                ", coursePeriod=" + coursePeriods +
                ", price=" + price +
                ", Place='" + Place + '\'' +
                ", seatsAvailable='" + seatsAvailable + '\'' +
                ", toolsNeeded='" + toolsNeeded + '\''+ 
                
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
