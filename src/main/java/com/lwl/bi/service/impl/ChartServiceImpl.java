package com.lwl.bi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwl.bi.model.entity.Chart;
import com.lwl.bi.service.ChartService;
import com.lwl.bi.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author HP
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-04-06 19:13:30
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




