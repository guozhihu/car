package com.gdou.car.business.order.dal.persistence;

import com.gdou.car.business.order.dal.entitys.CarRentalList;
import com.gdou.car.business.order.dal.entitys.CarRentalListExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarRentalListMapper {
    int countByExample(CarRentalListExample example);

    int deleteByExample(CarRentalListExample example);

    int deleteByPrimaryKey(String listId);

    int insert(CarRentalList record);

    int insertSelective(CarRentalList record);

    List<CarRentalList> selectByExampleWithBLOBs(CarRentalListExample example);

    List<CarRentalList> selectByExample(CarRentalListExample example);

    CarRentalList selectByPrimaryKey(String listId);

    int updateByExampleSelective(@Param("record") CarRentalList record, @Param("example") CarRentalListExample example);

    int updateByExampleWithBLOBs(@Param("record") CarRentalList record, @Param("example") CarRentalListExample example);

    int updateByExample(@Param("record") CarRentalList record, @Param("example") CarRentalListExample example);

    int updateByPrimaryKeySelective(CarRentalList record);

    int updateByPrimaryKeyWithBLOBs(CarRentalList record);

    int updateByPrimaryKey(CarRentalList record);
}