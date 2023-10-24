import java.util.ArrayList;
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
		if(this instanceof Book)
			System.out.println("Book's name is " + title +". \n");
		else
			System.out.println("Section's name is " + title +". -- \n");
	
		if(elements.size()>0)
			for(Element el:elements){
				el.print();
			}
	//TODO bonus feature: identation of nested sections/elements
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
