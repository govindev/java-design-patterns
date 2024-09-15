package visitor.begin;

import java.util.Collection;

public interface Employee {
	
	int getPerformanceRating();
	
	void setPerformanceRating(int rating);
	
	Collection<Employee> getDirectReports();

	int getEmployeeId();
}
