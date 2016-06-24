package com.kyriakosalexandrou.hostelworld;

import com.kyriakosalexandrou.hostelworld.models.Image;

import java.util.List;

/**
 * Created by Kyriakos on 24/06/2016.
 * <p/>
 * wrappers around our images main API logic
 */
public class ImageUtil {

    public static String loadFirstImage(List<Image> images) {
        String completeImageUrl = "";

        if (!images.isEmpty()) {
            Image image = images.get(0);
            completeImageUrl = image.getPrefix() + image.getSuffix();
        }
        return completeImageUrl;
    }
}