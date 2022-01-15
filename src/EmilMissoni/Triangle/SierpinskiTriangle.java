package EmilMissoni.Triangle;

import EmilMissoni.SVG.Utils.Position;
import EmilMissoni.SVG.SVG;
import EmilMissoni.SVG.Utils.*;

import java.io.IOException;

public class SierpinskiTriangle {

    RGB t_1, t_2;
    Position position;
    float size;

    public SierpinskiTriangle(RGB transact_1, RGB transact_2, Position pos, float size){
        t_1 = transact_1;
        t_2 = transact_2;
        position = pos;
        this.size = size;
    }

    public void generate(SVG svgDocument, int depth, Position pos, float length, float thickness) throws IOException {

        if (depth <= 0){

            Triangle triangle = new Triangle();

            triangle.generateTriangle(
                    svgDocument,
                    pos,
                    length * 2,
                    t_1,
                    t_2.transact(t_1, t_2, (pos.x - position.x) / size),
                    0, 3,
                    t_1,
                    t_2.transact(t_1, t_2, (pos.x - position.x) / size),
                    0, 3,
                    t_1,
                    t_2.transact(t_1, t_2, (pos.x - position.x) / size),
                    0, 3,
                    thickness
                    );

        }
        else {
            float start_x = pos.x;
            float start_y = pos.y;

            double sq3over2 = 0.866025403;

            Position point_1 = new Position(start_x, start_y);
            Position point_2 = new Position(start_x + length, start_y);
            Position point_3 = new Position((start_x + length / 2.f), (float) (start_y - length * sq3over2));

            generate(svgDocument, depth - 1, point_1, length / 2f, thickness);
            generate(svgDocument, depth - 1, point_2, length / 2f, thickness);
            generate(svgDocument, depth - 1, point_3, length / 2f, thickness);
        }
    }

}
