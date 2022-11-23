package com.tlz.albumarc;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "my_images")
public class MyImages {

    @PrimaryKey(autoGenerate = true)
    public int image_id;
    public String image_type;
    public String image_description;
    public byte[] image;

    public MyImages(String image_type, String image_description, byte[] image) {
        this.image_type = image_type;
        this.image_description = image_description;
        this.image = image;
    }

    public int getImage_id() {
        return image_id;
    }

    public String getImage_type() {
        return image_type;
    }

    public String getImage_description() {
        return image_description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
