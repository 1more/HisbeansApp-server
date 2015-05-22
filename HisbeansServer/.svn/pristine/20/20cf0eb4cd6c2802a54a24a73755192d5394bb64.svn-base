package ghost.android.hisbeans.coffeestamp;

import java.util.List;

/**
 * @author HyeonWook Kim
 * @email khw0867@gmail.com
 * @classname CoffeeStampService.java
 * @package ghost.android.hisbeans.coffeestamp
 * @date 2012. 7. 13.
 * @purpose : Interface for services related with a coffee stamp card. 
 *
 */

public interface CoffeeStampService {
	public List<CoffeeStampModel> getStampCards(String barcodeNum);
	public boolean addCoffeeStamps(String barcodeNum, int count);
	public boolean removeCoffeeStamp(String barcodeNum, int count);
	public boolean useStampCard(String barcodeNum, int count);
	public void removeStampCard(int index);
	public void makeNewStampCard(String barcodeNum);
}
