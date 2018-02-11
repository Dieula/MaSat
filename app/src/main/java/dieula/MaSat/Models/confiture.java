package dieula.MaSat.Models;

import java.io.Serializable;
import java.util.ArrayList;

import dieula.MaSat.R;

/**
 * Created by East Coast Pawn on 9/29/2017.
 */

public class confiture implements Serializable{


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

    public confiture() {
    }

    public static ArrayList<confiture> fromFakeData() {
        ArrayList<confiture> results = new ArrayList<>();

        confiture Koutye = new confiture();
        Koutye.setTitle("Détails");
        Koutye.setTitle1("Delmas 242");
        Koutye.setImage(R.mipmap.heart);
        Koutye.setImage1(R.mipmap.ic_buy);
        Koutye.setImage2(R.drawable.ma);

        confiture Koutye1 = new confiture();
        Koutye1.setTitle("Détails");
        Koutye1.setTitle1("Delmas 24\n" +
                "Rue paul Eugene Magloire");
        Koutye1.setImage(R.mipmap.heart);
        Koutye.setImage1(R.mipmap.ic_buy);
        Koutye1.setImage2(R.drawable.sa);

        confiture Koutye2 = new confiture();
        Koutye2.setTitle("Détails");
        Koutye.setTitle1("Delmas 24\n" +
                "Rue paul Eugene Magloire");
        Koutye2.setImage(R.mipmap.heart);
        Koutye.setImage1(R.mipmap.ic_buy);
        Koutye2.setImage2(R.drawable.ra);


        results.add(Koutye);
        results.add(Koutye1);
        results.add(Koutye2);
        return results;
    }
}
