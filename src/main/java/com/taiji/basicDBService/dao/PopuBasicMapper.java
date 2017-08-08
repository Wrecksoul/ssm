package com.taiji.basicDBService.dao;

import com.taiji.basicDBService.entity.PopuBasic;
import com.taiji.basicDBService.entity.PopuBasicExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PopuBasicMapper {
    int countByExample(PopuBasicExample example);

    int deleteByExample(PopuBasicExample example);

    int deleteByPrimaryKey(BigDecimal cardId);

    int insert(PopuBasic record);

    int insertSelective(PopuBasic record);

    List<PopuBasic> selectByExample(PopuBasicExample example);

    PopuBasic selectByPrimaryKey(BigDecimal cardId);

    int updateByExampleSelective(@Param("record") PopuBasic record, @Param("example") PopuBasicExample example);

    int updateByExample(@Param("record") PopuBasic record, @Param("example") PopuBasicExample example);

    int updateByPrimaryKeySelective(PopuBasic record);

    int updateByPrimaryKey(PopuBasic record);
}