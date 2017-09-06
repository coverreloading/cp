package cn.reloading.cp.service.Impl;

import cn.reloading.cp.mapper.CpItemsMapper;
import cn.reloading.cp.po.CpItems;
import cn.reloading.cp.service.CpItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vincent on 17/9/6.
 */
@Service("CpItemsService")
public class CpItemsServiceImpl implements CpItemsService {

    @Autowired
    private CpItemsMapper mapper;

    public int insert(CpItems items) {
        System.out.println("start");
        return mapper.insertSelective(items);
    }
}
