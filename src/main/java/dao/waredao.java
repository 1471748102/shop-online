package dao;

import bean.ST;
import bean.Ware;
import bean.user;

import java.util.List;

public interface waredao {

    boolean user(String username,String password) throws Exception;
    boolean admin(String adminname,String adminpass) throws Exception;

    boolean wareinter(String name) throws Exception;

    boolean zhanghao(String username) throws Exception;
    int zhuce(user usera) throws Exception;

    List<Ware> ShowByPage(int pagenow, int pagesize) throws Exception;
    int count() throws Exception;

    List<ST> shopshow(int pagenow, int pagesize) throws Exception;
    int shopcount() throws Exception;

    int wareadd(Ware wareb) throws Exception;
    boolean waredel(String num) throws Exception;
    void wareupdate(Ware warec) throws Exception;

    List selectbynum(String num) throws Exception;
    List selectbytype(String type) throws Exception;
    List opindex() throws Exception;
    int opcount() throws Exception;

    List selectbyname(String name) throws Exception;
    List selectbyprice(int pricea,int priceb) throws Exception;

    void wareshopadd(ST st) throws Exception;
    void wareshopdel(String num) throws Exception;
}
