---------- * DELETE DATA

--delete from joueur where upper(idStringJoueur) = "SPRINGBOOTMYSQL" ;
--delete from equipe where upper(idStringEquipe) = "SPRINGBOOTMYSQL" ;

---------- * DROP TABLES
--use sokka;

SET foreign_key_checks = 0;
drop table IF EXISTS equipe_categorie;
drop table IF EXISTS equipe_joueur;
drop table IF EXISTS equipe;
drop table IF EXISTS joueur;
drop table IF EXISTS tempsfort;
drop table IF EXISTS actions;
drop table IF EXISTS categorie;
drop table IF EXISTS matchs;
drop table IF EXISTS terrain;
SET foreign_key_checks = 1;



---------- JOUEUR
INSERT INTO joueur(emailJoueur,  pwdJoueur,  idStringJoueur,
pseudoJoueur,  nomJoueur, prenomJoueur,
scoreEloJoueur,  scoreFairPlayJoueur,
dateDebutJoueur,dateFinJoueur,  estSupprime)
VALUES
("joueur_1@sokka.fr","pwd_1","springBootMysql",
"pseudo_1","joueur_1","prenom_1",
1500,1000,
SYSDATE(),null,false),

("joueur_2@sokka.fr","pwd_2","springBootMysql",
"pseudo_2","joueur_2","prenom_2",
1500,1000,
"2019-11-24 11:44:11.000000",null,false);

---------- EQUIPE
INSERT INTO equipe (idStringEquipe, nomEquipe, estDispoPourMatch,
dateDebutEquipe, dateFinEquipe, estSupprime)
VALUES
("springBootMysql","equipe_1",true,"2019-11-24",null,false),
("springBootMysql","equipe_2",true,"2018-11-24",null,false);


---------- ACTIONS
INSERT INTO actions (nomAction)
VALUES 
("but"),
("carton jaune"),
("carton rouge"),
("faut"),
("penalty");

---------- CATEGORIE
INSERT INTO categorie (nomCategorie)
VALUES ("7/7"),("5/5"),("11/11");

