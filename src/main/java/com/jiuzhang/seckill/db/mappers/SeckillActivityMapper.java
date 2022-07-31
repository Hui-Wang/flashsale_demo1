package com.jiuzhang.seckill.db.mappers;

import com.jiuzhang.seckill.db.po.SeckillActivity;

import java.util.List;

public interface SeckillActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillActivity row);

    int insertSelective(SeckillActivity row);

    SeckillActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillActivity row);

    int updateByPrimaryKey(SeckillActivity row);

    List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus);

    int lockStock(Long seckillActivityId);

    int deductStock(Long seckillActivityId);

    void revertStock(Long seckillActivityId);
}