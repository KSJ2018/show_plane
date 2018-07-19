package com.atksj.dongpu.resource_manage.Controller;

import com.atksj.dongpu.Tools.BuilderJson;
import com.atksj.dongpu.resource_manage.Entity.ResourceManage;
import com.atksj.dongpu.resource_manage.Service.Impl.ResourceManageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class ResourceManageController {


    @Autowired
    ResourceManageServiceImpl resourceManageService;

    @RequestMapping("/")
    public String getResource(HttpSession session) {
        return "index";
    }

    @RequestMapping("/getResource")
    public @ResponseBody List<ResourceManage> getName() {

        List<ResourceManage> nodes =resourceManageService.findAllElement();
        BuilderJson bj = new BuilderJson(nodes);
        List<ResourceManage> result = bj.buildJsonTree();
        return result;
    }


}
