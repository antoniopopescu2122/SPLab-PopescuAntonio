import java.util.Arrays;
import java.util.List;

public class Paragraph implements Element{
	public String text;
	public List <Element> elements;
	
	public Paragraph(String t) {
		text=t;
	}
	
	public void print() {
		System.out.println(Arrays.toString(elements.toArray()));
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
