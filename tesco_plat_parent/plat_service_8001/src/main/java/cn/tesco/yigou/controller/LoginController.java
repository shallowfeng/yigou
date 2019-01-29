package cn.tesco.yigou.controller;

import cn.tesco.yigou.domain.Employee;
import cn.tesco.yigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword())){
            return AjaxResult.getAjaxResult().setSuccess(true).setMessage("登陆成功");
        }
        return AjaxResult.getAjaxResult().setSuccess(false).setMessage("登陆失败");
    }
}
