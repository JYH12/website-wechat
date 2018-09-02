package com.website.dao;

import com.website.pojo.Cases;
import com.website.pojo.CasesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CasesMapper {
    int countByExample(CasesExample example);

    int deleteByExample(CasesExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Cases record);

    int insertSelective(Cases record);

    List<Cases> selectByExampleWithBLOBs(CasesExample example);

    List<Cases> selectByExample(CasesExample example);

    Cases selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Cases record, @Param("example") CasesExample example);

    int updateByExampleWithBLOBs(@Param("record") Cases record, @Param("example") CasesExample example);

    int updateByExample(@Param("record") Cases record, @Param("example") CasesExample example);

    int updateByPrimaryKeySelective(Cases record);

    int updateByPrimaryKeyWithBLOBs(Cases record);

    int updateByPrimaryKey(Cases record);
}