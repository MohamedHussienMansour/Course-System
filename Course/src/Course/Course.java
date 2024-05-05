package Course;

import java.util.ArrayList;

public abstract class Course {
	protected String name;
	protected String courseId;
	protected String descrription;
	protected ArrayList<String> quizes;
	protected ArrayList<String> instructors;
	protected ArrayList<String> content;
	protected ArrayList<String> weeklyDate;
	protected ArrayList<String> coursePeriods;
	protected ArrayList<String> students;
	
	protected static int no_Courses;
	public Course(String name,String courseId,String descrription,ArrayList<String> quizes,ArrayList<String> instructors,ArrayList<String> students,ArrayList<String> content,ArrayList<String> weeklyDate,ArrayList<String> coursePeriods){
		setName(name);
		setDescription(descrription);
		setQuizzes(quizes);
		setInstructors(instructors);
		setContent(content);
		setWeeklyDate(weeklyDate);
		setCoursePeriod(coursePeriods);
		setCourseId(courseId);
		no_Courses++;
	}
	





	String getName() {
		return name;
	}
	String getCourseId() {
		return courseId;
	}
	String getDescrription() {
		return descrription;
	}
	ArrayList<String> getQuizes() {
		return quizes;
	}
	ArrayList<String> getInstructor() {
		return instructors;
	}
	ArrayList<String> getstudents() {
		return students;
	}
	ArrayList<String> getContent() {
		return content;
	}
	
	ArrayList<String> getWeeklyDate() {
		return weeklyDate;
	}
	ArrayList<String> getCoursePeriod() {
		return coursePeriods;
	}
	void setCourseId(String courseId) {
	    if (courseId == null || courseId.isEmpty()) {
	        throw new IllegalArgumentException("Name cannot be null or empty.");
	    }
	    this.courseId = courseId;
	}
	void setName(String name) {
	    if (name == null || name.isEmpty()) {
	        throw new IllegalArgumentException("Name cannot be null or empty.");
	    }
	    this.name = name;
	}

	void setDescription(String description) {
	    if (description == null || description.isEmpty()) {
	        throw new IllegalArgumentException("Description cannot be null or empty.");
	    }
	    this.descrription = description;
	}

	void setQuizzes(ArrayList<String> quizzes) {
	    if (quizzes == null) {
	        throw new IllegalArgumentException("Quizzes ArrayList cannot be null.");
	    }
	    this.quizes = new ArrayList<>(quizzes);
	}

	void setStudents(ArrayList<String> students) {
	    if (students == null) {
	        throw new IllegalArgumentException("Instructors ArrayList cannot be null.");
	    }
	    this.students = new ArrayList<>(students);
	}
	void setInstructors(ArrayList<String> instructors) {
	    if (instructors == null) {
	        throw new IllegalArgumentException("Instructors ArrayList cannot be null.");
	    }
	    this.instructors = new ArrayList<>(instructors);
	}

	void setContent(ArrayList<String> content) {
	    if (content == null) {
	        throw new IllegalArgumentException("Content ArrayList cannot be null.");
	    }
	    this.content = new ArrayList<>(content);
	}

	void setWeeklyDate(ArrayList<String> weeklyDate) {
	    if (weeklyDate == null) {
	        throw new IllegalArgumentException("WeeklyData ArrayList cannot be null.");
	    }
	    this.weeklyDate = new ArrayList<>(weeklyDate);
	}

	void setCoursePeriod(ArrayList<String> coursePeriods) {
	    if (coursePeriods == null) {
	        throw new IllegalArgumentException("CoursePeriods ArrayList cannot be null.");
	    }
	    this.coursePeriods = new ArrayList<>(coursePeriods);
	}
	public void changeWeeklyPeriod(ArrayList<String> newWeeklyPeriod) {
	    if (newWeeklyPeriod == null) {
	        throw new IllegalArgumentException("New weekly period cannot be null.");
	    }
	    this.weeklyDate = new ArrayList<>(newWeeklyPeriod);
	}
	public void addChapterToContent(String newChapter) {
	    if (newChapter == null || newChapter.isEmpty()) {
	        throw new IllegalArgumentException("New chapter cannot be null or empty.");
	    }
	    if (content == null) {
	        content = new ArrayList<>();
	    }
	    content.add(newChapter);
	}
	public void removeChapterFromContent(String chapterToRemove) {
	    if (chapterToRemove == null || chapterToRemove.isEmpty()) {
	        throw new IllegalArgumentException("Chapter to remove cannot be null or empty.");
	    }
	    if (content != null) {
	        content.remove(chapterToRemove);
	    }
	   
	}
	public int getChapterNumber(String chapterName) {
	    if (chapterName == null || chapterName.isEmpty()) {
	        throw new IllegalArgumentException("Chapter name cannot be null or empty.");
	    }
	    if (content != null) {
	        for (int i = 0; i < content.size(); i++) {
	            if (content.get(i).equals(chapterName)) {
	                return i + 1; // Chapter numbers start from 1
	            }
	        }
	    }
	    throw new IllegalArgumentException("Chapter name not found in the content.");
	}




	public abstract String toString();
	
	
	
	
	
	
	

}
