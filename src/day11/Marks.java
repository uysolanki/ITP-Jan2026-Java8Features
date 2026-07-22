package day11;

public class Marks {

	private int history;
	private int english;
	private int maths;
	
	public Marks() {}
	public Marks(int history, int english, int maths) {
		this.history = history;
		this.english = english;
		this.maths = maths;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	@Override
	public String toString() {
		return "Marks [history=" + history + ", english=" + english + ", maths=" + maths + "]";
	}
	
	
}
