import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Section implements Element{
	public String title;
	public List <Element> elements;
	
	public Section(String t) {
		title = t;
		elements = new ArrayList<>();
	}

	@Override
	public void print() {
		System.out.println(Arrays.toString(elements.toArray()));
		
	}

	@Override
	public void add(Element e) {
		elements.add(e);
		
	}

	@Override
	public void remove(Element e) {
		elements.remove(e);
		
	}

	@Override
	public Element get(int i) {
		return elements.get(i);
	}
	
	
}
