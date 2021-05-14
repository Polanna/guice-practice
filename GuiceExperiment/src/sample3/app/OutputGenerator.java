/**
 * 
 */
package sample3.app;

import java.io.OutputStream;
import java.util.List;

/**
 * @author polga
 *
 */
public class OutputGenerator {
	
	public void benchmarkOutput (Config config, List<StatsObject> data) {
		OutputStrategy outputStrategy = new OutputToScreen();
		outputStrategy = new OutputToFile();
	}

}
