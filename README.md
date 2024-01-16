# Gestion des Pharmacies de Garde

## Description
Projet Spring MVC Thymeleaf pour la gestion des pharmacies de garde. 
Permet de suivre les informations sur les pharmacies de garde,
y compris les détails sur les pharmacies et les gardes planifiées.

## Technologies Utilisées
- Java
- Spring MVC
- Thymeleaf
- HTML
- CSS
- JavaScript
- MySQL 

## Dockerisation
Le projet prend en charge la dockerisation pour faciliter le déploiement. Suivez ces étapes pour exécuter l'application dans un conteneur Docker.

### 1. Clonez le dépôt
   *git clone https://github.com/adnan-khadija/PharmacieGarde.git*




### 2.Accédez au répertoire du projet
Copy code *cd nom-du-repertoire*

**Build de l'image Docker**

Copy code,
*docker-compose build*.

**Lancez le conteneur Docker**

Copy code,
*docker-compose up*.

L'application sera accessible à l'adresse : http://localhost:8089

## Installation en Mode Local

Si vous préférez exécuter l'application en dehors d'un conteneur Docker, suivez ces étapes.

**Configurez la base de données**

Créez une base de données MySQL appelée garde

Mettez à jour les informations d'accès à la base de données dans le fichier *application.properties*.

**Build et lancez l'application**

L'application sera accessible à l'adresse : http://localhost:8089.

**Fonctionnalités**

1.Liste des pharmacies avec leurs détails.
2.Gestion des gardes planifiées pour chaque pharmacie.
3.Interface conviviale avec Thymeleaf.
4.Utilisation de DataTables pour afficher les données de manière interactive.


## Sonarqube Test

![image](https://github.com/adnan-khadija/PharmacieGarde/assets/147508009/26b7ebfd-728f-4969-9b92-effd556e18d8)



![image](https://github.com/adnan-khadija/PharmacieGarde/assets/147508009/70abc13b-48f1-44ca-b915-236ea356037e)


## Base de donnés:

![image](https://github.com/adnan-khadija/PharmacieGarde/assets/147508009/f4e6683c-8145-4bd1-9be3-c41fc767472d)

## Vidéo de démonstration

**Administrateur**

https://github.com/adnan-khadija/Gestion-Pharamcie/assets/147508009/49ead2bf-a873-40ab-b687-897dab2e4da5


**Pharmacien**


https://github.com/adnan-khadija/Pharmacie_Garde/assets/147508009/7c068fc2-3b9c-48b1-8e68-fa635dfa6025


**Client**


https://github.com/adnan-khadija/Pharmacie_Garde/assets/147508009/ed9074ec-1d84-4f5c-b63f-9b94e409c08a



