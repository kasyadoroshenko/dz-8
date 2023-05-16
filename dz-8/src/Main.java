public class Main {
    public static void main(String[] args) {

        Student studentFirst = new Student("Harry", "Potter");
        Student studentSecond = new Student("Ron", "Weasley");
        Student studentThird = new Student("Hermione", "Granger");
        Student studentFourth = new Student("Neville", "Longbottom");
        Student studentFifth = new Student("Luna", "Lovegood");


        StudentsGroup group = new StudentsGroup(studentFirst);

        group.addStudent(studentFirst);
        group.addStudent(studentSecond);
        group.addStudent(studentThird);
        group.addStudent(studentFourth);
        group.addStudent(studentFifth);


        group.addTask("Learn the encapsulation in Java");
        group.addTask("Do the homework");


        group.deleteStudent(studentFirst);


        group.changeHead(studentThird);


        group.renameStudent(studentSecond, new Student("Draco", "Malfoy"));


        group.deleteStudent(studentFifth);


        System.out.println(group.getHead());
        System.out.println(group.getStudents());
        System.out.println(group.getTasks());
    }

}
