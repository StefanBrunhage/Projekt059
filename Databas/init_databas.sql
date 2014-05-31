drop table if exists person;
drop table if exists lon;
drop table if exists behorighet;
drop table if exists personBehorighet;
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
	
create table personBehorighet (
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
    lonId integer PRIMARY KEY,
    pnr integer,
    datum varchar(10) NOT NULL,
    FOREIGN KEY(pnr) REFERENCES person(pnr));
	   
create table skuld (
    skuldId integer PRIMARY KEY ,
    belopp integer NOT NULL,
    datum varchar(10) NOT NULL,
    lonId integer,
    pnr integer,
    FOREIGN KEY(pnr) REFERENCES person(pnr),
    FOREIGN KEY(lonId) REFERENCES lon(lonId));
	   
create table litteratur (
    id integer PRIMARY KEY,
    ISBN varchar(13) NOT NULL,
    titel varchar(43) NOT NULL,
    forfattare varchar(43) NOT NULL,
    sprak varchar(15) NOT NULL,
    utgivningsar integer NOT NULL,
    tillganglighet boolean NOT NULL,
    kopieringsbart boolean NOT NULL,
    SABklass Varchar(20));
	   
create table lonLitteratur (
    litterturId integer,
    lonId integer,
    FOREIGN KEY(litterturId) REFERENCES litteratur(id),
    FOREIGN KEY(lonId) REFERENCES lon(lonId));
	   
	   
INSERT INTO behorighet (id, namn) VALUES (1, "Kopieringsbehorighet");
INSERT INTO roll (id, namn) VALUES (1, "Anställd");
INSERT INTO roll (id, namn) VALUES (2, "Kund");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (1, 
 "9789144017969",
 "Objektorienterad.analys.och.design",
 "Lars.Mathiassen,.Andreas.Munk-Madsen,.Peter.Axel.Nielsen,.Jan.Stage",
 "Svenska",
 2001,
 "FALSE",
 "FALSE");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (2, 
 "9781405855334",
 "Robinson.Crusoe",
 "Daniel.Defoe",
 "Engelska",
 2008,
 "TRUE",
 "FALSE");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (3, 
 "9789132160592",
 "Jorden.runt.på.80.dagar",
 "Jules.Verne",
 "Svenska",
  2012,
 "FALSE",
 "FALSE");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (4, 
 "9789164202963",
 "Hundraåringen.som.klev.ut.genom.fönstret.och.försvann",
 "Jonas.Jonasson",
 "Svenska",
  2009,
 "FALSE",
 "FALSE");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (5, 
 "9789174612097",
 "Glöm.inte.att.låsa",
 "Elizabeth.Haynes",
 "Svenska",
  2013,
 "TRUE",
 "FALSE");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (6, 
 "9780241146705",
 "No.Place.to.Hide",
 "Glenn.Greenwald",
 "Engelska",
  2014,
 "TRUE",
 "FALSE");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (7, 
 "9781471403989",
 "We.Were.Liars",
 "Emily.Jenkins",
 "Engelska",
  2014,
 "TRUE",
 "FALSE");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (8, 
 "9780241146705",
 "No.Place.to.Hide",
 "Glenn.Greenwald",
 "Engelska",
  2014,
 "FALSE",
 "FALSE");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (9, 
 "9789164202963",
 "Hundraåringen.som.klev.ut.genom.fönstret.och.försvann",
 "Jonas.Jonasson",
 "Svenska",
  2009,
 "TRUE",
 "FALSE");

INSERT INTO litteratur (id,
 ISBN,
 titel,
 forfattare,
 sprak,
 utgivningsar,
 tillganglighet,
 kopieringsbart) VALUES (10, 
 "9789164202963",
 "Hundraåringen.som.klev.ut.genom.fönstret.och.försvann",
 "Jonas.Jonasson",
 "Svenska",
  2009,
 "FALSE",
 "FALSE");

INSERT INTO person (pnr, fNamn, eNamn, teleNr, epost, roll) VALUES (19340315, 'Greta', 'Andersdotter', '0523-671', 'GretaADotter@hotmail.se', 1);
INSERT INTO person (pnr, fNamn, eNamn, teleNr, epost, roll) VALUES (19860728, 'Daniel', 'Johansson', '321-7819', 'DanielJohansson314@gmail.com', 1);
INSERT INTO person (pnr, fNamn, eNamn, teleNr, epost, roll) VALUES (20000306, 'Viktor', 'Lindberg', '6124-1230', 'Coolviktor2000@live.se', 1);
INSERT INTO person (pnr, fNamn, eNamn, teleNr, epost, roll) VALUES (19940613, 'Maria', 'Axelsson', '753-2142', 'MariaAxsson@live.com', 1);
INSERT INTO person (pnr, fNamn, eNamn, teleNr, epost, roll) VALUES (19540122, 'Karin', 'Svensson', '0421-6819', 'KarinSvensson@BibInfo.se', 2);
INSERT INTO person (pnr, fNamn, eNamn, teleNr, epost, roll) VALUES (19701111, 'Mikael', 'Berg', '051-1255', 'MikBer@CompanySoftware.com', 1);
INSERT INTO person (pnr, fNamn, eNamn, teleNr, epost, roll) VALUES (19890826, 'Alexander', 'Sandberg', '098-1627', 'AlexSandBerg89@gmail.com', 1);
INSERT INTO person (pnr, fNamn, eNamn, teleNr, epost, roll) VALUES (19960208, 'Emma', 'Eklund', '420-06123', 'EklundEmma@live.se', 1);
INSERT INTO person (pnr, fNamn, eNamn, teleNr, epost, roll) VALUES (19740420, 'Jan', 'Lundin', '0421-6822', 'JanLundin@BibInfo.se', 2);

INSERT INTO lon (lonId, pnr, datum) VALUES (1, 20000306, "2014-06-25");
INSERT INTO lonLitteratur (litterturId, lonId) VALUES (10, 1);
INSERT INTO lonLitteratur (litterturId, lonId) VALUES (8, 1);

INSERT INTO lon (lonId, pnr, datum) VALUES (2, 19940613, "2014-07-15");
INSERT INTO lonLitteratur (litterturId, lonId) VALUES (1, 2);

INSERT INTO lon (lonId, pnr, datum) VALUES (3, 19701111, "2014-06-12");
INSERT INTO lonLitteratur (litterturId, lonId) VALUES (4, 3);

INSERT INTO lon (lonId, pnr, datum) VALUES (4, 19860728, "2014-05-05");
INSERT INTO lonLitteratur (litterturId, lonId) VALUES (3, 4);

INSERT INTO skuld (skuldId, belopp, datum, lonId, pnr) VALUES (1, 50, "2014-06-10", 4, 19860728);



