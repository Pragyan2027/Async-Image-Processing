package com.ImageProcessing.filter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GreyScaleFilter implements ImageFilter {

    @Override
    public BufferedImage filter(BufferedImage originalImage) {
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        BufferedImage grayscaleImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = originalImage.getRGB(x, y);

                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int gray = (int) (0.2126 * r + 0.7152 * g + 0.0722 * b);

                int newRgb = new Color(gray, gray, gray).getRGB();
                grayscaleImage.setRGB(x, y, newRgb);
            }
        }
        return grayscaleImage;
    }

    @Override
    public BufferedImage apply(BufferedImage subimage) {
        return filter(subimage);
    }
}

