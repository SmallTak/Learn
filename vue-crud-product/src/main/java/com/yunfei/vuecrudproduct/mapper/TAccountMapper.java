package com.yunfei.vuecrudproduct.mapper;

import com.yunfei.vuecrudproduct.entity.TAccount;
import com.yunfei.vuecrudproduct.entity.TAccountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TAccountMapper {
    long countByExample(TAccountExample example);

    int deleteByExample(TAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAccount record);

    int insertSelective(TAccount record);

    List<TAccount> selectByExample(TAccountExample example);

    TAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TAccount record, @Param("example") TAccountExample example);

    int updateByExample(@Param("record") TAccount record, @Param("example") TAccountExample example);

    int updateByPrimaryKeySelective(TAccount record);

    int updateByPrimaryKey(TAccount record);
}