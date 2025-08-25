package com.ImageProcessing.filter;

import java.awt.image.BufferedImage;

public interface ImageFilter {
    BufferedImage filter(BufferedImage image);

    BufferedImage apply(BufferedImage subimage);
}


