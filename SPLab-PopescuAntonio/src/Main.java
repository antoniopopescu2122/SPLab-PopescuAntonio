
public class Main {

	public static void main(String[] args) {
		Book noapteBuna = new Book("Noapte buna, copii!"); 
		Author rpGheo = new Author("Radu Pavel Gheo"); 
		noapteBuna.addAuthor(rpGheo);
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		Paragraph p1 = new Paragraph("Multumesc celor care ...");
		Paragraph p2 = new Paragraph("Moto capitol");
		Paragraph p3 = new Paragraph("Text from subchapter 1.1");
		Paragraph p4 = new Paragraph("Text from subchapter 1.1.1");
		noapteBuna.addContent(p1);
		noapteBuna.addContent(cap1);
		cap1.add(p2);
		cap1.add(cap11);
		cap11.add(p3);
		cap11.add(cap111);
		cap111.add(p4); 
		cap111.add(cap1111);
		cap1111.add(new Image ("Image subchapter 1.1.1.1"));
		noapteBuna.print();
		p1.setAlignStrategy(new AlignRight());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignCenter());
		noapteBuna.print();
		}
}
