package wall;

import java.util.List;

public interface CompositeBlock extends Block {
	List<BlockElement> getBlocks();
}
