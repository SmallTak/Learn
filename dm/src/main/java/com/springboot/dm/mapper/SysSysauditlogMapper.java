package com.springboot.dm.mapper;

import com.springboot.dm.entity.SysSysauditlog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysSysauditlogMapper {

    int insert(SysSysauditlog record);


}