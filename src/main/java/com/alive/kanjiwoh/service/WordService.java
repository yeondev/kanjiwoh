package com.alive.kanjiwoh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alive.kanjiwoh.mapper.WordMapper;
import com.alive.kanjiwoh.model.WordDto;
import com.alive.kanjiwoh.model.WordGroupDto;
import com.alive.kanjiwoh.user.DummyUserInfo;

@Service
public class WordService {

    @Autowired
    WordMapper wordMapper;
    
    public WordDto test() {
        return wordMapper.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
	public WordGroupDto add(WordGroupDto wordGroupDto) {
		
		// insert group data
		int result = wordMapper.insertWordGroup(wordGroupDto);
		
		if(result == 0) {
			throw new RuntimeException("error");
		}
		// insert word data
		DummyUserInfo dummyUserInfo = new DummyUserInfo();
		int userNo = dummyUserInfo.getUserNo();
		int groupNo = wordGroupDto.getGroupNo();
		for (WordDto wordDto : wordGroupDto.getWordList()) {
			wordDto.setUserNo(userNo);
			wordDto.setGroupNo(groupNo);
			int wordResult = wordMapper.insertWord(wordDto);
			
			if(wordResult == 0) {
				throw new RuntimeException("error");
			}
			
		}
		
		return wordGroupDto;
	}
}
