package com.chat.io;

import java.awt.image.BufferedImage;

public interface ImageReadInf {
    <T> BufferedImage readImage(T source) ;
    void sendImage(BufferedImage image) ;
}
