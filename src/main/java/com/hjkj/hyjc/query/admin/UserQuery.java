package com.hjkj.hyjc.query.admin;

import com.hjkj.hyjc.query.PageModel;

/***
 * 用户查询用
 * 
 * @author Min
 */
public class UserQuery extends PageModel {
    private String userName;
    private String loginName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

}
