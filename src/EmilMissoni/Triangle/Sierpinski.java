package EmilMissoni.Triangle;

import EmilMissoni.SVG.Utils.*;

import java.io.IOException;
import java.util.Random;
import EmilMissoni.SVG.SVG;

public class Sierpinski {

    public Sierpinski(int seed, String filename) throws IOException {

        Position pos = new Position(200, 500);
        Random random = new Random();
        random.setSeed(seed);
        RGB start_color = new RGB(random.nextInt(0, 120), random.nextInt(0, 120), random.nextInt(0, 120));
        RGB end_color = new RGB(random.nextInt(80, 200), random.nextInt(80, 180), random.nextInt(80, 170));
        SVG svg = new SVG(filename, 540, 720);
        SierpinskiTriangle sierpinskiTriangle = new SierpinskiTriangle(start_color, end_color, pos, 250);
        sierpinskiTriangle.generate(svg, 6, pos, 250, 3);
        svg.close();
    }

}
