package com.alive.kanjiwoh.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class WordDto {

	private int wordNo;
	private int seasonNo;
	private String kanji;
	private String hiragana;
	private String korean;
	private String memo;
	private LocalDateTime insDate;
	
}
