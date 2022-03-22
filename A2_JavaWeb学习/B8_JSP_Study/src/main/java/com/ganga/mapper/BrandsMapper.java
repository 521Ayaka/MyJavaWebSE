package com.ganga.mapper;

import com.ganga.pojo.Brands;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandsMapper {

    List<Brands> selectAll();

}
