package pl.mj.olaf;

import org.hibernate.Session;
import pl.mj.olaf.dao.StudentDao;
import pl.mj.olaf.menu.LoginMenu;
import pl.mj.olaf.model.Student;
import pl.mj.olaf.util.HibernateUtil;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LoginMenu loginMenu = new LoginMenu();

        StudentDao studentDao = new StudentDao();

//        Student student = new Student("Na", "Ra", "ram.pa@ta.com", LocalDate.of(1999,1,1));


//        studentDao.saveStudent(student);
        for (Student student : studentDao.getStudents()) {
            System.out.println(student.getId());
        }



        loginMenu.showLoginMenu();
        boolean login = loginMenu.getMenuChoice();
        if (login){
            System.out.println("login");
        }

    }
}
