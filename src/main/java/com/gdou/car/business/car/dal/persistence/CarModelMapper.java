package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.CarModel;
import com.gdou.car.business.car.dal.entitys.CarModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarModelMapper {
    int countByExample(CarModelExample example);

    int deleteByExample(CarModelExample example);

    int deleteByPrimaryKey(String modelId);

    int insert(CarModel record);

    int insertSelective(CarModel record);

    List<CarModel> selectByExample(CarModelExample example);

    CarModel selectByPrimaryKey(String modelId);

    int updateByExampleSelective(@Param("record") CarModel record, @Param("example") CarModelExample example);

    int updateByExample(@Param("record") CarModel record, @Param("example") CarModelExample example);

    int updateByPrimaryKeySelective(CarModel record);

    int updateByPrimaryKey(CarModel record);
}