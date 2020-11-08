import java.awt.*;
import java.awt.image.BufferedImage;

public class MonsterImages{
    public static void monsterText(String textToPrint) {
        BufferedImage bufferedImage = new BufferedImage(
                100, 20,
                BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();

        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        int width = textToPrint.length();
        graphics2D.drawString(textToPrint, width, 12);
        for (int y = 0; y < 20; y++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int x = 10; x < width; x++) {
                stringBuilder.append(bufferedImage.getRGB(x, y) == -16777216 ? " " : "*");
            }

            if (stringBuilder.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(stringBuilder);
        }
    }
}