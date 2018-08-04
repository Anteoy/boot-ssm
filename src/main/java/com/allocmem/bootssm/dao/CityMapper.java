package com.allocmem.bootssm.dao;

import com.allocmem.bootssm.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zhoudazhuang on 18-8-4.
 */
@Mapper
public interface CityMapper {

    @Select("SELECT id, name, state, country FROM city WHERE state = #{state}")
    City findByState(String state);

}
