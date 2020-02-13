CREATE TABLE otherPatients{
id int not null auto_increment,
lastname varchar(50),
firstname varchar(50),
doctorId int,
Primary Key (id),
constraint DoctorFK
Foreign Key (doctorId) references doctors(id);