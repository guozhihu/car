package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.CarRentStyle;
import com.gdou.car.business.car.dal.entitys.CarRentStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarRentStyleMapper {
    int countByExample(CarRentStyleExample example);

    int deleteByExample(CarRentStyleExample example);

    int deleteByPrimaryKey(Integer styleId);

    int insert(CarRentStyle record);

    int insertSelective(CarRentStyle record);

    List<CarRentStyle> selectByExample(CarRentStyleExample example);

    CarRentStyle selectByPrimaryKey(Integer styleId);

    int updateByExampleSelective(@Param("record") CarRentStyle record, @Param("example") CarRentStyleExample example);

    int updateByExample(@Param("record") CarRentStyle record, @Param("example") CarRentStyleExample example);

    int updateByPrimaryKeySelective(CarRentStyle record);

    int updateByPrimaryKey(CarRentStyle record);
}