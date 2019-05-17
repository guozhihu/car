package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.CarConfigInfo;
import com.gdou.car.business.car.dal.entitys.CarConfigInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarConfigInfoMapper {
    int countByExample(CarConfigInfoExample example);

    int deleteByExample(CarConfigInfoExample example);

    int deleteByPrimaryKey(String carId);

    int insert(CarConfigInfo record);

    int insertSelective(CarConfigInfo record);

    List<CarConfigInfo> selectByExample(CarConfigInfoExample example);

    CarConfigInfo selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") CarConfigInfo record, @Param("example") CarConfigInfoExample example);

    int updateByExample(@Param("record") CarConfigInfo record, @Param("example") CarConfigInfoExample example);

    int updateByPrimaryKeySelective(CarConfigInfo record);

    int updateByPrimaryKey(CarConfigInfo record);
}