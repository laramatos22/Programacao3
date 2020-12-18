package aula8.ex3;

public class Question implements Comparable<Question> {
	
	private String imagePath;			//Path das imagens
	private String questionText;		//Pergunta
	private String questionAnswer;		//Resposta da pergunta
	private String[] options;			//op��es de resposta poss�veis para a pergunta
	private int difficulty;				//n�vel de dificuldade da pergunta
	private int prize;					//pr�mio da pergunta
	
	public Question(String imagePath, String questionText, String questionAnswer, int difficulty, String... options) {
		this.imagePath = imagePath;
		this.questionText = questionText;
		this.questionAnswer = questionAnswer;
		this.difficulty = difficulty;
		this.options = Parser.scrambleArray(options);
	}
	
	public String getImagePath() {return imagePath;}
	public String getQuestionText() {return questionText;}
	public String getQuestionAnswer() {return questionAnswer;}
	public String[] getOptions() {return options;}
	public String getOption(int index) {return options[index];}
	public int getDifficulty() {return difficulty;}
	public int getPrize() {return prize;}
	public void setPrize(final int prize) {this.prize = prize;}
	
	public int compareTo(Question question) {
		return this.difficulty < question.difficulty ? -1 : (this.difficulty == question.difficulty ? 0 : 1);
	}

}
