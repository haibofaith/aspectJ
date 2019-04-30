package com.crcb.controller;

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
public class AspectController {
    @RequestMapping("/insert")
    @ResponseBody
    public ResultEntity<String> insert(){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return insert");
        return resultEntity;
    }
    @RequestMapping("/insertUser")
    @ResponseBody
    public ResultEntity<String> insertUser(@RequestBody UserEntity user){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return insertUser"+user.getUsername()+user.getPassword());
        return resultEntity;
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public ResultEntity<String> updateUser(@RequestBody UserEntity user){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return updateUser"+user.getUsername()+user.getPassword());
        return resultEntity;
    }
    @RequestMapping("/delete")
    public ResultEntity<String> delete(@RequestParam(name="id") String id){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return delete"+id);
        return resultEntity;
    }

    @RequestMapping("/select")
    @ResponseBody
    public ResultEntity<String> select(@RequestParam(name="id") String id){
        ResultEntity resultEntity = new ResultEntity<String>();
        resultEntity.setData("return select"+id);
        return resultEntity;
    }
}
