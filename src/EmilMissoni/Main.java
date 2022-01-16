package EmilMissoni;

import EmilMissoni.Triangle.Sierpinski;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int seed = Integer.parseInt(args[0].substring(0, Math.min(args[0].length(), 7)));
        Sierpinski sierpinski = new Sierpinski(seed, args[1]);
    }

}
