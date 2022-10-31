package uet.oop.bomberman.graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Tất cả sprite (hình ảnh game) được lưu trữ vào một ảnh duy nhất
 * Class này giúp lấy ra các sprite riêng từ 1 ảnh chung duy nhất đó
 */
public class SpriteSheet {
    // đường dẫn tới file ảnh
    private String _path;
    // ép kích cỡ ảnh ve SIZE
    public final int SIZE;

    public int[] _pixels;

    public static SpriteSheet tiles = new SpriteSheet("/textures/classic.png", 256);

    /**
     * khởi tạo 1 SpriteSheet
     * @param path
     * @param size
     */
    public SpriteSheet(String path, int size) {
        _path = path;
        SIZE = size;
        _pixels = new int[SIZE * SIZE];
        load();
    }

    /**
     * load ảnh
     */
    private void load() {
        try {
            URL a = SpriteSheet.class.getResource(_path);
            BufferedImage image = ImageIO.read(a);
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, _pixels, 0, w);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}