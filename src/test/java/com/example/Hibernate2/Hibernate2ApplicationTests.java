package com.example.Hibernate2;

import com.example.Hibernate2.associations.Customer;
import com.example.Hibernate2.associations.PhoneNumber;
import com.example.Hibernate2.entities.*;
import com.example.Hibernate2.manytoone.Programmer;
import com.example.Hibernate2.manytoone.Project;
import com.example.Hibernate2.onetoone.License;
import com.example.Hibernate2.onetoone.Person;
import com.example.Hibernate2.repos.CustomerRepository;
import com.example.Hibernate2.repos.LicenseRepository;
import com.example.Hibernate2.repos.ProgrammerRepository;
import com.example.Hibernate2.repos.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class Hibernate2ApplicationTests {

	@Autowired
	LicenseRepository licenseRepo;

	@Test
	void createLicense() {
		License license = new License();
		license.setType("CAR");
		license.setValidfrom(new Date());
		license.setValidTo(new Date());

		license.setPerson(new Person("SHREYA", "GUPTA", 21));
		licenseRepo.save(license);
	}











//	@Autowired
//	ProgrammerRepository programmerRepository;
//
//	@Test
//	public void testmtomCreateProgrammer(){
//		Programmer programmer= new Programmer();
//		programmer.setName("Ron");
//		programmer.setSal(10000);
//
//		HashSet<Project> projects = new HashSet<Project>();
//		Project project = new Project();
//		project.setName("Hibernate Project");
//		projects.add(project);
//
//		programmer.setProjects(projects);
//
//		programmerRepository.save(programmer);
//	}

//	@Test
//	public void testmtomFindProgrammer(){
//		programmerRepository.findOne(1);
//	}











//	@Autowired
//	CustomerRepository crepository;
//
//	@Test
//	public void contextLoad(){
//
//	}
//
//	@Test
//	public void testCreateCustomer(){
//		Customer customer = new Customer();
//		customer.setName("Jett");
//		//HashSet<PhoneNumber> numbers= new HashSet<PhoneNumber>();
//
//		PhoneNumber ph1=new PhoneNumber();
//		ph1.setNumber("895493893");
//		ph1.setType("cell");
//
//		//ph1.setCustomer(customer);   way of adding FK
//
//		//numbers.add(ph1);
//
//		PhoneNumber ph2=new PhoneNumber();
//		ph2.setNumber("993493893");
//		ph2.setType("cell");
//
//		//ph2.setCustomer(customer);
//
//		//numbers.add(ph2);
//
//		//customer.setNumbers(numbers);
//
//
//		customer.addPhoneNumber(ph1);
//		customer.addPhoneNumber(ph2);
//
//		crepository.save(customer);
//	}







//	@Test
//	public void testLoadCustomer(){
//		Customer customer= crepository.findOne(4L);
//
//		Set<PhoneNumber> numbers= customer.getNumbers();
//		numbers.forEach(number-> System.out.println(number.getNumber()));
//	}
//
//	@Test
//	public void testUpdateCustomer(){
//		Customer customer= crepository.findOne(4L);
//		customer.setName("Ram Sharmsa");
//
//		Set<PhoneNumber> numbers= customer.getNumbers();
//		numbers.forEach(number-> number.setType("cell"));
//
//		crepository.save(customer);
//	}










//	@Autowired
//	UserRepository repository;
//
//	@Test
//	public void contextLoad(){
//
//	}
//
//	@Test
//	public void testCreate(){
//		User employee= new User();
//		employee.setId(12);
//		employee.setName("joh");
//		Address address = new Address();
//		address.setCity("Austin");
//		address.setStreetAddress("Springwood");
//		address.setCountry("USA");
//		address.setState("TEXAS");
//		address.setZipcode("7850");
//		employee.setAddress(address);
//
//		repository.save(employee);
//	}





//	@Autowired
//	PaymentRepository repository;
//	@Test
//	public void contextLoads(){
//
//	}
//
//	@Test
//	public void createPayment(){
//		CreditCard cc= new CreditCard();
//		cc.setId(123);
//		cc.setAmount(1000d);
//		cc.setCardnumber("123456");
//		repository.save(cc);
//	}
//
//	@Test
//	public void createCheckPayment(){
//		Check ch= new Check();
//		ch.setId(124);
//		ch.setAmount(1000d);
//		ch.setChecknumber("123456");
//		repository.save(ch);
//	}




	
//	@Autowired
//	StudentRepository repository;
//
//	@Test
//	public void testStudentCreate() {
//		Student student = new Student();
//		student.setFirstName("John");
//		student.setLastName("Sharma");
//		student.setScore(88);
//
//		Student student2 = new Student();
//		student2.setFirstName("Bill");
//		student2.setLastName("Gates");
//		student2.setScore(75);
//
//		Student student3 = new Student();
//		student3.setFirstName("Bill");
//		student3.setLastName("Jain");
//		student3.setScore(65);
//
//		repository.save(student);
//		repository.save(student2);
//		repository.save(student3);
//	}
//
//
//	@Test
//	public void testfindAllStudents(){
//		System.out.println(repository.findAllStudents(PageRequest.of(0,2, Sort.Direction.ASC,"id")));
//	}
//
//	@Test
//	public void testfindAllStudentsPartial(){
//		List<Object[]> partialData = repository.findAllStudentsPartialData();
//		for(Object[] objects: partialData)
//		{
//			System.out.println(objects[0]);
//			System.out.println(objects[1]);
//		}
//
//	}
//
//	@Test
//	public void testfindAllStudentsByFirstName(){
//		System.out.println(repository.findAllStudentsByFirstName("John"));
//	}
//
//	@Test
//	public void testfindAllStudentsByScores(){
//		System.out.println(repository.findStudentForGivenScores(70,80));
//	}
//
//	@Transactional
//	@Test
//	@Rollback(false)
//	public void testDeleteStudentsByFirstName(){
//		repository.deleteStudentsByFirstName("Bill");
//	}
//
//	@Test
//	void testgetbyfnameNQ(){
//		repository.getStudentbyfnameNQ("Bill").forEach(ele-> System.out.println(ele));
//	}

}
