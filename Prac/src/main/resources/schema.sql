--https://teachingprogramming.net/archives/229 @OneToMany,@ManyToOne
/*
drop table user;
drop table userprofile;
drop table rooms;
drop table roomsUsers;

*/
create table if not exists user(
	id integer not null auto_increment,
	userid varchar(255) not null,
	password varchar(255) not null,
	role varchar(255) not null,
	primary key (id),
	foreign key (userid)
	REFERENCES userprofile(user_id)
	REFERENCES roomsUsers(user)
)

create table if not exists userprofile(
	user_id varchar(255) not null,
	nickname varchar(255),
	primary key(user_id)
)

create table if not exists rooms(
	roomId integer not null auto_increment,
	roomName varchar(255) not null,
	foreign key (roomId)
	references roomsUsers(room)
)
create table if not exists roomsUsers(
	id integer not null auto_increment,
	user varchar(255) not null,
	room integer not null,
	primary key(user,room)
)