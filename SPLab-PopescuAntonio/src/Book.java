import java.util.ArrayList;

public class Book extends Section { 
		public ArrayList <Author> authors;
		
		public Book(String t) { 
			super(t);
			authors = new ArrayList<>();
		}
		
		
		public void addAuthor(Author a) {
			authors.add(a);
		}
		
		public void addContent(Element e) {
			elements.add(e);
		}
}
