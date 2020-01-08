package bean;

public class user {
    private String name;
    private String pass;
    private String email;
    private String tel;
    private String addr;

    public user() {
    }

    public user(String name, String pass, String email, String tel, String addr) {
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.tel = tel;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
