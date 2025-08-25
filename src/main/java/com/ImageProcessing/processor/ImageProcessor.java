package com.ImageProcessing.processor;

import com.ImageProcessing.filter.ImageFilter;
import com.ImageProcessing.image.ImageData;


import java.awt.image.BufferedImage;

public class ImageProcessor {

    public void processImage(BufferedImage image, int tileSize,
                             ImageFilter filter,
                             DrawMultipleImagesOnCanvas canvas) {
        int width = image.getWidth();
        int height = image.getHeight();

        for (int y = 0; y < height; y += tileSize) {
            for (int x = 0; x < width; x += tileSize) {
                int w = Math.min(tileSize, width - x);
                int h = Math.min(tileSize, height - y);

                BufferedImage tile = image.getSubimage(x, y, w, h);
                BufferedImage processed = filter.apply(tile);

                canvas.addImageToQueue(new ImageData(processed, x, y, w, h));
            }
        }
    }
}

