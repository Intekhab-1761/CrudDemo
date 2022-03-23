package com.tns.Springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	public Human() {
	}

	Heart heart;

	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();
	}

}
