package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.CarBrand;
import com.gdou.car.business.car.dal.entitys.CarBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarBrandMapper {
    int countByExample(CarBrandExample example);

    int deleteByExample(CarBrandExample example);

    int deleteByPrimaryKey(String brandId);

    int insert(CarBrand record);

    int insertSelective(CarBrand record);

    List<CarBrand> selectByExample(CarBrandExample example);

    CarBrand selectByPrimaryKey(String brandId);

    int updateByExampleSelective(@Param("record") CarBrand record, @Param("example") CarBrandExample example);

    int updateByExample(@Param("record") CarBrand record, @Param("example") CarBrandExample example);

    int updateByPrimaryKeySelective(CarBrand record);

    int updateByPrimaryKey(CarBrand record);
}