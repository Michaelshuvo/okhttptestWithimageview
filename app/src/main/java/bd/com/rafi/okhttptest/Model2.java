package bd.com.rafi.okhttptest;

public class Model2 {
    private int id;
    private String name;
    private String types;
    private String colorofeyes;
    private String image;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getColorofeyes() {
        return colorofeyes;
    }

    public void setColorofeyes(String colorofeyes) {
        this.colorofeyes = colorofeyes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public Model2(int id, String name, String types, String colorofeyes, String image) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.colorofeyes = colorofeyes;
        this.image = image;
    }



}
