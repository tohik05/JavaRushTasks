package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes enums) {
        if (enums == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        ImageReader result;
        if (enums == ImageTypes.BMP) {
            result = new BmpReader();
        } else if (enums == ImageTypes.PNG) {
            result = new PngReader();
        } else if (enums == ImageTypes.JPG) {
            result = new JpgReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return result;
    }
}



