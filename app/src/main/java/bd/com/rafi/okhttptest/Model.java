package bd.com.rafi.okhttptest;

public class Model {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Model(int id, String email, String fname, String lname) {
        this.id = id;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
    }
    public Model(int id,String name){
        this.id = id;
        this.fname=name;
    }

    private String email;
    private String fname;
    private String lname;

}
