// Isaiah Saucedo 
public class Shape {
	
	Vertex [] v; 
	
	public double distance(Vertex a , Vertex b) {
		
		return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
	}

}
