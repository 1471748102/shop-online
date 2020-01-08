package control.wareshop;

import bean.ST;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

import java.util.List;

public class WareShopShow extends ActionSupport {

    private int pagenow=1;
    private int pagesize=5;

    public int getPagenow() {
        return pagenow;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagenow(int pagenow) {
        this.pagenow = pagenow;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String execute() throws Exception{

        int current_page=getPagenow();
        //System.out.println(getPagenow());
        ActionContext context=ActionContext.getContext();
        waredao stu = new waredaoimp();
        List<ST> list=stu.shopshow(pagenow,pagesize);
        int pages=stu.shopcount();
        StringBuffer s=new StringBuffer();
        int temp=(pages/pagesize)+1;
        // System.out.println(temp);
        for(int i=1;i<=temp;i++){
            if(i==current_page){
                s.append("["+i+"]");
                //System.out.println("ERROR");
            }
            else{
                s.append("<a href='shopshow?pagenow="+i+"'>"+i+"</a>");
                // System.out.println("YES");
            }
        }

        context.put("list", list);
        context.put("s",s);
        return "success";
    }
}
