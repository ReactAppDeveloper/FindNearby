package madeusapp.com.madeusapp;

/**
 * Created by Harsh on 01/04/2016.
 */
public class Hotels {
    private String name,cost,address;

    public Hotels(String name, String cost, String address) {
        this.name = name;
        this.cost = cost;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //    public ImageView getImageView() {
//        return imageView;
//    }
//
//    public void setImageView(ImageView imageView) {
//        this.imageView = imageView;
//    }
}
