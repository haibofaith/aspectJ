package com.crcb.controller.admin;

import com.crcb.entity.ResultEntity;
import com.crcb.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:haibo.xiong
 * @date:2019/4/29
 * @description:
 */
@Controller
public class AdminController {
    @RequestMapping("/admin/insert")
    @ResponseBody
    public ResultEntity<String> insert(){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return admin insert");
        return resultEntity;
    }
    @RequestMapping("/admin/insertUser")
    @ResponseBody
    public ResultEntity<String> insertUser(@RequestBody UserEntity user){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return admin insertUser"+user.getUsername()+user.getPassword());
        return resultEntity;
    }
    @RequestMapping("/admin/updateUser")
    @ResponseBody
    public ResultEntity<String> updateUser(@RequestBody UserEntity user){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return admin updateUser"+user.getUsername()+user.getPassword());
        return resultEntity;
    }
    @RequestMapping("/admin/delete")
    public ResultEntity<String> delete(@RequestParam(name="id") String id){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return admin delete"+id);
        return resultEntity;
    }

    @RequestMapping("/admin/select")
    @ResponseBody
    public ResultEntity<String> select(@RequestParam(name="id") String id){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return admin select"+id);
        return resultEntity;
    }
}
