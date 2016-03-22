

import java.util.Vector;


public class MakeChicagoExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Che Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What is Chicago popularly called?"));
            question.setChoiceA(("City"));
            question.setChoiceB(("Illinois"));
            question.setChoiceC(("Windy City"));
            question.setChoiceD(("Windy"));
            question.setAnswer(("c"));
            questions.addElement(question);
        }
        
        {
            Question question = new Question();
            question.setQuery(("What is the highest building in Chicago called?"));
            question.setChoiceA(("John Hancock Center"));
            question.setChoiceB(("Willis Tower"));
            question.setChoiceC(("Trum Hotel"));
            question.setChoiceD(("Aon Center"));
            question.setAnswer(("b"));
            questions.addElement(question);
        }
        return exam;
    }

}
