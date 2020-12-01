package com.evan.wj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import com.evan.wj.pojo.User;
import com.evan.wj.result.Result;
import com.evan.wj.service.UserService;

@Controller
public class LoginController {
    final String userNameChk = "admin";
    final String passwordChk = "123456";

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser, HttpSession session) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = HtmlUtils.htmlEscape(nvl(requestUser.getUsername()));
        String pwd = nvl(requestUser.getPassword());
        Result ret = new Result();

        if ("".equals(username)) {
            ret.setErrMsg("ユーザー名が必須です。");
        } else {
            User user = userService.getByName(username);

            if (null == user) {
                ret.setErrMsg("ユーザー名が存在しません。");
            } else {
                if (!pwd.equals(user.getPassword())) {
                    ret.setErrMsg("パスワードが不正です。");
                }
                session.setAttribute("user", user);
            }
        }

        if (nvl(ret.getErrMsg()).length() > 0) {
            ret.setCode(400);
            return ret;
        } else {
            ret.setCode(200);
            return ret;
        }
    }

    private String nvl(Object pVal) {
        return (pVal == null) ? "" : pVal.toString();
    }
}
