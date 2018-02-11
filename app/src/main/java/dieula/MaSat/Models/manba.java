package dieula.MaSat.Models;

import java.io.Serializable;
import java.util.ArrayList;

import dieula.MaSat.R;

/**
 * Created by East Coast Pawn on 1/13/2018.
 */

public class manba implements Serializable {


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public int getImage1() {
        return image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    int image, image1,image2;
    String title;

    public manba() {
    }

    public static ArrayList<manba> fromFakeData() {
        ArrayList<manba> results = new ArrayList<>();

        manba favori = new manba();
        favori.setTitle("Détails");
        favori.setImage(R.mipmap.heart);
        favori.setImage1(R.mipmap.placeholder);
        favori.setImage2(R.drawable.ta);

        manba favori1 = new manba();
        favori1.setTitle("Détails");
        favori1.setImage(R.mipmap.heart);
        favori1.setImage1(R.mipmap.placeholder);
        favori1.setImage2(R.drawable.ra);

        manba favori2 = new manba();
        favori2.setTitle("Détails");
        favori2.setImage(R.mipmap.heart);
        favori2.setImage1(R.mipmap.placeholder);
        favori2.setImage2(R.drawable.ma);


        results.add(favori2);
        results.add(favori);
        results.add(favori1);
        return results;
    }
}
