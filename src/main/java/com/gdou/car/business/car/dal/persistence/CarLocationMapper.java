package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.CarLocation;
import com.gdou.car.business.car.dal.entitys.CarLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarLocationMapper {
    int countByExample(CarLocationExample example);

    int deleteByExample(CarLocationExample example);

    int deleteByPrimaryKey(String locationInfoId);

    int insert(CarLocation record);

    int insertSelective(CarLocation record);

    List<CarLocation> selectByExample(CarLocationExample example);

    CarLocation selectByPrimaryKey(String locationInfoId);

    int updateByExampleSelective(@Param("record") CarLocation record, @Param("example") CarLocationExample example);

    int updateByExample(@Param("record") CarLocation record, @Param("example") CarLocationExample example);

    int updateByPrimaryKeySelective(CarLocation record);

    int updateByPrimaryKey(CarLocation record);
}