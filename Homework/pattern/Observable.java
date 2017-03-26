package pattern;

public interface Observable {
	
	void AddReader (Observer o);
	void removeReader(Observer o);
	void notifyReader();
	

}
