<h4>Realisée par : ELFADILI ZOUBAIR</h4>
<h1>Activité Projet JEE - Spring Angular Spring Security JWT</h1>
<h3>Objectif</h3>
Créer une application qui permet de gérer des comptes bancaires. chaque compte appartient à un client. un compte peut subir plusieurs opérations de type DEBIT ou CREDIT. Il existe deux types de comptes : Comptes courants et comptes épargnes.
<h3>Introduction</h3>
On veut faire une application Web avec Spring et Angular pour gérer des comptes bancaires. 
Chaque compte appartient à un client et il peut être de deux types : Courant ou Épargne. On peut effectuer des opérations de Débit ou Crédit sur chaque compte.

L'application est composée de plusieurs parties :
        <h6>La couche DAO, qui gère les entités JPA et les repositories</h6>
        <h6>La couche Service, qui a des opérations comme ajouter des clients, ajouter des comptes, effectuer un retrait (débit), effectuer un virement, et consulter un compte</h6>
        <h6>La couche DTO, qui a des mappers pour convertir entre les DTO et les entités</h6>

<h4>Architecture</h4>
<h5>Spring MVC Architecture Rendu HTML coté serveur</h5>
![arch1](https://github.com/ZOUBAIRELFADILI/E-Bank_Project/assets/85462383/585ec810-3dc5-4ce9-ad3c-10d26f13bd7f)

<h5>Spring MVC Architecture Rendu HTML coté client</h5>
![Arch2](https://github.com/ZOUBAIRELFADILI/E-Bank_Project/assets/85462383/01f7118c-d074-493c-9ebe-db64039a0941)

<h5>Architecture Web Rendu HTML coté client</h5>
![Arch3](https://github.com/ZOUBAIRELFADILI/E-Bank_Project/assets/85462383/3a17bcaa-4476-4843-8d80-9ad442f05f9e)

<h3>Back-End</h3>
<h4>Cree et Test La Couche DAO</h4>
<h5>Les Entités</h5>
![AccountOperation](https://github.com/ZOUBAIRELFADILI/E-Bank_Project/assets/85462383/7595fa9e-437b-439b-aac3-ec584354f66d)
<br>
![BankAccount](https://github.com/ZOUBAIRELFADILI/E-Bank_Project/assets/85462383/8cb4f37a-7b8b-4fbb-a783-48c27bab78f3)
<br>
![Customer](https://github.com/ZOUBAIRELFADILI/E-Bank_Project/assets/85462383/0fef94f0-292c-4725-92ca-387b820f640f)
<br>

![SavingAccount](https://github.com/ZOUBAIRELFADILI/E-Bank_Project/assets/85462383/e510266d-42e9-4efd-ae1c-a98766da5668)
<br>

![CurrentAccount](https://github.com/ZOUBAIRELFADILI/E-Bank_Project/assets/85462383/7427c94a-b0c8-4929-b918-ee9feeff6a42)



 
 
