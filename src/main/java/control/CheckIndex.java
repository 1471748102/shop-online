package control;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

import java.util.Map;

public class CheckIndex extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void validate(){

        if(username==null || username.length()==0 || password ==  null || password.length()==0)
        {
            addFieldError("uka",this.getText("Err!This Is Null!"));
        }

    }


    public String execute() throws Exception {

        waredao index = new waredaoimp();
        boolean flag = index.user(username,password);
        if(flag){
            Map session= ActionContext.getContext().getSession();
            session.put("username",username);
        }
        return flag? SUCCESS : ERROR;

    }
}
