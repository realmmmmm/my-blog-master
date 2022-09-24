package cn.mmm.dto;

import cn.mmm.model.MetaDomain;

/**
 * 标签、分类列表
 * Created by mmm
 */
public class MetaDto extends MetaDomain {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
