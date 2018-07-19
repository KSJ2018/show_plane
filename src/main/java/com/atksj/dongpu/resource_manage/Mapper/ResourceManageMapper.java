package com.atksj.dongpu.resource_manage.Mapper;

import com.atksj.dongpu.resource_manage.Entity.ResourceManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.xml.soap.Node;
import java.util.List;
import java.util.Map;

@Mapper
public interface ResourceManageMapper {

    @Select("select * from resource_manage")
    List<ResourceManage> findAllElement();
}
