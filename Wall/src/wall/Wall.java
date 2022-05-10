package wall;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
	
	// pod t¹ zmienn¹ podstawiana jest lista wszystkich? utworzonych bloczków ( CompositeBlock.getBlocks() )
	private List<BlockElement> blocks;
	
	// zwraca dowolny element o podanym kolorze
	public Optional<BlockElement> findBlockByColor(String color) {
		
		Optional<BlockElement> blockOptional = null;
		
		for (BlockElement be : blocks)
			if (color.equals(be.getColor()))
				blockOptional = Optional.of(be);
		
		return blockOptional;
	}

	// zwraca wszystkie elementy z danego materia³u
	public List<BlockElement> findBlocksByMaterial(String material) {
		
		List<BlockElement> blockList = new ArrayList<BlockElement>();
		
		for (BlockElement be : blocks)
			if (material.equals(be.getMaterial()))
				blockList.add(be);
		
		return blockList;
	}

	//zwraca liczbê wszystkich elementów tworz¹cych strukturê
	public int count() {
		return blocks.size();
	}
	
	/**
	 * Metoda generuje przyk³adowe dane i wypisuje wyniki na standardowe wyjœcie
	 */
	public void generateAndDisplayCompositeBlocks()
	{
		// wygenerowanie danych testowych
		CompositeBlockElements cbe = new CompositeBlockElements();
		
		cbe.add("red", "carbon");
		cbe.add("blue", "steel");
		cbe.add("brown", "wood");
		cbe.add("grey", "wood");
		
		// WA¯NE: przypisywanie wygenerowanych danych do zmiennej prywatnej blocks
		blocks = cbe.getBlocks();
		
		System.out.println("Wypisanie bloczku o podanym kolorze: ");
		Optional<BlockElement> bOptional = findBlockByColor("brown");
		if (bOptional != null)
			System.out.println(bOptional.get().toString());
		else
			System.out.println("Nie odnaleziono elementu o podanym kolorze");
		
		// lista przechowuje dane bloczków wykonanych z wprowadzonego materia³u
		System.out.println("\nWypisanie bloczków wykonanych z podanego materia³u: ");
		List<BlockElement> bByMaterial = findBlocksByMaterial("wood");
		for (int i = 0; i < bByMaterial.size(); i++)
			System.out.println(bByMaterial.get(i).toString());
		
		// wypisanie liczby wszystkich elementów tworz¹cych strukturê
		System.out.println("\nLiczba wszystkich elementów tworz¹cych strukturê: " + count());
		
	}

	public static void main(String[] args) {
		
		Wall wall = new Wall();
		wall.generateAndDisplayCompositeBlocks();

	}

}
