// We use default unnamed package


/*
AP ID: 1X91VY24
Initials: A.M.
*/

import java.util.ArrayList;

public class MusicSchool {
    // lessonList guaranteed not to contain null entries
    private ArrayList<Lesson> lessonList;

    public void updateCosts(double piano, double voice, double reg) {
        for (Lesson l : lessonList) {
            String lessonType = l.getType();
            if (lessonType.equals("piano")) {
                l.setCost(l.getCost() + piano);
            } else if (lessonType.equals("voice")) {
                l.setCost(l.getCost() + voice);
                // else is allowed here because there are no null entries
            } else {
                l.setCost(l.getCost() + reg);
            }
        }
    }

    public double getDiscountedLessonCost(double discount) {
        // check precondition: at least one lesson meets eligibility requirements
        ArrayList<Integer> eligibleIndices = new ArrayList<>();
        for (int i = 0; i < lessonList.size(); i++) {
            Lesson lesson = lessonList.get(i);
            if (lesson.getType().equals("piano") && isRegEarly(lesson)) {
                eligibleIndices.add(i);
            }
        }
        int discountIndex = (int) (Math.random() * eligibleIndices.size());
        Lesson eligibleLesson = lessonList.get(discountIndex);
        eligibleLesson.setCost(eligibleLesson.getCost() - discount);
        return eligibleLesson.getCost();
    }

    /** Part c)
     Method header:
     public String getInstructorWithMostLessons
     The Lesson class would need a private String called instructor, that contains its instructor,
     and a public String getInstructor(), which would be the getter for the instructor. The MusicSchool
     class would remain the same.
     */
}
