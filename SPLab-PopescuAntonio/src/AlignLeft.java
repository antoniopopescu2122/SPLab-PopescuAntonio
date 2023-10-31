
public class AlignLeft implements AlignStrategy  {

	@Override
	public void render(Paragraph p, String context) {
		int width = 155;
		p.text = String.format("%-" + width + "s", p.text);
		//doesn't work for multiline paragrahps
	}


}
