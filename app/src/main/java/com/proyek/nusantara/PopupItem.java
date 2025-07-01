package com.proyek.nusantara;

public class PopupItem {
    private final String imageUrl;
    private final String text;

    public PopupItem(String imageUrl, String text) {
        this.imageUrl = imageUrl;
        this.text = text;
    }
    public String getImageUrl() { return imageUrl; }
    public String getText() { return text; }
}