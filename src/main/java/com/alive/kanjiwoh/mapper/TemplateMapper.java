package com.alive.kanjiwoh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.alive.kanjiwoh.model.TemplateDto;

@Mapper
public interface TemplateMapper {

	List<TemplateDto> selectTemplateInfo(Integer userId);
}
