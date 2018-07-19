package com.atksj.dongpu.resource_manage.Service.Impl;

import com.atksj.dongpu.resource_manage.Entity.ResourceManage;
import com.atksj.dongpu.resource_manage.Mapper.ResourceManageMapper;
import com.atksj.dongpu.resource_manage.Service.ResourceManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.soap.Node;
import java.util.List;
import java.util.Map;

@Service
public class ResourceManageServiceImpl implements ResourceManageService {

    @Autowired
    ResourceManageMapper resourceManageMapper;

    @Override
    public List<ResourceManage> findAllElement() {
        return resourceManageMapper.findAllElement();
    }
}
