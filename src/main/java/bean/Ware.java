package bean;

public class Ware {

    private String num;
    private String name;
    private String type;
    private String price;
    private String rootate;
    private String stock;

    public Ware() {
    }

    public Ware(String num, String name, String type, String price, String rootate, String stock) {
        this.num = num;
        this.name = name;
        this.type = type;
        this.price = price;
        this.rootate = rootate;
        this.stock = stock;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    public String getRootate() {
        return rootate;
    }

    public String getStock() {
        return stock;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRootate(String rootate) {
        this.rootate = rootate;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
