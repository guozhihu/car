package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.CarInfo;
import com.gdou.car.business.car.dal.entitys.CarInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CarInfoMapper {
    int countByExample(CarInfoExample example);

    int deleteByExample(CarInfoExample example);

    int deleteByPrimaryKey(String carId);

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    List<CarInfo> selectByExample(CarInfoExample example);

    CarInfo selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") CarInfo record, @Param("example") CarInfoExample example);
    
    @Update("UPDATE car_info SET photo_url = #{photoUrl} WHERE car_id = #{carId}")
    int updatePictureUrl(@Param("carId") String carId, @Param("photoUrl") String photoUrl);

    int updateByExample(@Param("record") CarInfo record, @Param("example") CarInfoExample example);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
}