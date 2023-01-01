package FactoryDesignPattern.SimpleFactory;

public class ProductPost extends Post{


    private String imageUrl;

    @Override
    public String toString() {
        return "ProductPost{" +
                "imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
