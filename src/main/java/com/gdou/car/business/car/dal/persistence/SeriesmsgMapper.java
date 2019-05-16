package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.Seriesmsg;
import com.gdou.car.business.car.dal.entitys.SeriesmsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SeriesmsgMapper {
    int countByExample(SeriesmsgExample example);

    int deleteByExample(SeriesmsgExample example);

    int deleteByPrimaryKey(String seriesid);

    int insert(Seriesmsg record);

    int insertSelective(Seriesmsg record);

    List<Seriesmsg> selectByExample(SeriesmsgExample example);

    Seriesmsg selectByPrimaryKey(String seriesid);

    int updateByExampleSelective(@Param("record") Seriesmsg record, @Param("example") SeriesmsgExample example);

    int updateByExample(@Param("record") Seriesmsg record, @Param("example") SeriesmsgExample example);

    int updateByPrimaryKeySelective(Seriesmsg record);

    int updateByPrimaryKey(Seriesmsg record);
}