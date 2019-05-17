package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.CarPrice;
import com.gdou.car.business.car.dal.entitys.CarPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarPriceMapper {
    int countByExample(CarPriceExample example);

    int deleteByExample(CarPriceExample example);

    int insert(CarPrice record);

    int insertSelective(CarPrice record);

    List<CarPrice> selectByExample(CarPriceExample example);

    int updateByExampleSelective(@Param("record") CarPrice record, @Param("example") CarPriceExample example);

    int updateByExample(@Param("record") CarPrice record, @Param("example") CarPriceExample example);
}