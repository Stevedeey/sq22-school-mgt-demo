import entity.Person;
import service.PrincipalService;
import service.impl.PrincipalServiceImpl;

public class Main {
    public static void main(String[] args) {

        //Principal operations

        Person principal = new Person("Tosin Olaleye", 34, "Lagos", Role.Teacher);
        Person applicant = new Person("Janefrancesca Ibeh", 25, "Lagos", Role.Applicant);

        PrincipalService principalService = new PrincipalServiceImpl();
        principalService.admitStudent(principal, applicant);

        Person teacher = new Person("Philip Ibeh", 27, "Lagos", Role.Teacher);
        principalService.terminateTeacherAppointment(principal, teacher);

        //some more functionalities can go here!!!
    }
}