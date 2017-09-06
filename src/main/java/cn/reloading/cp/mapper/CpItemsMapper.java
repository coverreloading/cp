package cn.reloading.cp.mapper;

import cn.reloading.cp.po.CpItems;
import cn.reloading.cp.po.CpItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpItemsMapper {
    int countByExample(CpItemsExample example);

    int deleteByExample(CpItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CpItems record);

    int insertSelective(CpItems record);

    List<CpItems> selectByExampleWithBLOBs(CpItemsExample example);

    List<CpItems> selectByExample(CpItemsExample example);

    CpItems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CpItems record, @Param("example") CpItemsExample example);

    int updateByExampleWithBLOBs(@Param("record") CpItems record, @Param("example") CpItemsExample example);

    int updateByExample(@Param("record") CpItems record, @Param("example") CpItemsExample example);

    int updateByPrimaryKeySelective(CpItems record);

    int updateByPrimaryKeyWithBLOBs(CpItems record);

    int updateByPrimaryKey(CpItems record);
}