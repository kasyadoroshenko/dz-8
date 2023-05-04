import java.util.ArrayList;
import java.util.List;
public class StudentsGroup {
    private Student head;
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    public StudentsGroup(Student head) {
        this.head = head;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public Student getHead() {
        return head;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void changeHead (Student newHead){
        this.head = newHead;
    }

    public void renameStudent(Student oldName, Student newName){
        int i = 0;
        for (Student student : students){
            if (student == oldName){
                students.set(i, newName);
            }
            i++;
        }
    }

    public void deleteStudent(Student name){
        int j = 0;
        for (Student student : students){
            if (student == name && name == this.head){
                System.out.println("The Head of the group cannot be removed");
                System.out.println("Please change the Head of the group first");
            } else if (student == name && name != this.head) {
                this.students.remove(j);
                break;
            }
            j++;
        }
    }
}
