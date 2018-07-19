package com.atksj.dongpu.resource_manage.Service;

import com.atksj.dongpu.resource_manage.Entity.ResourceManage;

import javax.xml.soap.Node;
import java.util.List;
import java.util.Map;

public interface ResourceManageService {

    List<ResourceManage> findAllElement();
}
