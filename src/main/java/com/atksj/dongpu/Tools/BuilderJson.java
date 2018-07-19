package com.atksj.dongpu.Tools;

import com.atksj.dongpu.resource_manage.Entity.ResourceManage;
import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class BuilderJson {

    List<ResourceManage> ResourceManages = new ArrayList<ResourceManage>();

    public BuilderJson(List<ResourceManage> resourceManages) {
        super();
        this.ResourceManages = resourceManages;
    }

    //获取集合中所有的根节点
    public List<ResourceManage> getRootResourceManages() {
        List<ResourceManage> rootResourceManages = new ArrayList<ResourceManage>();

        for (ResourceManage n : ResourceManages) {
            if (rootResourceManage(n)) {
                rootResourceManages.add(n);
            }
        }
        return rootResourceManages;
    }

    //判断是否为根节点
    public boolean rootResourceManage(ResourceManage ResourceManage) {
        boolean isRootResourceManage = true;
        for (ResourceManage n : ResourceManages) {
            if (ResourceManage.getParent_id().equals(n.getId())) {
                isRootResourceManage = false;
                break;
            }
        }

        return isRootResourceManage;
    }

    //获取父节点的所有子节点
    public List<ResourceManage> getChildResourceManages(ResourceManage pResourceManage) {
        List<ResourceManage> childResourceManages = new ArrayList<ResourceManage>();
        for (ResourceManage n : ResourceManages) {
            if (pResourceManage.getId().equals(n.getParent_id())) {
                childResourceManages.add(n);
            }
        }

        return childResourceManages;
    }

    //递归子节点
    public void buildChildResourceManages(ResourceManage ResourceManage) {
        List<ResourceManage> children = getChildResourceManages(ResourceManage);
        if (!children.isEmpty()) {
            for (ResourceManage child :
                    children) {
                buildChildResourceManages(child);
            }
            ResourceManage.setSubmenus(children);
        }

    }

    //构建树形结构
    public List<ResourceManage> buildTree(){
        List<ResourceManage> treeResourceManages = new ArrayList<ResourceManage>();
        List<ResourceManage> rootResourceManages = getRootResourceManages();
        for (ResourceManage rootResourceManage:
             rootResourceManages) {
            buildChildResourceManages(rootResourceManage);
            treeResourceManages.add(rootResourceManage);
        }
        return treeResourceManages;
    }

    //返回树形结构
    public List<ResourceManage> buildJsonTree(){
        List<ResourceManage> jsonTree = buildTree();
//        JSONArray js = JSONArray.fromObject(jsonTree);
        return jsonTree;
    }

}
