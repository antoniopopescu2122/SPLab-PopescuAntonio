import java.util.Arrays;
import java.util.List;

public class Image implements Element{
	public String imageName;
	public List <Element> elements;
	
	public Image(String n) {
		imageName=n;
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
