CREATE TABLE student (
  id int(10) NOT NULL AUTO_INCREMENT,
  name varchar(50),
  PRIMARY KEY (id)
);


CREATE TABLE student_course (
  course_id int(10) NOT NULL,
  student_id int(10) NOT NULL,
  score int(10) 
  );


CREATE TABLE course (
  id int(10) NOT NULL AUTO_INCREMENT,
  name varchar(50) ,  
  PRIMARY KEY (id)
  ) ;

  