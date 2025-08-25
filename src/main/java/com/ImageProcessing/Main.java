package com.ImageProcessing;

import com.ImageProcessing.filter.GreyScaleFilter;
import com.ImageProcessing.filter.ImageFilter;
import com.ImageProcessing.io.FileImageIO;
import com.ImageProcessing.io.ImageReadInf;
import com.ImageProcessing.processor.DrawMultipleImagesOnCanvas;
import com.ImageProcessing.processor.ImageProcessor;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        DrawMultipleImagesOnCanvas drawMultipleImagesOnCanvas = DrawMultipleImagesOnCanvas.getInstance();
        drawMultipleImagesOnCanvas.initialize(stage);

        ImageReadInf imageIO = new FileImageIO();
        BufferedImage image = imageIO.readImage("C:\\Users\\Pragyan Sen\\ImageProcessing\\src\\main\\resources\\test.jpg");
        System.out.println("Image loaded: " + image.getWidth() + "x" + image.getHeight());

        ImageProcessor processor = new ImageProcessor();
        ImageFilter imageFilter = new GreyScaleFilter();


        processor.processImage(image, 50, imageFilter, drawMultipleImagesOnCanvas);

        Platform.setImplicitExit(false);
    }



    public static void main(String[] args) {
        launch();
    }
}
