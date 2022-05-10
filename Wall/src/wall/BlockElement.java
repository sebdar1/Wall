package wall;

public class BlockElement implements Block {

	private static int nextBlockId = 1001;
	private int blockId;
	private String color;
	private String material;
	
	public BlockElement()
	{
		this.color = "UNDEFINED";
		this.material = "UNDEFINED";
		setBlockId();
	}
	
	public BlockElement(String color, String material)
	{
		this.color = color;
		this.material = material;
		setBlockId();
	}
	
	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}
	
	private void setBlockId() {
		blockId = nextBlockId;
		nextBlockId++;
	}
	
	public String toString() 
	{
		return "[numer bloczku: " + blockId + ", kolor: " + color + ",  materia³: " + material + "]";
	}

}
