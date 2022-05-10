package wall;

import java.util.List;
import java.util.Optional;

public interface Structure {
	// zwraca dowolny element o podanym kolorze
	Optional<BlockElement> findBlockByColor(String color);

	// zwraca wszystkie elementy z danego materia�u
	List<BlockElement> findBlocksByMaterial(String material);

	//zwraca liczb� wszystkich element�w tworz�cych struktur�
	int count();
}
