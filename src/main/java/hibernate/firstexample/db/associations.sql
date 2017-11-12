USE `hibernatetutorial`; 
drop table if exists student;
drop table if exists guide;
drop table if exists customer;
drop table if exists passport;

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

CREATE TABLE `passport` ( 
`id` BIGINT(20) NOT NULL AUTO_INCREMENT, 
`passport_number` varchar(255) NOT NULL unique,
 PRIMARY KEY (`id`) 
);

CREATE TABLE `customer` ( 
`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255) NOT NULL,
`passport_id` BIGINT(20) NOT NULL,
 PRIMARY KEY (`id`),
 FOREIGN KEY (passport_id) REFERENCES passport(id)
);