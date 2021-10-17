import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         *  Mock data for students taking a single module
         */

        // mock students
        Student s1 = new Student("Sam", 21, "01-01-1999", 1111);
        Student s2 = new Student("Gene", 16, "11-01-2000", 1112);
        Student s3 = new Student("Luis", 26, "01-06-1999", 1113);
        List<Student> students= new ArrayList<Student>(Arrays.asList(s1, s2, s3));

        // mock modules
        Module m1 = new Module("Software engineering III", "CT417");
        Module m2 = new Module("Linear Algebra", "MA203");
        List<Module> modules= new ArrayList<Module>(Arrays.asList(m1, m2));

        // mock course(s)
        Course c1 = new Course("CS & IT", "2021-09-06", "2022-05-17");
        List<Course> courses = new ArrayList<Course>(Arrays.asList(c1));

        // adding students to modules
        for(Module m : modules){
            m.setStudentList(students);
        }

        // adding modules to course
        c1.setModuleList(modules);

        for (Student s : students){
            s.setModuleList(modules);
            s.setCourseList(courses);
        }

        // print out courses and their respective modules
        for (Course c : courses){
            System.out.println("-----"+c.getCourseName()+"-----");
            for (Module m : c.getModuleList()){
                System.out.println(m.getModuleName()+"\t");
            }
            System.out.println("----------");
        }

        // print out all students with their usernames, assigned modules and course(s)
        for (Student s : students){
            System.out.println("====="+s.getName()+"=====");
            System.out.println("Username: "+s.getUsername());
            System.out.println("Course(s): "+s.getCourseList());
            System.out.println("Modules: "+s.getModuleList());
            System.out.println("==========");
        }
    }
}
