package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.mapper.TiXianMapper;

@Service
public class TiXianService {
	@Autowired
	private TiXianMapper tiXianMapper;

}
