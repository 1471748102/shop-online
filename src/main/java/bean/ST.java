package bean;

public class ST {

    private String stnum;
    private String num;
    private String  name;
    private String type;
    private String price;
    private String rootate;
    private String ststock;

    public ST() {
    }

    public ST(String stnum, String num, String name, String type, String price, String rootate, String ststock) {
        this.stnum = stnum;
        this.num = num;
        this.name = name;
        this.type = type;
        this.price = price;
        this.rootate = rootate;
        this.ststock = ststock;
    }

    public String getStnum() {
        return stnum;
    }

    public void setStnum(String stnum) {
        this.stnum = stnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRootate() {
        return rootate;
    }

    public void setRootate(String rootate) {
        this.rootate = rootate;
    }

    public String getStstock() {
        return ststock;
    }

    public void setStstock(String ststock) {
        this.ststock = ststock;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
