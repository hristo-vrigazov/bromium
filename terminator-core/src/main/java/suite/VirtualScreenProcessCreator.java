package suite;

import java.io.IOException;

/**
 * Created by hvrigazov on 12.04.17.
 */
public class VirtualScreenProcessCreator {

    public Process createXvfbProcess(int i) throws IOException {
        // 0 is the main screen
        String screen = getScreen(i);

        String[] command = {
                "Xvfb", screen, "-screen", "0", "1360x1024x24 &"
        };

        return new ProcessBuilder(command).start();
    }

    public String getScreen(int i) {
        return ":" + (i + 1);
    }
}
