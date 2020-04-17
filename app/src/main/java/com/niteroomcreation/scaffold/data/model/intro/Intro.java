package com.niteroomcreation.scaffold.data.model.intro;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class Intro implements Parcelable {

    private String title;
    private String subTitle;
    private String urlImage;

    public Intro(String title){
        this.title = title;
        this.subTitle = "";
        this.urlImage = "";
    }

    protected Intro(Parcel in) {
        title = in.readString();
        subTitle = in.readString();
        urlImage = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(subTitle);
        dest.writeString(urlImage);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Intro> CREATOR = new Creator<Intro>() {
        @Override
        public Intro createFromParcel(Parcel in) {
            return new Intro(in);
        }

        @Override
        public Intro[] newArray(int size) {
            return new Intro[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
