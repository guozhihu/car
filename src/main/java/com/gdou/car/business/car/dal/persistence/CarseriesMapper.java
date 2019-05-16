package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.Carseries;
import com.gdou.car.business.car.dal.entitys.CarseriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarseriesMapper {
    int countByExample(CarseriesExample example);

    int deleteByExample(CarseriesExample example);

    int deleteByPrimaryKey(String seriesid);

    int insert(Carseries record);

    int insertSelective(Carseries record);

    List<Carseries> selectByExample(CarseriesExample example);

    Carseries selectByPrimaryKey(String seriesid);

    int updateByExampleSelective(@Param("record") Carseries record, @Param("example") CarseriesExample example);

    int updateByExample(@Param("record") Carseries record, @Param("example") CarseriesExample example);

    int updateByPrimaryKeySelective(Carseries record);

    int updateByPrimaryKey(Carseries record);
}