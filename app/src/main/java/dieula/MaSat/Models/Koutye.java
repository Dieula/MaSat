package dieula.MaSat.Models;

import java.io.Serializable;
import java.util.ArrayList;

import dieula.MaSat.R;

/**
 * Created by East Coast Pawn on 9/29/2017.
 */

public class Koutye implements Serializable{


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

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle1() {
        return title1;
    }

    String title1;

    public Koutye() {
    }

    public static ArrayList<Koutye> fromFakeData() {
        ArrayList<Koutye> results = new ArrayList<>();

        Koutye Koutye = new Koutye();
        Koutye.setTitle("Détails");
        Koutye.setTitle1("Delmas 242");
        Koutye.setImage(R.mipmap.heart);
        Koutye.setImage1(R.mipmap.placeholder);
        Koutye.setImage2(R.drawable.ma);

        Koutye Koutye1 = new Koutye();
        Koutye1.setTitle("Détails");
        Koutye1.setTitle1("Delmas 24\n" +
                "Rue paul Eugene Magloire");
        Koutye1.setImage(R.mipmap.heart);
        Koutye1.setImage1(R.mipmap.placeholder);
        Koutye1.setImage2(R.drawable.sa);

        Koutye Koutye2 = new Koutye();
        Koutye2.setTitle("Détails");
        Koutye.setTitle1("Delmas 24\n" +
                "Rue paul Eugene Magloire");
        Koutye2.setImage(R.mipmap.heart);
        Koutye2.setImage1(R.mipmap.placeholder);
        Koutye2.setImage2(R.drawable.ta);


        results.add(Koutye);
        results.add(Koutye1);
        results.add(Koutye2);
        return results;
    }
}
