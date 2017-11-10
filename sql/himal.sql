create table application_users
(
	application_user_id integer auto_increment,
	application_user_name	varchar(200),
	applicaton_user_first_name varchar(200),
	application_user_last_name varchar(200),
	application_user_role varchar(200),
	created_date_time timestamp,
	last_update_date_time timestamp,
	last_updated_by varchar(200),
	primary key(application_user_id)
);

create table equipment
(
	equipment_id integer auto_increment,
	equipment_name varchar(200),
	equipment_description varchar(500),
	equipment_location varchar(200),
	equipment status varchar(200),
	equipment_combo_id integer,
	created_date timestamp,
	last_update_date timestamp,
	last_updated_by varchar(200),
);


create table student
(
	student_id integer auto_increment,
	student_user_id varchar(200),
	student_first_name varchar(200),
	student_last_name varchar(200),
	created_date timestamp,
	last_update_date timestamp,
	last_updated_by varchar(200),
	primary key(student_id)
);


create table checkOutIn
(
	checkoutIn_id integer auto_increment,
	equipment_id integer,
	equipment_combo_id integer,
	equipment_name varchar(200),
	equipment_description varchar(500),
	equipment_status varchar(200),
	student_id integer,
	checkout_date_time timestamp,
	checked_out_by varchar(200),
	checkin_date_time timestamp,
	checkin_by varchar(200),
	created_date timestamp,
	last_update_date timestamp,
	last_updated_by varchar(200)
);
