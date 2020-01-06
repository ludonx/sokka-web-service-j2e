# sokka-web-service-j2e
Projet de fin d'étude : développement d'une API

Spring Boot - JPA - hibernate - MySQL 

## UTILISER L'API
>host local : http://localhost
>host distant :
>port : 8080
>BASE_URL : /sokka/api/v1/services

- Comment consulter l'API ?
    {host local}:{port}/{TABLE}/{METHODE}


- EXEMPLE :

    * http://localhost:8080/sokka/api/v1/services/joueur/equipe/1
    * http://localhost:8080/sokka/api/v1/services/joueur/all
    * http://localhost:8080/sokka/api/v1/services/joueur/equipe/add?idJoueur=1&idEquipe=2


- METHODE
    * GET

    | TABLE | GET                   | Description               | 
    | ----  | ----                  | ----                      |
    |joueur	| /all                  | liste des joueurs         |
    |joueur	| /{id}                 | joueur qui a l'id x       |
    |joueur	| /equipe/{id}          | liste des joueurs de l'equipe d'id x |
    |    	| ----                  | ----                      |
    |equipe	| /all                  | liste des equipes         |
    |equipe	| /{id}                 | equipe qui à l'id x       |
    |equipe	| ----                  | ----                      |

    * POST

    | TABLE | POST                  | Description               | 
    | ----  | ----                  | ----                      |
    |joueur	| /add                  | ajouter un joueur format `json`  |
    |joueur	| /equipe/add           | ajouter un joueur dans une equipe `param` |
    |    	| ----                  | ----                      |
    |equipe	| /add                  | ajouter une equipe        |
    |equipe	| ----                  | ----                      |
    |equipe	| ----                  | ----                      |

##  EXECUTER L'API EN LOCAL avec le fichier JAR  (vous avez juste besoin du fichier .jar):

0. sokka/target/sokka-0.0.1-SNAPSHOT.jar
1. avoir Mysql 
2. avoir JDK
3. aller sur google (execute a jar file on linux (or windows) ) 
4. ajouter des données pour faire des testes ( vous pouvez utiliser le fichier data-mysql.sql dans le repertoire ..../resources/data-mysql.sql)

* [Export jar](https://www.youtube.com/watch?v=qDTUYkaXAEc).
* [Execute jar Ubuntu](https://askubuntu.com/questions/101746/how-can-i-execute-a-jar-file-from-the-terminal)