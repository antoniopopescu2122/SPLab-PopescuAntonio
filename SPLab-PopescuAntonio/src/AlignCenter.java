
public class AlignCenter implements AlignStrategy {

	@Override
	public void render(Paragraph paraGraph, String context) {
		int width = 155;
		int padding = (width - paraGraph.text.length())/2;
		paraGraph.text = String.format("%" + (padding + paraGraph.text.length()) + "s", paraGraph.text);
		//doesn't work for multiline paragrahps
	}


}
