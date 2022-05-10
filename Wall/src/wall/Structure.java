package wall;

import java.util.List;
import java.util.Optional;

public interface Structure {
	// zwraca dowolny element o podanym kolorze
	Optional<BlockElement> findBlockByColor(String color);

	// zwraca wszystkie elementy z danego materia³u
	List<BlockElement> findBlocksByMaterial(String material);

	//zwraca liczbê wszystkich elementów tworz¹cych strukturê
	int count();
}
