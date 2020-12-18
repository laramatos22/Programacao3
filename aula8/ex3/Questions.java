package aula8.ex3;

import java.io.*;
import java.util.*;

public class Questions {
	
	private static final int[] prizes = {
			25, 50, 125, 250, 500, 750, 1500, 2500, 5000, 10000, 16000, 32000, 64000, 125000, 250000
	};
	private final Question[] questions;
	private int idx;
	
	public Questions(final String fileName) throws IOException {
		LinkedList<Question> temp = new LinkedList<>();
		Parser.parse(temp, fileName);
		this.questions = Parser.sort(temp.toArray(new Question[temp.size()]));
		applyPrizes(this);
	}
	
	private static void applyPrizes(final Questions quests) {
		int i=0;
		for(Question question : quests.questions)
			question.setPrize(prizes[i++]);
	}
	
	
	public Question getQuestion() {
		return idx < questions.length ? questions[idx++] : null;
	}
	
	public int lastQuestionPrize() {
		return idx > 0 ? questions[idx - 1].getPrize() : 0;
	}
	
	public boolean noOtherQuestion() {
		return idx >= questions.length;
	}
	

}
