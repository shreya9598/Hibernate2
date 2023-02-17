package com.example.Hibernate2.repos;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Hibernate2.entities.Student;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long>{
    @Query("from Student")    //select * from student
    List<Student> findAllStudents(Pageable pageable);


    @Query("select st.firstName,st.lastName from Student st")
    List<Object[]> findAllStudentsPartialData();


    @Query("from Student where firstName=:firstName")
    List<Student> findAllStudentsByFirstName(@Param("firstName" ) String firstName);

    @Query("from Student where score>:min and score<:max")
    List<Student> findStudentForGivenScores(@Param("min" ) int min, @Param("max") int max);

    @Modifying      //select queries can run without this bt insert update delte require this
    @Query("delete from Student where firstName =: firstName")
    void deleteStudentsByFirstName(@Param("firstName") String firstName);

    //native queries
    @Query(value ="select * from student", nativeQuery = true)    //select * from student
    List<Student> findAllStudentsNativeQuery(Pageable pageable);

//    @Query(value="select * from student where fName=:firstName, nativeQuery = true)
//    List<Student> findByfirstNQ();
    @Query(value = "select * from student where first_name = :firstName",nativeQuery = true)
    List<Student> getStudentbyfnameNQ(@Param("firstName") String firstname);


}
