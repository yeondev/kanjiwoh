package com.alive.kanjiwoh.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.alive.kanjiwoh.model.WordDto;

@Mapper
public interface WordMapper {

	WordDto findAll();
}
