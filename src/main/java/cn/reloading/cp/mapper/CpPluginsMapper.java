package cn.reloading.cp.mapper;

import cn.reloading.cp.po.CpPlugins;
import cn.reloading.cp.po.CpPluginsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpPluginsMapper {
    int countByExample(CpPluginsExample example);

    int deleteByExample(CpPluginsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CpPlugins record);

    int insertSelective(CpPlugins record);

    List<CpPlugins> selectByExampleWithBLOBs(CpPluginsExample example);

    List<CpPlugins> selectByExample(CpPluginsExample example);

    CpPlugins selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CpPlugins record, @Param("example") CpPluginsExample example);

    int updateByExampleWithBLOBs(@Param("record") CpPlugins record, @Param("example") CpPluginsExample example);

    int updateByExample(@Param("record") CpPlugins record, @Param("example") CpPluginsExample example);

    int updateByPrimaryKeySelective(CpPlugins record);

    int updateByPrimaryKeyWithBLOBs(CpPlugins record);

    int updateByPrimaryKey(CpPlugins record);
}