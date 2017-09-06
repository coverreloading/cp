package cn.reloading.cp.mapper;

import cn.reloading.cp.po.CpComment;
import cn.reloading.cp.po.CpCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpCommentMapper {
    int countByExample(CpCommentExample example);

    int deleteByExample(CpCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CpComment record);

    int insertSelective(CpComment record);

    List<CpComment> selectByExample(CpCommentExample example);

    CpComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CpComment record, @Param("example") CpCommentExample example);

    int updateByExample(@Param("record") CpComment record, @Param("example") CpCommentExample example);

    int updateByPrimaryKeySelective(CpComment record);

    int updateByPrimaryKey(CpComment record);
}