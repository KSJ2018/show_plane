package com.atksj.dongpu.resource_manage.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ResourceManage {

    @Id
    @GeneratedValue
    private String id;
    private String parent_id;
    private String url;
    private String icon;
    private String description;
    private String time;
    private String index;
    private String view_type;
    private List<ResourceManage> submenus;

    public ResourceManage(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public List<ResourceManage> getSubmenus() {
        return submenus;
    }

    public void setSubmenus(List<ResourceManage> submenus) {
        this.submenus = submenus;
    }

    public String getView_type() {
        return view_type;
    }

    public void setView_type(String view_type) {
        this.view_type = view_type;
    }

    @Override
    public String toString() {
        return "ResourceManage{" +
                "id='" + id + '\'' +
                ", parent_id='" + parent_id + '\'' +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                ", index='" + index + '\'' +
                ", view_type='" + view_type + '\'' +
                ", submenus=" + submenus +
                '}';
    }
}
