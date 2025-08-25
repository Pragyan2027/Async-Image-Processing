package com.ImageProcessing.image;

import java.awt.image.BufferedImage;

public class ImageData {
    private final BufferedImage image;
    private int i;  // position X
    private int j;  // position Y
    private int width;
    private int height;

    public ImageData(BufferedImage image, int i, int j, int width, int height) {
        this.image = image;
        this.i = i;
        this.j = j;
        this.width = width;
        this.height = height;
    }

    public int getI() {
        return i;
    }
    public int getJ() {
        return j;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public BufferedImage getImage() {
        return image;
    }
}
