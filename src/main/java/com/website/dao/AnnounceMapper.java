package com.website.dao;

import com.website.pojo.Announce;
import com.website.pojo.AnnounceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnounceMapper {
    int countByExample(AnnounceExample example);

    int deleteByExample(AnnounceExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Announce record);

    int insertSelective(Announce record);

    List<Announce> selectByExampleWithBLOBs(AnnounceExample example);

    List<Announce> selectByExample(AnnounceExample example);

    Announce selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByExampleWithBLOBs(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByExample(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByPrimaryKeySelective(Announce record);

    int updateByPrimaryKeyWithBLOBs(Announce record);

    int updateByPrimaryKey(Announce record);
}