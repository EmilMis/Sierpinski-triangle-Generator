package EmilMissoni;

import EmilMissoni.Triangle.Sierpinski;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Sierpinski sierpinski = new Sierpinski(Integer.parseInt(args[0]) % 100000000, args[1]);
    }

}
