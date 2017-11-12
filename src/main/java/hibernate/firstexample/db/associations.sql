-- USE `hibernatetutorial`; 
-- drop table guide;
-- drop table student;

CREATE TABLE `guide` ( 
`guide_id` BIGINT(20) NOT NULL AUTO_INCREMENT, 
`staff_id` varchar(255) NOT NULL,
`name` VARCHAR(255) NOT NULL,
`salary` INT,
 PRIMARY KEY (`guide_id`) 
);

CREATE TABLE `student` ( 
`student_id` BIGINT(20) NOT NULL AUTO_INCREMENT, 
`enrollment_id` VARCHAR(255) NOT NULL,
`name` VARCHAR(255) NOT NULL,
`guide_id` BIGINT(20),
 PRIMARY KEY (`student_id`),
 FOREIGN KEY (guide_id) REFERENCES guide(guide_id)
);