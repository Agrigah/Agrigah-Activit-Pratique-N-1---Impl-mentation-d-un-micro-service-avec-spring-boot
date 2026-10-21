# 🏦 Application Bancaire avec Spring Boot

## 📌 Présentation

Ce projet consiste à développer une application bancaire avec **Spring Boot**, permettant de gérer des comptes bancaires à travers des API REST et GraphQL.

L'application adopte une architecture en couches afin de séparer les responsabilités et de faciliter la maintenance et l'évolution du code.

## 🎯 Objectifs

- Développer une API REST avec Spring Boot.
- Modéliser les entités bancaires.
- Gérer les différents types de comptes.
- Utiliser des DTO pour structurer les données échangées.
- Implémenter une couche Repository pour l'accès aux données.
- Séparer la logique métier dans la couche Service.
- Exposer les fonctionnalités via REST et GraphQL.
- Gérer les exceptions et préparer les tests.

## 🛠️ Technologies utilisées

- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **GraphQL**
- **Maven**
- **JUnit** pour les tests

*Les dépendances exactes dépendent de la configuration du projet.*

## 📂 Structure du projet

```text
src/
└── main/
    ├── java/
    │   └── ...
    │       ├── entities/
    │       ├── dto/
    │       ├── mapper/
    │       ├── repository/
    │       ├── service/
    │       ├── web/
    │       └── exceptions/
    └── resources/
        └── application.properties
```

## ⚙️ Prérequis

Avant de lancer le projet, installez :

- JDK compatible avec la configuration Maven du projet.
- Maven, ou utilisez le Maven Wrapper inclus.
- Un IDE comme IntelliJ IDEA ou Eclipse (facultatif).

## 🚀 Installation et lancement

### 1. Cloner le dépôt

```bash
git clone https://github.com/Agrigah/Agrigah-Activit-Pratique-N-1---Impl-mentation-d-un-micro-service-avec-spring-boot.git
```

### 2. Accéder au projet

```bash
cd Agrigah-Activit-Pratique-N-1---Impl-mentation-d-un-micro-service-avec-spring-boot
```

### 3. Lancer les tests

Sous Windows :

```powershell
.\mvnw.cmd test
```

Sous Linux ou macOS :

```bash
./mvnw test
```

### 4. Démarrer l'application

Sous Windows :

```powershell
.\mvnw.cmd spring-boot:run
```

Sous Linux ou macOS :

```bash
./mvnw spring-boot:run
```

## 🔌 API

L'application prévoit deux modes d'accès :

- **REST** : endpoints HTTP pour accéder aux fonctionnalités bancaires.
- **GraphQL** : requêtes et mutations pour interagir avec les données bancaires.

Les routes et les opérations disponibles dépendent des contrôleurs et du schéma GraphQL définis dans le projet.

## 🧪 Tests

Les tests peuvent être exécutés avec Maven :

```bash
.\mvnw.cmd test
```

## 👩‍💻 Auteur

**Aya Agrigah**

Projet réalisé dans le cadre d'une activité pratique de développement avec Spring Boot.

## 📄 Licence

Projet pédagogique. Aucune licence spécifique n'est définie pour le moment.
