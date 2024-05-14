package service;

import entity.Person;

public interface PrincipalService {
    void admitStudent(Person principal, Person applicant);
    String terminateTeacherAppointment(Person principal, Person teacher);
}
