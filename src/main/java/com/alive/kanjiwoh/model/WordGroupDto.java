package com.alive.kanjiwoh.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WordGroupDto {

	private int groupNo;
	private int userNo;
	private String groupName;
	private List<WordDto> wordList;
	
}
