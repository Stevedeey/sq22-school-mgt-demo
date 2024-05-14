package service.impl;

import entity.Person;
import enums.Role;
import service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {

    @Override
    public void admitStudent(Person principal, Person applicant) {
        if (isEligible(applicant)) {
            applicant.setRole(Role.Student);
            System.out.println("Congratulations " + applicant.getName() + " on your admission");
            System.out.println("Your Details " + applicant);
        }
    }

    private boolean isEligible(Person applicant) {
        int applicantScore = applicant.getApplicantScore();
        int applicantAge = applicant.getAge();

        boolean isUnderScore = applicantScore < 250;
        boolean isUnderAge = applicantAge < 18;

        if (isUnderScore) {
            System.out.println("Your score is too low, You can't be admitted");
        }

        if (isUnderAge) {
            System.out.println("You must be over 18 before getting admission");
        }

        return !isUnderScore && !isUnderAge;
    }

    @Override
    public String terminateTeacherAppointment(Person principal, Person teacher) {
        return "Dear MR/Mrs "+ teacher.getName() + "Your appointment is hereby terminated "+ "by " + principal.getName();
    }
}
