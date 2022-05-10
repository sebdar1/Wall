package wall;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa implementuj¹ca interfejs CompositeBlock
 * Przechowuj¹ listê wszystkich bloczków
 */
public class CompositeBlockElements implements CompositeBlock {

	// zmienna przechowujê ostatni dodawany element
	BlockElement blockElement;
	// lista generyczna zawieraj¹ce elemnty sk³adaj¹ce siê z color i material
	private List<BlockElement> blocks;
	
	public CompositeBlockElements() {
		blocks = new ArrayList<BlockElement>();
	}
	
	public CompositeBlockElements(String color, String material) {
		 this.blockElement = new BlockElement(color, material);
		 blocks.add(this.blockElement);
	}

	@Override
	public String getColor() {
		return blockElement.getColor();
	}

	@Override
	public String getMaterial() {
		return blockElement.getMaterial();
	}

	@Override
	public List<BlockElement> getBlocks() {
		return this.blocks;
	}
	
	// dodaje do listy bloczek o zadanym kolorze i materiale
	public void add(String color, String material)
	{
		blockElement = new BlockElement(color, material);
		this.blocks.add(blockElement);
	}

}
