package com.gdou.car.business.user.dal.persistence;

import com.gdou.car.business.user.dal.entitys.UserDetailInfo;
import com.gdou.car.business.user.dal.entitys.UserDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDetailInfoMapper {
    int countByExample(UserDetailInfoExample example);

    int deleteByExample(UserDetailInfoExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserDetailInfo record);

    int insertSelective(UserDetailInfo record);

    List<UserDetailInfo> selectByExample(UserDetailInfoExample example);

    UserDetailInfo selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserDetailInfo record, @Param("example") UserDetailInfoExample example);

    int updateByExample(@Param("record") UserDetailInfo record, @Param("example") UserDetailInfoExample example);

    int updateByPrimaryKeySelective(UserDetailInfo record);

    int updateByPrimaryKey(UserDetailInfo record);
}