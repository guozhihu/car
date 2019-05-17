package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.CarRelease;
import com.gdou.car.business.car.dal.entitys.CarReleaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarReleaseMapper {
    int countByExample(CarReleaseExample example);

    int deleteByExample(CarReleaseExample example);

    int deleteByPrimaryKey(String releaseId);

    int insert(CarRelease record);

    int insertSelective(CarRelease record);

    List<CarRelease> selectByExample(CarReleaseExample example);

    CarRelease selectByPrimaryKey(String releaseId);

    int updateByExampleSelective(@Param("record") CarRelease record, @Param("example") CarReleaseExample example);

    int updateByExample(@Param("record") CarRelease record, @Param("example") CarReleaseExample example);

    int updateByPrimaryKeySelective(CarRelease record);

    int updateByPrimaryKey(CarRelease record);
}