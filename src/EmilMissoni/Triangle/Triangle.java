package EmilMissoni.Triangle;

import EmilMissoni.SVG.Utils.*;
import EmilMissoni.SVG.SVG;

import java.io.IOException;

public class Triangle {

    public void generateTriangle(SVG svgDocument, Position startPos, float length, RGB rgb1, RGB rgb1_f, float startTime_1, float endTime_1, RGB rgb2, RGB rgb2_f, float startTime_2, float endTime_2, RGB rgb3, RGB rgb3_f, float startTime_3, float endTime_3, float triangle_thickness) throws IOException {
        float start_x = startPos.x;
        float start_y = startPos.y;

        double sq3over2 = 0.866025403;

        Position point_1 = new Position(start_x, start_y);
        Position point_2 = new Position(start_x + length, start_y);
        Position point_3 = new Position( (start_x + length / 2.f), (float)(start_y - length * sq3over2));

        svgDocument.Line(point_1, point_2, rgb1, rgb1_f, startTime_1, endTime_1, triangle_thickness);
        svgDocument.Line(point_1, point_3, rgb2, rgb2_f, startTime_2, endTime_2, triangle_thickness);
        svgDocument.Line(point_2, point_3, rgb3, rgb3_f, startTime_3, endTime_3, triangle_thickness);

    }

}
