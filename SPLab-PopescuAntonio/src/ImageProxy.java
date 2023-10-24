
public class ImageProxy {
	String url;
	Image img = null;
	
	public ImageProxy(String u) {
		url=u;
	}
	
	public void loadImage(String url) {
		img = new Image(url);
	}
	
	public void print() {
		if(img==null)
			loadImage(url);
		img.print();
	}
}
