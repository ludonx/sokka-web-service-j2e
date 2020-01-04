delete from joueur where upper(idStringJoueur) = "SPRINGBOOTMYSQL" ;
delete from equipe where upper(idStringEquipe) = "SPRINGBOOTMYSQL" ;
---------- JOUEUR
INSERT INTO joueur(emailJoueur,  pwdJoueur,  idStringJoueur,
pseudoJoueur,  nomJoueur, prenomJoueur,
scoreEloJoueur,  scoreFairPlayJoueur,
dateDebutJoueur,dateFinJoueur,  estSupprimer)
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
dateDebutEquipe, dateFinEquipe, estSupprimer)
VALUES
("springBootMysql","equipe_1",true,"2019-11-24",null,false),
("springBootMysql","equipe_2",true,"2018-11-24",null,false);

