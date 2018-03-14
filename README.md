# eCommerce Managers Login App

App creata per permettere ai Responsabili dei vari dipartimenti del sito commerciale di poter loggare. 
Attraverso il JDBC, s'interroga il database e_commerce, andando a cercare nella tabella Responsabili le credenziali d'accesso; in caso di Login esatto, verrà aperta la pagina browser con la schermata relativa al Responsabile; in caso errato, si verrà reindirzzati alla pagina di Login/Registrazione del sito.

Il sito e_commerce è hostato su: "localhost:3306/e_commerce", con utilizzo di Xampp(Apache e Mysql) dove nella cartella htdocs risiede la cartella e_commerce con tutto il sito. La repository con tutti i file del sito ed anche il codice SQL è qui: https://github.com/AlMax/eCommerce.

Info sui problemi d'esecuzione:
La cartella "dist/lib" contiene il file Jar per poter utilizzare i metodi di MySqlConnector; importate il file jar se necessario, con NetBeans molte volte dà errori.
