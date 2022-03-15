# Projet LAMBA
_( BIHAR - IT University)_

[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)  [![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)

Le projet LAMBA est consiste à mettre en place une application web/mobile de vente. Sur la page d'accueil du site, vous pourrez voir une bannière où les publicités sponsorisées se placeront, vous pourrez aussi voir le top 5 des produits les plus vendus et encore d'autre choses à découvrir.

## Pour commencer

Entrez ici les instructions pour bien débuter avec le projet...

### Pré-requis

Ce qu'il est requis pour commencer avec le projet...

- OpenJDK 1.8
- Intellij (community ou student ou pro version)
- de la bonne volonté

### Documentation de l'API
Les API RESTful se basent sur le protocole HTTP pour transférer les informations – le même protocole sur lequel la communication web est fondée.
Les domaines manipulisable au niveau de l'API sont :
- utilisateurs
- produits
- publicites
- images

| Domaine    	| Methode 	| Description                                        	  | URL             	|   	|
|------------	|---------	|-------------------------------------------------------|-----------------	|---	|
| ${domaine} 	|   GET   	| Affiche la liste de tous les ${domaine} du système 	  | /api/${domaine} 	|   	|
| ${domaine} 	|   POST  	| Créé un ${domaine} dans le système                  	 | /api/${domaine} 	|   	|
| ${domaine} 	|   PUT   	| Modifie l'information d'un ${domaine}              	  | /api/${domaine} 	|   	|
| ${domaine} 	| DELETE  	| Supprime un ${domaine}du système                   	  | /api/${domaine} 	|   	|