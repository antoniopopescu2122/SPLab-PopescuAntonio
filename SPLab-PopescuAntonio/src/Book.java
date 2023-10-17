import java.util.ArrayList;

public class Book {
		public String title;
		public ArrayList <Author> Authors;
		public ArrayList <Chapter> Chapters;
		
		public Book(String t) {
			title=t;
			Authors = new ArrayList<>();
			Chapters = new ArrayList<>();
		}
		
		public void print() {
			System.out.println("Book's title is " + title + "!!");
		}
		
		public void addAuthors(Author a) {
			Authors.add(a);
		}
		
		public void addChapters(Chapter c) {
			Chapters.add(c);
		}
}
