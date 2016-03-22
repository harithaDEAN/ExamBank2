


import java.util.Vector;

public class MakeFishExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Fish Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("Which city has golden gate in it?"));
            question.setChoiceA(("New York"));
            question.setChoiceB(("San Francisco"));
            question.setChoiceC(("Washington"));
            question.setChoiceD(("Portland"));
            question.setAnswer(("b"));
            questions.addElement(question);
        }
        {
            Question question = new Question();
            question.setQuery(("Which city has white house?"));
            question.setChoiceA(("DC"));
            question.setChoiceB(("NYC"));
            question.setChoiceC(("SJC"));
            question.setChoiceD(("Chicago"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        return exam;
    }

}
