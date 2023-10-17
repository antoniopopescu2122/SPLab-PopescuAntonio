import java.util.ArrayList;

public class Chapter {
	public String name;
	public ArrayList <SubChapter> SubChapters;
	
	public Chapter(String n) {
		name=n;
	SubChapters = new ArrayList<>();
	}
	
	public void print() {
		System.out.println("The chapter's name is " + name + ".");
	}
	
	public void addSubChapters(SubChapter sc) {
		SubChapters.add(sc);
	}
}
