import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	public String name;
	public List <Element> Elements;
	
	public SubChapter(String n) {
		name=n;
		Elements = new ArrayList<>();
	}
	
	public void print() {
		System.out.println("The subchapter's name is " + name + ".");
	}
}
