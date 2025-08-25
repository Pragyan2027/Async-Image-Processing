package com.chat.io;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class FileImageReadInf implements ImageReadInf {
    @Override
    public <T> BufferedImage readImage(T source) {
        try{
            String path = (String) source;
            File imageFile = new File(path);
            return ImageIO.read(imageFile);
        }catch (Exception ex){
            System.err.println("Not able to read the image");
            return null;
        }
    }

    @Override
    public void sendImage(BufferedImage image) {
        // Implementation for sending the image
    }

}
