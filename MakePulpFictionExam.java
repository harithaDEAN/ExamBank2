

import java.util.Vector;


public class MakePulpFictionExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Pulp Fiction Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What do they call a Quarter Pounder with Cheese in Parise?"));
            question.setChoiceA(("Royale with Cheese."));
            question.setChoiceB(("Le Quarter Pounder."));
            question.setChoiceC(("This is not the correct answer."));
            question.setChoiceD(("???"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        
        {
            Question question = new Question();
            question.setQuery(("What language do you speak?"));
            question.setChoiceA(("English"));
            question.setChoiceB(("Spanish"));
            question.setChoiceC(("French"));
            question.setChoiceD(("Chinese"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        return exam;
    }

}
