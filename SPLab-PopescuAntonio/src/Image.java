import java.util.List;

public class Image implements Element{
	public String imageName;
	public List <Element> elements;
	
	public Image(String n) {
		imageName=n;
		//TODO method to load
	}
	
	public String getImageName() {
		return imageName;
	}
	
	public void print() {
			System.out.println("Image's name is " + imageName + ". -img \n");
			//TODO method to print
	}

	@Override
	public void add(Element e) {
		elements.add(e);
		
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
