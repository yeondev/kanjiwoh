package com.alive.kanjiwoh.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.alive.kanjiwoh.model.WordDto;
import com.alive.kanjiwoh.model.WordGroupDto;

@Mapper
public interface WordMapper {

	WordDto findAll();

	int insertWordGroup(WordGroupDto wordGroupDto);

	int insertWord(WordDto wordDto);
}
