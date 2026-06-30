

class UniversityMember {

    public void attendLecture() {
        System.out.println("Attending a lecture");
    }
}

interface Researcher {

    void conductLabResearch();
}

class UnderGraduateStudent extends UniversityMember {

}

class GraduateResearchAssistent extends UniversityMember implements Researcher {

    public void conductLabResearch() {
        System.out.println("Publishing papers and running experiments.");
    }
}

class Professor extends UniversityMember implements Researcher {

    public void conductLabResearch() {
        System.out.println("Leading advance research projects.");
    }
}

public class Main5 {

    public static void main(String[] args) {
        UniversityMember student = new UnderGraduateStudent();
        UniversityMember gra = new GraduateResearchAssistent();
        UniversityMember professor = new Professor();
        student.attendLecture();
        gra.attendLecture();
        professor.attendLecture();
        ((Researcher) gra).conductLabResearch();
        ((Researcher) professor).conductLabResearch();
    }
}
