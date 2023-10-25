# Banque-jpa


Objectifs 

Se renforcer dans la modélisation JPA et notamment l’utilisation des annotations relationnelles. 

Description 

- Voici le modèle UML d’une application bancaire. Nous allons créez les entités JPA et essayez de générer les tables à partir des entités. 

![Aspose Words 962700be-0906-4584-89a5-73e4da743f48 001](https://github.com/ramyozi/Banque-jpa/assets/121133584/2c64c9b3-6a68-4991-8661-1cb4ea0a4dcb)

- Créez un nouveau projet **banque-jpa** 
- Créez une nouvelle base de données **banque** 
- Convertissez-le en projet MAVEN 
  - Créez un répertoire resources 
- Dans le répertoire resources, créez le répertoire META-INF 
- Dans le répertoire META-INF, mettez en place le fichier persistence.xml 
- Valorisez la **persistence-unit** dans **persistence.xml** pour y accéder 
- Positionner la propriété suivante dans persistence.xml pour regénérer automatiquement le schema à chaque redémarrage de l’application: 

`<property name=*"javax.persistence.schema-generation.database.action"* value=*"drop-and-create"*/>`

- Créer les entités JPA suivantes et mettez en place les annotations relationnelles : 
- Banque 
- Compte 
- Operation 
- Client 

▪  Adresse (Embeddable) 

- Les tables seront générées à partir des relations définies dans votre modèle métier 
- Insérer en base de données des instances des différents objets en utilisant l’EntityManager 

Quelques propriétés utiles pour le persistence.xml : 

- Cette propriété ne créé que les nouvelles tables après chaque redémarrage: 

`<property name="hibernate.hbm2ddl.auto" value="update"/>`
