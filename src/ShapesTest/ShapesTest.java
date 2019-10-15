package ShapesTest;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;

public class ShapesTest extends GraphicsApp {

    /* Private constants */
    private static final int CANVAS_HEIGHT = 800;
    private static final int CANVAS_WIDTH = 800;
    private static final int FRAME_RATE = 60;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;
    private Triangle triangle;
    private Hexagon hexagon;

    /*
     * This method is called once when the program is started.
     */

    @Override
    public void initialize() {
        setupCanvas();
        initShapes();
    }

    private void initShapes() {
        triangle = new Triangle(250, 250, 100, 100, Colors.BLACK);
        triangle.setBorderWeight(3);
        hexagon = new Hexagon(250, 250, 100, 100, Colors.BLACK);
        hexagon.setBorderWeight(3);
    }

    /*
     * This method is called repeatedly while the program is running.
     */

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        drawShapes();
    }

    private void setupCanvas() {
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        setFrameRate(FRAME_RATE);
    }

    private void drawShapes() {
        triangle.move(2, 2);
        triangle.draw();
        hexagon.move(-2, -2);
        hexagon.draw();
    }
}