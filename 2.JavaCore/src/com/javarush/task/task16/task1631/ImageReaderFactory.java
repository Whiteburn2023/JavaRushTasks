package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {

        if (imageTypes == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        if (ImageTypes.JPG == imageTypes) {
            return new JpgReader();
        }
        if (ImageTypes.BMP == imageTypes) {
            return new BmpReader();
        }
        if (ImageTypes.PNG == imageTypes) {
            return new PngReader();
        }


        return null;
    }
}
