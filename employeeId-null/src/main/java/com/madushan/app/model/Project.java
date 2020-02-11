package com.madushan.app.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String name;

	@ManyToMany(mappedBy = "projects")
	List<Employee> employees;
}
