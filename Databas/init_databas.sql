drop table if exists person;
drop table if exists lon;
drop table if exists behorighet;
drop table if exists personbehorighet;
drop table if exists skuld;
drop table if exists litteratur;
drop table if exists lonlitteratur;
drop table if exists roll;



create table person (
	pnr integer PRIMARY KEY,
	fNamn varchar(50) NOT NULL,
	eNamn varchar(50) NOT NULL,
        teleNr integer NOT NULL,
        epost varchar(60),
	roll integer,
	FOREIGN KEY(roll) REFERENCES roll(id) );
	
create table personbehorighet (
	pnr integer,
	behorighet integer,
	FOREIGN KEY(pnr) REFERENCES person(pnr),
    FOREIGN KEY(behorighet) REFERENCES behorighet(id));	
	
create table behorighet(
	id integer PRIMARY KEY,
	namn varchar(50) NOT NULL);

create table roll (
	namn varchar(50) NOT NULL,
	id integer PRIMARY KEY);
	
create table lon (
	lonid integer PRIMARY KEY,
	pnr integer,
	datum varchar(10) NOT NULL,
	FOREIGN KEY(pnr) REFERENCES person(pnr));
	   
create table skuld (
	skuldid integer PRIMARY KEY ,
	role integer NOT NULL,
	datum varchar(10) NOT NULL,
	lonid integer,
	FOREIGN KEY(lonid) REFERENCES lon(lonid));
	   
create table litteratur (
	id integer PRIMARY KEY,
	ISBN varchar(10) NOT NULL,
	titel varchar(43) NOT NULL,
	forfattare varchar(43) NOT NULL,
	sprak varchar(15) NOT NULL,
	utgivningsar integer NOT NULL,
	tillganglighet boolean NOT NULL,
	kopieringsbart boolean NOT NULL
);
	   
create table lonlitteratur (
	litterturid integer,
	lonid integer,
	FOREIGN KEY(litterturid) REFERENCES litteratur(id),
	FOREIGN KEY(lonid) REFERENCES lon(lonid));
	   
	   

