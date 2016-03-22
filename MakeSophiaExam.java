

import java.util.Vector;


public class MakeSophiaExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Sophia Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What is Sophia's favorite food?"));
            question.setChoiceA(("Rice"));
            question.setChoiceB(("Pasta"));
            question.setChoiceC(("Turkey"));
            question.setChoiceD(("Salmon"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        
        {
            Question question = new Question();
            question.setQuery(("What is Sophia's favorite color?"));
            question.setChoiceA(("White"));
            question.setChoiceB(("Black"));
            question.setChoiceC(("Blue"));
            question.setChoiceD(("Red"));
            question.setAnswer(("c"));
            questions.addElement(question);
        }
        return exam;
    }

}
