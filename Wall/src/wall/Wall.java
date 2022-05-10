package wall;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
	
	// pod t� zmienn� podstawiana jest lista wszystkich? utworzonych bloczk�w ( CompositeBlock.getBlocks() )
	private List<BlockElement> blocks;
	
	// zwraca dowolny element o podanym kolorze
	public Optional<BlockElement> findBlockByColor(String color) {
		
		Optional<BlockElement> blockOptional = null;
		
		for (BlockElement be : blocks)
			if (color.equals(be.getColor()))
				blockOptional = Optional.of(be);
		
		return blockOptional;
	}

	// zwraca wszystkie elementy z danego materia�u
	public List<BlockElement> findBlocksByMaterial(String material) {
		
		List<BlockElement> blockList = new ArrayList<BlockElement>();
		
		for (BlockElement be : blocks)
			if (material.equals(be.getMaterial()))
				blockList.add(be);
		
		return blockList;
	}

	//zwraca liczb� wszystkich element�w tworz�cych struktur�
	public int count() {
		return blocks.size();
	}
	
	/**
	 * Metoda generuje przyk�adowe dane i wypisuje wyniki na standardowe wyj�cie
	 */
	public void generateAndDisplayCompositeBlocks()
	{
		// wygenerowanie danych testowych
		CompositeBlockElements cbe = new CompositeBlockElements();
		
		cbe.add("red", "carbon");
		cbe.add("blue", "steel");
		cbe.add("brown", "wood");
		cbe.add("grey", "wood");
		
		// WA�NE: przypisywanie wygenerowanych danych do zmiennej prywatnej blocks
		blocks = cbe.getBlocks();
		
		System.out.println("Wypisanie bloczku o podanym kolorze: ");
		Optional<BlockElement> bOptional = findBlockByColor("brown");
		if (bOptional != null)
			System.out.println(bOptional.get().toString());
		else
			System.out.println("Nie odnaleziono elementu o podanym kolorze");
		
		// lista przechowuje dane bloczk�w wykonanych z wprowadzonego materia�u
		System.out.println("\nWypisanie bloczk�w wykonanych z podanego materia�u: ");
		List<BlockElement> bByMaterial = findBlocksByMaterial("wood");
		for (int i = 0; i < bByMaterial.size(); i++)
			System.out.println(bByMaterial.get(i).toString());
		
		// wypisanie liczby wszystkich element�w tworz�cych struktur�
		System.out.println("\nLiczba wszystkich element�w tworz�cych struktur�: " + count());
		
	}

	public static void main(String[] args) {
		
		Wall wall = new Wall();
		wall.generateAndDisplayCompositeBlocks();

	}

}
