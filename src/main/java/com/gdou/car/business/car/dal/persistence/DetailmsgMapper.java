package com.gdou.car.business.car.dal.persistence;

import com.gdou.car.business.car.dal.entitys.Detailmsg;
import com.gdou.car.business.car.dal.entitys.DetailmsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DetailmsgMapper {
    int countByExample(DetailmsgExample example);

    int deleteByExample(DetailmsgExample example);

    int deleteByPrimaryKey(String seriesid);

    int insert(Detailmsg record);

    int insertSelective(Detailmsg record);

    List<Detailmsg> selectByExample(DetailmsgExample example);

    Detailmsg selectByPrimaryKey(String seriesid);

    int updateByExampleSelective(@Param("record") Detailmsg record, @Param("example") DetailmsgExample example);

    int updateByExample(@Param("record") Detailmsg record, @Param("example") DetailmsgExample example);

    int updateByPrimaryKeySelective(Detailmsg record);

    int updateByPrimaryKey(Detailmsg record);
}