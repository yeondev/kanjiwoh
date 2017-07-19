package com.alive.kanjiwoh.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.alive.kanjiwoh.model.TemplateDto;

@Mapper
public interface TemplateMapper {

	TemplateDto selectTemplateInfo(Integer userId);
}
