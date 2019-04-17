package com.springboot.dm.mapper;

import com.springboot.dm.entity.SysSysauditlog;
import com.springboot.dm.entity.SysSysauditlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSysauditlogMapper {
    long countByExample(SysSysauditlogExample example);

    int deleteByExample(SysSysauditlogExample example);

    int insert(SysSysauditlog record);

    int insertSelective(SysSysauditlog record);

    List<SysSysauditlog> selectByExample(SysSysauditlogExample example);

    int updateByExampleSelective(@Param("record") SysSysauditlog record, @Param("example") SysSysauditlogExample example);

    int updateByExample(@Param("record") SysSysauditlog record, @Param("example") SysSysauditlogExample example);
}