package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.Carmodel;
import com.gdou.car.business.car.dal.entitys.CarmodelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarmodelMapper {
    int countByExample(CarmodelExample example);

    int deleteByExample(CarmodelExample example);

    int insert(Carmodel record);

    int insertSelective(Carmodel record);

    List<Carmodel> selectByExample(CarmodelExample example);

    int updateByExampleSelective(@Param("record") Carmodel record, @Param("example") CarmodelExample example);

    int updateByExample(@Param("record") Carmodel record, @Param("example") CarmodelExample example);
}