package com.yunfei.vuecrudproduct.mapper;

import com.yunfei.vuecrudproduct.entity.Licensing;
import com.yunfei.vuecrudproduct.entity.LicensingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LicensingMapper {
    long countByExample(LicensingExample example);

    int deleteByExample(LicensingExample example);

    int insert(Licensing record);

    int insertSelective(Licensing record);

    List<Licensing> selectByExample(LicensingExample example);

    int updateByExampleSelective(@Param("record") Licensing record, @Param("example") LicensingExample example);

    int updateByExample(@Param("record") Licensing record, @Param("example") LicensingExample example);
}