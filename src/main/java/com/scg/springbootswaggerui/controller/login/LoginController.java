package com.scg.springbootswaggerui.controller.login;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 登陆管理
 *
 * @author cat-fishing
 * @create 2019/07/23
 * @since 1.0.0
 */
@RestController
@Api(value = "LoginController", description = "登陆管理")
@RequestMapping("/demo/LoginController")
@Slf4j
public class LoginController {

    @ApiOperation(value = "获取登录时间接口", notes = "获取登录时间接口")
    @ApiImplicitParam(name = "user", value = "用户", required = true, dataType = "String",paramType="query")
    @RequestMapping(value = "/login.do", method = { RequestMethod.POST,RequestMethod.GET})
    public Object login(HttpServletRequest request){
        log.info("打印所有参数："+JSON.toJSONString(request.getParameterMap()));
        log.info("登陆用户为："+request.getParameter("user"));
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
