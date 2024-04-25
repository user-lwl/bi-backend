package com.lwl.bi.mapper;

import com.lwl.bi.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
* @author HP
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2024-04-06 19:13:30
* @Entity com.lwl.bi.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {

    List<Map<String, Object>> queryChartData(String querySql);
}




